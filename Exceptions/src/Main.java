public class Main {
    public static void main(String[] args) {


        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                try {
                    checkTime(hour, minute);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    static void checkTime(int hour, int minute) throws DailyRoutine, SleepException {
        if (hour == 0 && minute == 0) {
            throw new SleepException("sleeping");
        }
        if (hour == 6 && minute == 40) {
            throw new DailyRoutine(hour + ":" + minute + " - waking up");
        }
        if (hour == 7 && minute == 30) {
            throw new DailyRoutine(hour + ":" + minute + " - morning routine");
        }
    }

}