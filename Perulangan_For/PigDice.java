import java.util.Scanner;

public class PigDice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int roll, ptot, ctot, turntotal;
        String choice = "";

        ptot = 0;
        ctot = 0;

        do {
            if (ptot < 100) {
                turntotal = 0;
                System.out.println("Computer has " + ctot + " points. ");

                do {
                    roll = 1 + (int) (Math.random() * 6);
                    System.out.println("\tComputer rolled a " + roll + ".");
                    if (roll == 1) {
                        System.out.println("tThat ends its turn.");
                        turntotal = 0;
                    } else {
                        turntotal += roll;
                        System.out.print("\tComputer has " + turntotal);
                        System.out.print("point so far this round.\n");
                        if (turntotal < 10) {
                            System.out.print("\tComputer will roll again");
                        }
                    }

                } while (roll != 1 && turntotal < 10);

                ctot += turntotal;
                System.out.print("\tComputer ends the round with ");
                System.out.print(ctot + " points.\n");
            }

            turntotal = 0;
            System.out.println("You have " + ptot + " points.");

            do {
                roll = 1 + (int) (Math.random() * 6);
                System.out.println("\tYou rolled a " + roll + ".");
                if (roll == 1) {
                    System.out.println("\tThat ends your turn.");
                    turntotal = 0;
                } else {
                    turntotal += roll;
                    System.out.print("\tYou have " + turntotal + " points.");
                    System.out.print(" so far this round.\n");
                    System.out.print("\tWould you like to \"roll\" again");
                    System.out.print(" or \"hold\"? ");
                    choice = keyboard.next();
                }
            } while (roll != 1 && choice.equals("roll"));

            ptot += turntotal;
            System.out.println("\tYou end the round with " + ptot + " points\n");

        } while (ptot < 50 && ctot < 50);

        if (ptot > ctot) {
            System.out.println("Humanity wins!!");
        } else {
            System.out.println("The compouter wins.");
        }
    }
}
