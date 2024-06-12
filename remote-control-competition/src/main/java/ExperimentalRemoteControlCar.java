public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int units;
    public void drive() {
        units += 20;
    }

    public int getDistanceTravelled() {
        throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.getDistanceTravelled() method");
    }
}
