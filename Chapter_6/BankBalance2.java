import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bal = 100.00;
        double INTEREST_RATE = 0.03;
        int year = 1;
        int choice;

        do {
            bal = bal+ (bal * INTEREST_RATE);

            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                    year, INTEREST_RATE, bal);
            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            System.out.println();
            year++;

        } while (choice == 1);

        System.out.println("Program Successfully Executed!");
        input.close();
    }
}
