package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studnetId;
    private String curses;
    private int tuitionBalance=0;
    private static int costOfCourse=500;
    private static int id=1000;
    public Student(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName=scanner.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName=scanner.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level");
        this.gradeYear=scanner.nextInt();
        setStudnetId();
        System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studnetId);

    }

    public void setStudnetId() {
        id++;
        this.studnetId = gradeYear+""+id;
    }
    public void enroll(){
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter course to enroll(Quiet Q): ");
            String course=scanner.nextLine();
            if (!course.equals("Q")){
                curses=curses+"\n"+course;
                tuitionBalance=tuitionBalance+costOfCourse;
            }
            else {
                break;
            }
        }while (1 !=0);
            System.out.println("ENROLLED IN: "+curses);
            System.out.println("TUIRION BALANCE: "+tuitionBalance+"usd");
    }
    public void viewBalance(){
        System.out.println("Your balance is "+tuitionBalance);
    }
    public void payTuition(){
        System.out.println("Enter your payment: ");
        Scanner scanner=new Scanner(System.in);
        int payment=scanner.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.println("Thank you fot your payment of "+payment);
        viewBalance();
    }
}
