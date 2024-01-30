/**
 * The StudentDetails class stores and displays the course codes and marks obtained by a student.
 */
public class StudentDetails {
      public static void main(String[] args) {
        
  }

   // The code `public String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };` declares and
   // initializes an array of strings named `courseCodes`. The array contains the course codes for the
   // student's courses, which are "C#", "ST", "ML", "DEVOPS", and "MP".
         public String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
         public int[] marks = { 85, 92, 75, 88, 95 };
    
        public void displayStudentMarks() {
            System.out.println("Course Codes \t Marks Obtained");
    
            // The code `for (int i = 0; i < courseCodes.length; i++)` is a for loop that iterates over
            // the elements of the `courseCodes` array.
            for (int i = 0; i < courseCodes.length; i++) {
               
                    System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
            }
        }
    
    
}
