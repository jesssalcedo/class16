package com.syntax.class16;

import com.sun.corba.se.spi.presentation.rmi.PresentationManager;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String name;
    double id;
   static int noOfStudents=0;


    public static void main(String[] args) {
        Students stu1=new Students();
        stu1.name="Jessica";
        stu1.id=123456;
        noOfStudents++;

        Students stu2=new Students();
        stu2.name="Jhon";
        stu2.id=987654;
        noOfStudents++;

        Students stu3=new Students();
        stu3.name="Isabella";
        stu3.id=963852;
        noOfStudents++;

        System.out.println(noOfStudents);
    }
}
