import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int planet = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[planet];
    }

    String randomShipRegistryNumber() {
        return String.format("NCC-%d", random.nextInt(1000, 10000));
    }

    double randomStardate() {
        throw new UnsupportedOperationException("Please implement the CaptainsLog.randomStardate() method");
    }
}
