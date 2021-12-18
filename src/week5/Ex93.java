package week5;

import java.util.Calendar;


public class Ex93 {
    public static void main(String[] args) {
        // write test code here
        Person pekka = new Person("Pekka", 15, 2, 1983);
        Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka) );
        System.out.println( pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin) );
    }

    public static class MyDate {

        private int day;
        private int month;
        private int year;

        public MyDate(int pv, int kk, int vv) {
            this.day = pv;
            this.month = kk;
            this.year = vv;
        }

        public String toString() {
            return this.day + "." + this.month + "." + this.year;
        }

        public boolean earlier(MyDate compared) {
            if (this.year < compared.year) {
                return true;
            }

            if (this.year == compared.year && this.month < compared.month) {
                return true;
            }

            if (this.year == compared.year && this.month == compared.month
                    && this.day < compared.day) {
                return true;
            }

            return false;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        /*
         * In assignment 92 method differneceInYears was added to MyDate
         * Copy the method here since it eases this assignment considerably.
         */
        public int differenceInYears(MyDate comparedDate) {
            int difference;
            MyDate greaterDate = null;
            MyDate lesserDate = null;

            if(this.year > comparedDate.year) {
                greaterDate = this;
                lesserDate = comparedDate;
            }

            else if(this.year < comparedDate.year) {
                greaterDate = comparedDate;
                lesserDate = this;
            }

            else return 0;

            difference = greaterDate.year - lesserDate.year;

            if(greaterDate.month < lesserDate.month ||
                    (greaterDate.month == lesserDate.month && greaterDate.day < lesserDate.day))
                difference--;

            return difference;
        }
    }

    public static class Person {
        private String name;
        private MyDate birthday;

        public Person(String name, int pp, int kk, int vv) {
            this.name = name;
            this.birthday = new MyDate(pp, kk, vv);
        }

        public Person(String name) {
            this.name = name;
            this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                    Calendar.getInstance().get(Calendar.MONTH)+1,
                    Calendar.getInstance().get(Calendar.YEAR));
        }

        public Person(String name, MyDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public int age() {
            int age;
            MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                    Calendar.getInstance().get(Calendar.MONTH)+1,
                    Calendar.getInstance().get(Calendar.YEAR));

            return birthday.differenceInYears(today);
        }

        public boolean olderThan(Person compared) {
            if(this.birthday.getYear() > compared.birthday.getYear())
                return false;
            if(this.birthday.getYear() == compared.birthday.getYear() && this.birthday.getMonth() > compared.birthday.getMonth())
                return false;
            if(this.birthday.getMonth() == compared.birthday.getMonth() && this.birthday.getDay() > compared.birthday.getDay())
                return false;
            return true;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name + ", born " + this.birthday;
        }
    }

}
