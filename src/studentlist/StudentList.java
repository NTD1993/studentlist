 /*
        Name:  Nolan
        Assignment:  FirstExample
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
 */

package studentlist;
import java.util.*;
/**
 *
 * @author nolan
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enbter a word");
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        char[] letters = new char[word.length()];
        //have a loop to populate the array
        for (int i = 0; i < word.length(); i++){
            letters[i] = word.charAt(i);
        }
        System.out.println("Here is the word from the array: ");
        
        //print out the array
        for(char letter: letters){
            System.out.print(letter);
        }
        System.out.println("Word printed in reverse");
        //print out the word in reverse
        for(int i = letters.length - 1; i >= 0; i--){
            System.out.print(letters[i] + " ");
        }
        //print blank line
        System.out.println();
        System.out.println("Now we do the student code: ");
        
        Student[] studentsList = new Student[2];
        
        for (int i = 0; i < studentsList.length; i++){
            //ask for students name
            System.out.println("Enter the student name: ");
            String name = input.nextLine();
            Student student = new Student(name);
            System.out.println("Enter the student adresss: ");
            String address = input.nextLine();
            student.setAddress(address);
            //Store student inside array
            studentsList[i] = student;
        }
        
        System.out.println("Now we print out the names");
        
        for (Student student : studentsList){
            String format = "Student %s lives at %s\n";
            System.out.println(student.getName() + student.getAddress());
        }
    }

}

