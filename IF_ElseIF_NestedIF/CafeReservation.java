import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {

        // Deklarasi variabel yang dibutuhkan
        String name, gender, day, result;
        int age;
        double appearance, money;

        Scanner input = new Scanner(System.in);

        // inisialisasi variable
        result = "";

        // Text output untuk inputan user
        System.out.println("Welcome to Reservation Cafe 79.\n");
        System.out.println("Please insert your Name : ");
        name = input.nextLine();

        System.out.println("How old are You?");
        age = input.nextInt();

        System.out.println("what is your Gender (Male/Female): ");
        gender = input.next();

        System.out.println("How attractive are you? (1 to 100)");
        appearance = input.nextDouble();

        System.out.println("How much money do you have ?");
        money = input.nextDouble();

        System.out.println("What day do you want to make a Reservation?");
        day = input.next();

        // Membuat Kondisi IF untuk setiap Day atau Hari Reservasi

        if (day.equalsIgnoreCase("Monday")) {
            // Contoh kondisi hari monday seperti di soal
            /*
             * Condition for Monday
             * 
             * -Young Night:
             * -Age from 20 to 30
             * -All Gender
             * -Money start from $500
             */

            // buat if untuk pengecekan kondisi apakah sesuai atau tidak untk Monday.
            if (age >= 20 && age <= 30 && money >= 500) {
                result = "Reservation Successfully, you can order on Monday. Young Night";
            } else {
                result = "Sorry, you cant order on Monday!!. Because it is for Young Night.";
            }
        } else if (day.equalsIgnoreCase("Tuesday")) {
            /*
             * Condition for Tuesday
             * 
             * Oldest Night:
             * -age from 31 to 50
             * -all gender
             * -money start from $250
             */

            // membuat if untuk kondisi Tuesday
            if (age >= 31 && age <= 50 && money >= 250) {
                result = "Reservation Successfully, you can order on Monday. Oldest Night";
            } else {
                result = "Sorry, you cant order on Monday!!. Because it is for Oldest Night.";
            }
        } else if (day.equalsIgnoreCase("Wednesday")) {
            /*
             * Condition for Wednesday
             * 
             * Ladies Night:
             * -age from 20 to 30
             * -Female Only
             * -Must attractive
             * -money start from $250
             */

            // membuat if untuk kondisi Wednesday

            if (gender.equalsIgnoreCase("Female") && age >= 20 && age <= 31 && appearance >= 8 &&
                    money >= 300) {
                result = "Reservation Successfully, you can order on Monday. Ladies Night";
            } else {
                result = "Sorry, you cant order on Monday!!. Because it is for Ladies Night.";
            }
        } else if (day.equalsIgnoreCase("Thursday")) {
            /*
             * Condition for Thursday
             * 
             * Ladies Night:
             * -age from 21 to 30
             * -All gender
             * -Female must attractive and money start form $300
             * -Male must have money start from $250
             */

            // membuat if untuk kondisi Thursday

            if (gender.equalsIgnoreCase("Female") && age >= 21 && age <= 31 && appearance >= 8 &&
                    money >= 300) {
                result = "Reservation Successfully, you can order on Thursday.party Night for single.";
            } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 300 && money >= 1000) {
                result = "Reservation Successfully, you can order on Thursday.party Night for single.";
            } else {
                result = "Sorry, you cant order on thursday!!. Because it is for party Night for single.";
            }
        } else if (day.equalsIgnoreCase("Friday")) {
            /*
             * Condition for Friday
             * 
             * Women Night:
             * -all gender
             * -female age 31 to 45
             * -male age from 21 to 25
             * -male must attractive
             * -feMale must have money at least $1000
             */

            // membuat if untuk kondisi friday
            if (gender.equalsIgnoreCase("Female") && age >= 31 && age >= 45 && money >= 1000) {
                result = "Reservation succesfully, you can order on friday. women night.";
            } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25 && appearance >= 8) {
                result = "Reservation successfully, you can order on friday. women night.";
            } else {
                result = "sorry, cant order on friday!!. because it is for women night..";
            }

        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            /*
             * weekend freedom:
             * -age 18 to 60
             * - money start from $100
             */

            // if kondisi untuk weekend day
            if (age >= 18 && age <= 60 && money >= 100) {
                result = "reservation  successfully, you can order on weekend day. weekend freedom";
            } else {
                result = "sorry, cant order on weekend days!!. because it is for weekend freedom.";
            }
        }
        // output text hasil aplikasi
        System.out.println();
        System.out.println("Hi " + name + ", Thank you dor using our aplication.");
        System.out.println("Following results for your reservation: ");
        System.out.println(result);
    }
}