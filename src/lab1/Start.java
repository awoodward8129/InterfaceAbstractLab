/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Alex
 */

public class Start 
{ 
public static void main(String [] args)
	{
            Course IntroJava = new IntroJavaCourse("courseName", "courseNumber", 3.5, "prerequisites");
            Course IntroProgramming= new IntroToProgrammingCourse("courseName", "courseNumber", 3.5, "prerequisites");
         
            
     introJava.returnValues();
     IntroProgramming.returnValues();
            
    }

}
