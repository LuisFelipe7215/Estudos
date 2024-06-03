class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryCharge;


    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryCharge = 100;
    }

    public boolean batteryDrained() {
        return this.batteryCharge == 0;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.batteryCharge >= this.batteryDrain) {
            this.distanceDriven += this.speed;
            this.batteryCharge -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        for (int i = 0; i < distance; i++) {
            car.drive();
            if (car.distanceDriven() == distance) {
                return true;
            }
        }
        return false;
    }
}