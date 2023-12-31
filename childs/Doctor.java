package childs;

import parents.Personinheritance;

public class Doctor extends Personinheritance {
    private String specialist;

    public Doctor() {
        // TODO Auto-generated constructor stub
    }

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    void surgery() {
        System.out.println("I can surgery operation Patients");
    }

    public void greeting() {
        System.out.println("Hello my name is " + getName() + ".");
        System.out.println("I, come from " + getAddress() + ".");
        System.out.println("My occupation is a " + specialist + " doctor");
    }

    // Setter dan Getter
    public String getSpecialist() {
        return this.specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
