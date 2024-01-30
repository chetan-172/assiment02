/**
 * The Student class extends the StudentDetails class and includes methods to display the student's
 * name and age, as well as a main method to test the functionality.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Student extends StudentDetails {
    String name;
    String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

   /**
    * The function takes a date of birth as input and calculates the age of a student based on the
    * current date.
    * 
    * @param dob The parameter "dob" stands for "date of birth". It is a string representing the date
    * of birth of a student in the format "dd-MM-yyyy".
    */
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age);
    }

 // The `main` method is the entry point of the Java program. It is the method that is executed when
 // the program is run.
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Chetan Anehosur";
        s.displayName();
        s.displayAge("16-01-2003");
        StudentDetails  sd = new StudentDetails();
        sd.displayStudentMarks();
    }
}
