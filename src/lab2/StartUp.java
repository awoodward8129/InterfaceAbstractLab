/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author Alex
 */
public class StartUp {
    public static void main(String [] args){
    
       Course Intro = new IntroToProgrammingCourse("CourseName", "CourseNumber");
       Course IntroJavaCourse = new IntroJavaCourse("CourseName", "CourseNumber");
   Intro.returnValues();
    IntroJavaCourse.returnValues();
    }
}
