package week8;

public class Ex10 {
    public static void main(String[] args) {
    }
    public static interface NationalService {
        int getDaysLeft();

        void work();
    }
    public static class CivilService implements NationalService {

        private int daysLeft;

        public CivilService() {
            daysLeft = 362;
        }

        @Override
        public int getDaysLeft() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return this.daysLeft;
        }

        @Override
        public void work() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if (this.daysLeft > 0) {
                this.daysLeft--;
            }
        }
    }


    public static class MilitaryService implements NationalService {

        private int daysLeft;

        public MilitaryService(int daysLeft) {
            this.daysLeft = daysLeft;
        }

        @Override
        public int getDaysLeft() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return this.daysLeft;
        }

        @Override
        public void work() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if (this.daysLeft > 0) {
                this.daysLeft--;
            }
        }
    }

}
