package com.syntax.class16;

public class SyntaxEmployee {

    double empId;
    int salary;
    static String ceo="Sumair";

    void displayEmployeeinfo(){

        System.out.println("Employee Id: "+empId+" Salary: "+salary+" CEO: "+ceo);

    }

    public static void main(String[] args) {
        SyntaxEmployee se1=new SyntaxEmployee();
        se1.empId=123456;
        se1.salary=150000;
        se1.displayEmployeeinfo();

        SyntaxEmployee se2=new SyntaxEmployee();
        se2.empId=987654;
        se2.salary=200000;
        se2.displayEmployeeinfo();

    }
}
