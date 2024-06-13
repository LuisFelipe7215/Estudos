class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int units;
    Integer numberOfVictories;
    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return this.numberOfVictories.compareTo(o.getNumberOfVictories());
    }

    public void drive() {
        units += 10;
    }

    public int getDistanceTravelled() {
        return units;
    }

    public Integer getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
}
