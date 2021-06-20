package school.system;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.*;

public class test {
    public static void main (String[] args){
        Scanner k=new Scanner(System.in);
        int check;
        String password;
        do{
            int num;
            System.out.println("Welcome to Star Education High School (SEHS)");
            System.out.println("Here at our school we provide the best education for our student and always maintain quality teachers and staff to help make our school great");
            System.out.println("Want to have a look at how are students, teachers and staffs are maintained?");
            System.out.println("Press 1 to see about our students");
            System.out.println("Press 2 to see about our teachers and their payment process");
            System.out.println("Press 3 if you want to update any information.");
            num=k.nextInt();
            //grade 11-students
            Student araf=new Student("1","Syed Araf Imam",11,88);
            Student john=new Student("2","John Nath",11,67);
            Student james=new Student ("3","James DrinkWater",11,98);
            List<Student>studentList=new ArrayList<>();
            studentList.add(araf);
            studentList.add(john);
            studentList.add(james);
            //grade 12-students
            Student Lampard=new Student("4","Frank Lampard",12,81);
            Student Drogrba=new Student ("5","Drogba",12,88);
            Student Mount=new Student("6","Mason Mount",12,66);
            studentList.add(Lampard);
            studentList.add(Drogrba);
            studentList.add(Mount);
            //grade 11-teacher
            teacher harry=new teacher("Harry Kane","123",11);
            teacher aguero=new teacher("Sergio Aguero","6789",11);
            //grade 12-teacher
            teacher Ramos=new teacher("Sergio Ramos","334456",12);
            teacher Lionel=new teacher("Lionel Messi","90999",12);
            List<teacher>teacherList=new ArrayList<>();
            teacherList.add(harry);
            teacherList.add(aguero);
            teacherList.add(Ramos);
            teacherList.add(Lionel);
            //creat school
            Staffs Ema=new Staffs("Ema","222",300);
            Staffs Jamy=new Staffs("Jamy","333",300);
            List<Staffs>staffsList=new ArrayList<>();

            school SEHS=new school(teacherList,studentList,staffsList);


            if (num==1){
                System.out.println("Here at our high school we student with high merits a yearly scholarship.");
                System.out.println("If average mark is greater than 80 and less than 90, Scholarship given=$10,000");
                System.out.println("If average mark is greater than 90 and less than 100, Scholarship awarded=$25,000");
                System.out.println("If average mark is less than 80, Scholarship awarded=0.00");
                System.out.println("Total fees without scholarship is $30,000");
            }
            else if (num==2){
                System.out.println("Teachers above grade 3 and below grade 5 have a salary of $500.");
                System.out.println("Teachers above grade 6 and below grade 8 have a salary of 900");
                System.out.println("Teachers above grade 8 and below grade 12 have a salary of $1100.");
                System.out.println("Teachers below grade 3 have a salary of 300.");
            }
            else if (num==3){
                System.out.println("Hello Member of our school community.");

                System.out.println("Welcome Please enter your school coded password to see details information and update them.");
                System.out.println("Note that password has to be given in the following format: LLLNNNN, Here L represents letter and N represents number.");
                Scanner user=new Scanner(System.in);
                password=user.nextLine();


                if (isValid(password)){
                    System.out.println("-----Here are all our existing student information------\n\n");

                    System.out.println("******Grade 12 Students*********");
                    System.out.println(Lampard);
                    System.out.println("--------------------------------------------------");
                    System.out.println(Drogrba);
                    System.out.println("--------------------------------------------------");
                    System.out.println(Mount);
                    System.out.println("--------------------------------------------------");
                    System.out.println("********Grade 11 Students********");
                    System.out.println(araf);
                    System.out.println("--------------------------------------------------");
                    System.out.println(john);
                    System.out.println("--------------------------------------------------");
                    System.out.println(james);
                    System.out.println("--------------------------------------------------");
                    System.out.println("\n\n");

                    System.out.println("-----Here are all our existing teacher information------\n\n");
                    System.out.println("******Grade 12 Teachers*********");
                    System.out.println(harry);
                    System.out.println("--------------------------------------------------");
                    System.out.println(aguero);
                    System.out.println("--------------------------------------------------");

                    System.out.println("********Grade 11 Teachers********");
                    System.out.println(Ramos);
                    System.out.println("--------------------------------------------------");
                    System.out.println(Lionel);
                    System.out.println("--------------------------------------------------");
                    System.out.println("\n\n");

                    //Update student Fees.
                    System.out.println("Do you wish to update student fees?");
                    System.out.println("Press 0 to do so, otherwise enter any other number");
                    int z;
                    Scanner input=new Scanner(System.in);
                    z=input.nextInt();
                    if (z==0){

                        int number;
                        int f;

                        do{
                            System.out.println("Enter the id number of the student you want to change");
                            number=input.nextInt();
                            if (number==1){
                                araf.updateStudentFees(araf.getFeesTotal());
                            }
                            else if (number ==2){
                                john.updateStudentFees(john.getFeesTotal());
                            }
                            else if (number ==3){
                                james.updateStudentFees(james.getFeesTotal());
                            }
                            else if (number ==4){
                                Lampard.updateStudentFees(Lampard.getFeesTotal());
                            }
                            else if (number ==5){
                                Drogrba.updateStudentFees(Drogrba.getFeesTotal());
                            }
                            else if (number ==6){
                                Mount.updateStudentFees(Mount.getFeesTotal());
                            }
                            System.out.println("do you wish to do payment for another student? Press 0 to do so,otherwise press any other number");
                            f= input.nextInt();



                        }while (f==0);
                        System.out.println("Total Money Earned by the schhol is: ");
                        System.out.println(SEHS.getMoneyEarned());


                    }
                    //update teacher fees
                    System.out.println("Do you wish to make payment to the teachers and staffs?");
                    System.out.println("Press 0 to do so otherwise press any other number.");
                    int l;
                    int i;
                    int c;
                    Scanner take=new Scanner(System.in);
                    l=take.nextInt();
                    if (l==0){
                        do{
                            System.out.println("Enter the ID number of the teacher or staff who you want to give fees to");
                            i=take.nextInt();
                            if (i==123){
                                harry.receivePayment(harry.getSalary());

                            }
                            else if(i==6789){
                                aguero.receivePayment(aguero.getSalary());


                            }
                            else if(i==334456) {
                                Ramos.receivePayment(Ramos.getSalary());


                            }
                            else if(i==90999){
                                Lionel.receivePayment(Lionel.getSalary());


                            }
                            else if(i==222){
                                Ema.receivePayment(Ema.getSalary());


                            }
                            else if (i==333){
                                Jamy.receivePayment(Jamy.getSalary());


                            }
                            System.out.println("Do you wish to make more payments? Press 0 to do so,otherwise press any other number");
                            c=take.nextInt();

                        }while(c==0);
                        System.out.println("Total payment made by the school:");
                        System.out.println(SEHS.getMoneySpent());



                    }




                }
                else{
                    System.out.println("The Password is not valid.");
                }
            }
            System.out.println("Do you wish to navigate further?Press 1 to do so or press any other number to exit");
            check=k.nextInt();


        }while (check==1);


    }
    public static boolean isValid(String name){
        boolean good=true;
        int i=0;
        if (name.length()!=7){
            good=false;
        }
        while (good && i<3){
            if (!Character.isLetter(name.charAt(i))){
                good=false;
            }
            i++;
        }
        while (good && i<7){
            if (!Character.isDigit(name.charAt(i))){
                good=false;
            }
            i++;
        }
        return good;
    }
}
