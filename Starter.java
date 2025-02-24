import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HorseRace race = new HorseRace();
        BettingSystem bettingSystem = new BettingSystem();

        System.out.println("Добре дошли в системата за залози за конни надбягвания!");

        // Показваме наличните коне
        race.displayHorses();

        // Избиране на кон
        System.out.print("Изберете номер на кон: ");
        int choice = scanner.nextInt();
        Horse selectedHorse = race.chooseHorse(choice);

        if (selectedHorse != null) {
            System.out.println("Вие избрахте: " + selectedHorse.getName() + " - коефициент: " + selectedHorse.getOdds());

            // Поставяне на залог
            System.out.print("Въведете сума за залог: ");
            double betAmount = scanner.nextDouble();
            // дали сумата е валидна
            bettingSystem.placeBet(betAmount);

            // Провеждане на състезанието
            System.out.println("Състезанието започва...");
            Horse winningHorse = race.runRace();
            System.out.println("Победител е: " + winningHorse.getName());

            // Проверка за печалба
            bettingSystem.checkBet(selectedHorse, winningHorse);
        } else {
            System.out.println("Невалиден избор на кон.");
        }

        scanner.close();
    }
}

