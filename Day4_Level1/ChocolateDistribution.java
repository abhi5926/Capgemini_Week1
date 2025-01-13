import java.util.Scanner;

public class ChocolateDistribution{

    //Method to calculate the chocolate distribution and display the result
    public static void chocolateDistribution(int numberOfChocolates, int numberOfChildren) {
        // Calculating how much chocolate each child gets
        int childrenGetChocolate = numberOfChocolates / numberOfChildren;

        // Calculating remaining chocolates
        int remainingChocolate = numberOfChocolates % numberOfChildren;

        // Displaying the result
        System.out.println("The number of chocolates each child gets is " + childrenGetChocolate + " and the number of remaining chocolates are " + remainingChocolate);
    }

    public static void main(String[] args) {
        //Creating a Scanner class object
        Scanner input = new Scanner(System.in);
       //Declaring variables for number of chocolates and number of children
        int numberOfChocolates, numberOfChildren;

        //Taking numberOfChocolates as input from the user
        System.out.println("Enter the number of chocolates:");
        numberOfChocolates = input.nextInt();

        //Taking numberOfChildren as input from the user
        System.out.println("Enter the number of children:");
        numberOfChildren = input.nextInt();

        //Calling the method to perform chocolate distribution
        chocolateDistribution(numberOfChocolates, numberOfChildren);

        //Closing the scanner
        input.close();
    }
}
