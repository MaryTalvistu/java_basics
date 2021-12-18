package week5;

public class Ex86 {
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
            return "the Lyyra Card has " + this.balance + " at it's start";
        }

        public void payEconomical() {
            if (this.balance > 2) {
                this.balance -= 2;
            }
        }

        public void payGourmet() {
            if (this.balance > 4.05) {
                this.balance -= 4.05;
            }
        }
    }
}