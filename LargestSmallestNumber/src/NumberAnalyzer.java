import java.util.Scanner;

public class NumberAnalyzer {
    // Class attributes
    public Scanner scan;
    private int[] numbers;
    private int largest;
    private int smallest;
    public int count;

    // Scanner constructor
    public NumberAnalyzer() {
        this.scan = new Scanner(System.in);
    }

    // Method to know the total of numbers
    public void totalCount() {
        System.out.println("-----------------------------------------------------------------------------\nHow many numbers do you want to enter");
        count = scan.nextInt();
        this.numbers = new int[count];
    }

    // Method to input numbers
    public void inputNumbers() {
        System.out.println("-----------------------------------------------------------------------------\nEnter the numbers:");

        // The “for” conditional to enter the number of values entered in the “totalCount” method to fill the array “numbers”
        for (int i = 0; i < numbers.length; i++) {
            this.numbers[i] = scan.nextInt();
        }
    }

    // Method to find the largest and smallest numbers
    public void findLargestAndSmallest() {
        this.largest = numbers[0];
        this.smallest = numbers[0];

        // The “for” and “if” to go through each of the array positions to correctly determine the largest and smallest number
        for (int i = 1; i < numbers.length; i++) {
            if (this.numbers[i] > largest) {
                this.largest = this.numbers[i];
            }
            if (this.numbers[i] < this.smallest) {
                this.smallest = this.numbers[i];
            }
        }
    }

    // Method of displaying the menu and results
    public void run() {
        int option;
        System.out.println("---------------------------------| WELCOME |---------------------------------\n Program to determine the largest and smallest number in a string of numbers");
        
        // The “do while” and “swicth” to make a basic menu
        do {
            System.out.println("-----------------------------------------------------------------------------\n 1. Continue\n 2. End \n-----------------------------------------------------------------------------");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    totalCount();
                    inputNumbers();
                    findLargestAndSmallest();
                    System.out.println("-----------------------------------------------------------------------------\nNumber largest: " + this.largest);
                    System.out.println("Number smallest: " + this.smallest);
                    break;
                case 2:
                    System.out.println("-----------------------------------------------------------------------------\nfinished program\n-----------------------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Invalid option, enter one of the options\n");
                    break;
            }
        } while (option != 2);
    }

    // Main method
    public static void main(String[] args) {
        NumberAnalyzer num = new NumberAnalyzer();
        num.run();
    }
}