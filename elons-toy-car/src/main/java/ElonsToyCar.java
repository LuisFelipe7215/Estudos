public class ElonsToyCar {
    private int meters;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return battery != 0 ? "Driven " + meters + " meters" : "Driven 2000 meters";
    }

    public String batteryDisplay() {
        return battery != 0 ? "Battery at " + battery + "%" : "Battery empty";
    }

    public void drive() {
        meters += 20;

        if (battery != 0) {
            battery -= 1;
        } else {
            batteryDisplay();
        }

    }

}
