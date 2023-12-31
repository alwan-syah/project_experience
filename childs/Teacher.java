package childs;

import parents.Personinheritance;

public class Teacher extends Personinheritance {
    private String subject;

    public Teacher() {
        // TODO auto-generated constructor stub
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void teaching() {
        System.out.println("I can teach " + subject + ", so anyone how wants to learn can talk to me. ");
    }

    public void greeting() {
        System.out.println("Hello my name is " + getName() + ".");
        System.out.println("I, come from " + getAddress() + ".");
        System.out.println("My job is a " + subject + " teacher");
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
