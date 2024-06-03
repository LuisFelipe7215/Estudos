public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed > 0 && speed <= 4){
            return ((double) (speed * 221) / 100) * 100;
        } else if (speed >= 5 && speed <= 8){
            return ((double) (speed * 221) / 100) * 90;
        } else if (speed == 9){
            return ((double) (speed * 221) / 100) * 80;
        } else {
            return ((double) (speed * 221) / 100) * 77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
