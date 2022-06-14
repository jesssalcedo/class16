package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary; // instance vairable
    static int noOfEmployees; // static variable
    static  String companyName="Google"; // not an instance bc it will hold up too much memory

    void displayEmployeeInfo(){

        System.out.println("Name "+name+" Salary "+salary +" Company name "+companyName+ " NoOfEmployee "+noOfEmployees);


    }
    public static void main(String[] arg) {

        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Jessica";
        emp1.salary=250000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Jhon";
        emp2.salary=250001;
        emp2.noOfEmployees=2;
        emp2.displayEmployeeInfo();
        }
    }


