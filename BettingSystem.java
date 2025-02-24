class BettingSystem {
    private double moneyInserted;

    public BettingSystem() {
        moneyInserted = 0.0;
    }

    // Добавяне на залог
    public void placeBet(double amount) {
        if (amount > 0) {
            moneyInserted = amount;
            System.out.println("Заложихте " + amount + " лв.");
        } else {
            System.out.println("Невалиден залог.");
        }
    }

    // Проверка за печалба
    public void checkBet(Horse selectedHorse, Horse winningHorse) {
        if (selectedHorse.getName().equals(winningHorse.getName())) {
            double winnings = moneyInserted * selectedHorse.getOdds();

            String formattedWinnings = String.format("%.2f", winnings);
            System.out.println("Поздравления! Вашият кон спечели! Печалба: " + formattedWinnings + " лв.");
        } else {
            System.out.println("Вашият кон загуби. Опитайте отново!");
        }
    }
}

