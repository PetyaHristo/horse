import java.util.ArrayList;

 public class HorseRace {
    private ArrayList<Horse> horses;

    public HorseRace() {
        horses = new ArrayList<>();

        // Добавяме коне в състезанието
        horses.add(new Horse("Цезар", 2.5));
        horses.add(new Horse("Захарчо", 3.0));
        horses.add(new Horse("Бурята", 1.8));
        horses.add(new Horse("Амбър", 4.2));
    }

    // Показва наличните коне и техните коефициенти
    public void displayHorses() {
        System.out.println("Коне за надбягването:");
        for (int i = 0; i < horses.size(); i++) {
            System.out.println((i + 1) + ". " + horses.get(i));
        }
    }

    // Избира кон по индекс
    public Horse chooseHorse(int choice) {
        if (choice >= 1 && choice <= horses.size()) {
            return horses.get(choice - 1);
        }
        return null;
    }

    // Симулира случайно избран победител
    public Horse runRace() {
        int winnerIndex = (int) (Math.random() * horses.size());
        return horses.get(winnerIndex);
    }
}


