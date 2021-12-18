package week4;


public class Ex75 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);


        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();


    }


    public static class DecreasingCounter {

        private int value;
        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            if (this.value > 0) {
                this.value--;
            } else {
                this.value = 0;
            }
        }

        public void reset() {
            this.value = 0;
        }

        public void setInitial() {
            this.value = 100;
        }

    }

}
