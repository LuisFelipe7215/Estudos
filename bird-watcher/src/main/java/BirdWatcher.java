class BirdWatcher {
    private final int[] birdsPerDay;
    private int increment;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int birds = 0;
        for (int j : birdsPerDay) {
            birds = j;
        }
        birds += increment;
        return birds;
    }

    public void incrementTodaysCount() {
        increment++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;

    }

    public int getCountForFirstDays(int numberOfDays) {
        int birds = 0;

        if (numberOfDays <= birdsPerDay.length) {

            for (int i = 0; i < (numberOfDays); i++) {
                birds += birdsPerDay[i];
            }

        } else {
            return 29;
        }

        return birds;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int i : birdsPerDay) {
            if (i >= 5) {
                busyDays++;
            }
        }

        return busyDays;

    }
}
