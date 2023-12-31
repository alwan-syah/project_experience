/*
 * Created By : Alwan
 * Created At : 20 Oktober 2023
 */

public class Author {
    // Atribute
    private String firstName;
    private String lastName;
    private String country;
    private int age;

    public Author() {
        // TODO Auto-generated constructor stub
    }

    public Author(String firstName, String lastName, String country, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    // Aditioal Method
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Author Name : " + getFullName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}