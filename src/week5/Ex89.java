package week5;

public class Ex89 {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 50);

        int i = 0;
        while (i < 20) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }

    public static class BoundedCounter {
        private int value;
        private int upperLimit;

        public BoundedCounter(int upperLimit) {
            this.value = 0;
            this.upperLimit = upperLimit;
        }

        public void next() {
            this.value++;

            if(this.value > this.upperLimit) {
                this.value = 0;
            }
        }

        public String toString() {
            String prefix = "";

            if(value < 10)
                prefix = "0";

            return prefix + value;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int newValue) {
            if(newValue >= 0 && newValue <= this.upperLimit)
                this.value = newValue;
        }


    }

    public static class Clock {
        private BoundedCounter hours;
        private BoundedCounter minutes;
        private BoundedCounter seconds;

        public Clock(int hoursAtBeginning, int minutesAtBeginning,
                     int secondsAtBeginning) {
            this.hours = new BoundedCounter(23);
            this.minutes = new BoundedCounter(59);
            this.seconds = new BoundedCounter(59);

            this.hours.setValue(hoursAtBeginning);
            this.minutes.setValue(minutesAtBeginning);
            this.seconds.setValue(secondsAtBeginning);

        }

        public void tick() {
            this.seconds.next();

            if(this.seconds.getValue() == 0) {
                this.minutes.next();

                if(this.minutes.getValue() == 0)
                    this.hours.next();
            }
        }

        public String toString() {
            // returns the string representation
            return this.hours.toString() + ":" + this.minutes.toString() +
                    ":" + this.seconds.toString();
        }
    }
}
