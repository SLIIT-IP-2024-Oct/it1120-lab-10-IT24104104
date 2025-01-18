import java.util.Scanner;

public class IT24104104Lab10Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
            System.out.print("Enter the mark (0 - 100): ");
            int mark = scanner.nextInt();

  
            if (mark < 0 || mark > 100) {
                throw new IllegalArgumentException("Invalid Mark");
            }

            System.out.println("Mark is Validated");

    
            String grade;
            if (mark >= 75) {
                grade = "A";
            } else if (mark >= 60) {
                grade = "B";
            } else if (mark >= 50) {
                grade = "C";
            } else if (mark >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }


            System.out.println("The Grade for the Entered Mark is: " + grade);

        } catch (IllegalArgumentException e) {
 
            System.out.println("Error: " + e.getMessage());
        }
    }
}
