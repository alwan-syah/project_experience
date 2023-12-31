package childs;

import parents.Personinheritance;

public class Programmer extends Personinheritance {
    private String technology;

    public Programmer() {
        super();
        // TODO auto-generated constructor stub
    }

    public Programmer(String name, String address, String technology) {
        super(name, address);
        this.technology = technology;
    }

    public void hacking() {
        System.out.println("I can hacking a website");
    }

    public void coding() {
        System.out.println("I can create a apliacation using technology : " + technology + ".");
    }

    @Override // method overriding
    public void greeting() {
        super.greeting();// memanggil method greeting dari parent atau person class
        System.out.println("My job is a " + technology + " programmer");
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

}
