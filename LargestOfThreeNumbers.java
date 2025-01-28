public class LargestOfThreeNumbers {
    // Creating a method to find the largest of three numbers
    public static void main(String[] args) {
        // The numbers to be compared
        int num1 = 10, num2 = 20, num3 = 15;
        System.out.println("Numbers are: " + num1 + ", " + num2 + ", " + num3);
        int largest;
        // Find the largest of the three numbers
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        // Print the largest number
        System.out.println("The largest number is: " + largest);
    }
}
