class Horse {
    private String name;
    private double odds;

    public Horse(String name, double odds) {
        this.name = name;
        this.odds = odds;
    }

    public String getName() {
        return name;
    }

    public double getOdds() {
        return odds;
    }

    @Override
    public String toString() {
        return name + " - коефициент: " + odds;
    }
}