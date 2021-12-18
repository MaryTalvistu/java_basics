package week4;

public class Ex77 {
    public static void main(String[] args) {
            LyyraCard card = new LyyraCard(50);
            System.out.println(card);

            card.payGourmet();
            System.out.println(card);

            card.payGourmet();
            System.out.println(card);


        }

    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balanceAtStart) {
            this.balance = balanceAtStart;
        }

        public String toString() {
            return "The card has " + this.balance + " euros";
        }

        public void payEconomical() {        // 77.2
            // write code here

            if (this.balance >= 2.50) {    // 77.3
                this.balance -= 2.50;
            }
        }

        public void payGourmet() {        // 77.2
            // write code here

            if (this.balance >= 4.00) {    // 77.3
                this.balance -= 4.00;
            }
        }

        public void loadMoney(double amount) {
            // write code here

            if (amount >= 0) {
                this.balance += amount;
                if (this.balance > 150.00) {
                    this.balance = 150.00;
                }
            }
        }
    }
}

