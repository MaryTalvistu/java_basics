package week10.Ex29.people;

public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    //returns credit
    public int credits(){
        return this.credits;
    }

    //adds credit to the student object
    public void study(){
        this.credits++;
    }

    @Override
    public String toString(){
        return super.toString() + '\n'
                + "  credits " + this.credits;
    }
}