 import java.util.Scanner;
public class Percentage1 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter your Marks:-");

        // Subject 1
        System.out.print("Subject 1: ");
        int Subject1 = UserInput.nextInt();

        // Subject 2
        System.out.print("Subject 2: ");
        int Subject2 = UserInput.nextInt();

        // Subject 3
        System.out.print("Subject 3: ");
        int Subject3 = UserInput.nextInt();

        // Subject 4
        System.out.print("Subject 4: ");
        int Subject4 = UserInput.nextInt();

        // Subject 5
        System.out.print("Subject 5: ");
        int Subject5 = UserInput.nextInt();

        int TotalMarks = Subject1 + Subject2 + Subject3 + Subject4 + Subject5;
        float Percentage = (TotalMarks/500F) * 100;

        System.out.println("\nTotal Marks: " + TotalMarks);
        System.out.println("Percentage: " + Percentage + '%');

    }
}