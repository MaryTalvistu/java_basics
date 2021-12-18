package week5;

public class Ex84 {
    public static void main(String[] args) {
    }
        public static class Counter {
            private int value;
            private boolean check;

            public Counter() {
                this(0,false);
            }
            public Counter(boolean check) {
                this(0, check);
            }
            public Counter(int startingValue) {
                this(startingValue, false);
            }
            public Counter(int startingValue, boolean check) {
                this.value = startingValue;
                this.check = check;
            }

            public int value() {
                return this.value;
            }

            public void increase() {
                this.value++;
            }

            public void decrease() {
                if(!(check && this.value == 0)) {
                    this.value--;
                }
            }

            public void increase(int increaseAmount) {
                if(increaseAmount >= 0)
                    this.value += increaseAmount;
            }

            public void decrease(int decreaseAmount) {
                if(!(check && this.value == 0) &&
                        decreaseAmount >= 0) {
                    this.value -= decreaseAmount;
                }
                if(this.value < 0 && check)
                    this.value = 0;
            }

        }
    }


