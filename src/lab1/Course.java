/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public abstract class Course {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

   public Course(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
        
        
    }
    
   public void returnValues(){
   
       setCourseName(this.courseName);
       setCourseNumber(this.courseNumber);
       setCredits(this.credits);
     setPrerequisites(this.prerequisites);
     
       System.out.println(this.courseName +" " + this.courseNumber + " " + this.prerequisites + " " + this.credits);
   }
    
 
 
     private final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

 

    private final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
       private  void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
            
            this.credits = credits;
        }
       
        
    }
        
        

 private final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
 
 public void getCapitalizedCourseName() {
       System.out.println( this.courseName.toUpperCase());
    }
}
