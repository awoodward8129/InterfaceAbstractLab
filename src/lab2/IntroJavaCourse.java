package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

   
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

   

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

 

    public void setCredits(double credits) {
        this.credits = credits;
    }

 

    public void setPrerequisites(String prerequisites) {
         if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; //To change body of generated methods, choose Tools | Templates.
    }

      public void returnValues(){
         
         setCourseName(this.courseName);
         setCourseNumber(this.courseNumber);
         setCredits(this.credits);
         setPrerequisites(this.prerequisites);
         System.out.println(this.courseName + " "      + this.credits + " " +         this.courseNumber);
         
    
    };

    
}
