package parents;

public class Personinheritance {

    // Materi Encapsulation mengubah access modifier menjadi private
    private String name;
    private String address;

    public Personinheritance(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    public Personinheritance() {
        super();
    }

    public void greeting() {
        System.out.println("Hello my name is " + name + ".");
        System.out.println("I come from " + address + ".");
    }

    // Setter dan Getter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
