import java.util.Scanner;
import java.text.DecimalFormat;

public class HW_6 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("$, ##0.00");
        double choiceOne = 50.5, choiceTwo = 99.0, totalSales = 0;
        int userChoice = 0;
        do
        {
            System.out.println("\nBOOK CLUB MEMBERSHIP MENU");
            System.out.print("1) Sell a Six Month Membership\n");
            System.out.print("2) Sell a Twelve Month Membership\n");
            System.out.print("3) Quit the Program\n");
            System.out.print("\nMake a selection by choosing a number: \n");

            userChoice = keyboard.nextInt();

            if(userChoice == 1){
                totalSales = totalSales + choiceOne;
                System.out.print("You sold a six month membership.\n");
            }
            else if(userChoice == 2){
                totalSales = totalSales + choiceTwo;
                System.out.print("You sold a 12 month membership.\n");
            }
            else if(userChoice != 3){
                System.out.print("You have made an invalid selection.\n");
            }
            else{
                System.out.println("The total book club membership sales were " + formatter.format(totalSales));
            }

        }while(userChoice != 3);
    }
}
