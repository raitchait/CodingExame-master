package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployee implements Employee  {


    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */
    public static String getCompanyName() { return companyName;
    }

    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }
    /*declare few static and final fields and some non-static fields*/
    private static String companyName;
    private String name;
    private int employeeID, employeeAge;
    public int salary;
    private int performance;
    static String address;
    /*You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.*/

    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */
    public EmployeeInfo(int employeeId){
        this.employeeID=employeeId;

    }
    public EmployeeInfo(String name, int employeeId){
        this.name = name;
        this.employeeID = employeeId;

    }
    public EmployeeInfo(String name, int employeeID, int employeeAge) {
        this.name = name;
        this.employeeID = employeeID;
        this.employeeAge = employeeAge;
    }

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */
    public static double calculateEmployeeBonus(int salary, int performance){
        double total=0;
        if(performance >= 8){
            total = salary * .1;
        }else{
            total= salary*.08;
        }
        System.out.println("Employee's bonus = $"+total);
        return total;
    }

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static double calculateEmployeePension(int salary){
        double total=0;


        //implement numbers of year from above two dates
        //Calculate pension



        //int totalYears = current-start;



        System.out.println("Employee Pension is = $ " +total);
        return total;
    }
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }


    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }
    public void breakTime(){
        System.out.println("employees should get 30 min paid break a day");
    }

    private static class DateConversion {

        public DateConversion(Months months){}
        public static String convertDate(String date) {
            String [] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;
        }
    }
    public class nestedclass{
        public void nestedMethod() {
            System.out.println("Name");
        }
    }
}