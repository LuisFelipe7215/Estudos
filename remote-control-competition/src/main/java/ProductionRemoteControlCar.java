class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int units;
    Integer numberOfVictories;
    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return 0;
    }

    public void drive() {
        units += 10;
    }

    public int getDistanceTravelled() {
        return units;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
}
