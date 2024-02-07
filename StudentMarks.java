import java.util.Scanner;

public class StudentMarks {
    private final String[] subjects = {"DevOps", "S.T", "ML", "Project", "C#"};
    private final int MAX_MARKS = 30;
    private int[] marks = new int[5];

    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            while (true) {
                if (scanner.hasNextInt()) {
                    int mark = scanner.nextInt();
                    if (mark >= 0 && mark <= MAX_MARKS) {
                        marks[i] = mark;
                        break;
                    } else {
                        System.out.println("Marks should be between 0 and " + MAX_MARKS + ".");
                        System.out.print("Enter marks for " + subjects[i] + ": ");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer value.");
                    System.out.print("Enter marks for " + subjects[i] + ": ");
                    scanner.next();
                }
            }
        }
    }

    public int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();
        student.inputMarks();
        int totalMarks = student.calculateTotalMarks();
        System.out.println("Total marks obtained: " + totalMarks);
    }
}
