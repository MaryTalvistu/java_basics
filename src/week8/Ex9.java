package week8;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex9 {
    public static void main(String[]args){
        RegistrationPlate reg1=new RegistrationPlate("FI","ABC-123");
        RegistrationPlate reg2=new RegistrationPlate("FI","UXE-465");
        RegistrationPlate reg3=new RegistrationPlate("D","B WQ-431");

        ArrayList<RegistrationPlate> finnish=new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate knew = new RegistrationPlate("FI","ABC-123");
        if(!finnish.contains(knew)){
            finnish.add(knew);
        }
        System.out.println("Finnish: "+finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        HashMap<RegistrationPlate, String> owners=new HashMap<RegistrationPlate, String>();
        owners.put(reg1,"Arto");
        owners.put(reg3,"Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI","ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D","B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found
    }

    public static class VehicleRegister {
        private HashMap<RegistrationPlate, String> regList;

        public VehicleRegister() {
            this.regList = new HashMap<RegistrationPlate, String>();
        }


        public boolean add(RegistrationPlate plate, String owner) {

            if (this.regList.containsKey(plate)) {
                if (this.regList.get(plate).equals(owner)) {
                    return false;
                }
            }

            this.regList.put(plate, owner);
            return true;

        }

        public String get(RegistrationPlate plate) {
            if (this.regList.containsKey(plate)) {
                return this.regList.get(plate);     // return value of hashmap "regList" object "plate"
            }
            return null;
        }


        public boolean delete(RegistrationPlate plate) {
            if (this.regList.containsKey(plate)) {
                this.regList.remove(plate);
                return true;
            }
            return false;
        }


        public void printRegistrationPlates() {
            System.out.print("[");

            for (RegistrationPlate thisPlate : this.regList.keySet()) {
                System.out.println(thisPlate);        // print thisPlate
                System.out.print(", ");
            }

            System.out.println("]");
        }


        public void printOwners() {
            ArrayList<String> ownerList = new ArrayList<String>();            // create list of owners, outside of loop

            for (RegistrationPlate thisPlate : this.regList.keySet()) {        // cycle through all keys

                String currentOwner = this.regList.get(thisPlate);        // create string "currentOwner" from value associated to "thisPlate" key in hashmap "regList"

                if (ownerList.contains(currentOwner)) {
                    // do nothing if it's already in the "ownerList" arraylist.
                } else {
                    // add it to the arraylist if it does not exist, and print it.
                    ownerList.add(currentOwner);
                    System.out.println(this.regList.get(thisPlate));
                }
            }
        }
    }

    public static class RegistrationPlate {
        // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
        private final String regCode;
        private final String country;

        public RegistrationPlate(String regCode, String country) {
            this.regCode = regCode;
            this.country = country;
        }

        public String getRegCode() {
            return this.regCode;
        }

        public String getCountry() {
            return this.country;
        }

        @Override
        public String toString(){
            return country+ " "+regCode;
        }

        @Override
        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }

            if (getClass() != object.getClass()) {
                return false;
            }

            RegistrationPlate compared = (RegistrationPlate) object;

            if (this.regCode != compared.getRegCode()) {
                return false;
            }

            if (this.country != compared.getCountry()) {
                return false;
            }

            if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
                return false;
            }

            if (this.country == null || !this.country.equals(compared.getCountry())) {
                return false;
            }

            return true;
        }

        @Override
        public int hashCode() {
            if (this.regCode == null || this.country == null) {
                return 7;
            }

            return this.regCode.hashCode() + this.country.hashCode();
        }
    }
}
