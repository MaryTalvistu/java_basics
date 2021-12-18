package week5;

public class Ex87 {
    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );
    }

    public static class Apartment {

        private int rooms;
        private int squareMeters;
        private int pricePerSquareMeter;

        public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
            this.rooms = rooms;
            this.squareMeters = squareMeters;
            this.pricePerSquareMeter = pricePerSquareMeter;
        }

        public boolean larger(Apartment otherApartment) {
            if(this.squareMeters > otherApartment.squareMeters)
                return true;
            return false;
        }

        public int priceDifference(Apartment otherApartment) {
            int thisPrice = this.squareMeters * this.pricePerSquareMeter;
            int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
            int difference = thisPrice - otherPrice;

            if (difference < 0)
                difference *= -1;

            return difference;
        }

        public boolean moreExpensiveThan(Apartment otherApartment) {
            int thisPrice = this.squareMeters * this.pricePerSquareMeter;
            int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

            if (thisPrice - otherPrice > 0)
                return true;
            return false;
        }
    }
}
