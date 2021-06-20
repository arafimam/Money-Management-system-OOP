package school.system;

public class Student {

    private String id;
    private String name;
    private int grade;
    private double feesPaid;
    private int feesTotal;
    private double mark;

    public Student(String id,String name,int grade,double mark){
        feesPaid=0;
        if (mark>=80 && mark<90){
            feesTotal=20000;
        }
        else if(mark>=90 &&mark <=100){
            feesTotal=5000;
        }
        else if (grade<80){
            feesTotal=30000;
        }


        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //if student gets promoted grade has to be changed.
    public void setGrade(int grade) {
        this.grade = grade;
    }
    //if student pays fees.
    public void updateStudentFees(double fees){
        feesPaid+=fees;
        school.updateMoneyEarned(feesPaid);
    }

    public String getName() {
        return name;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }
    public double FeesDue(){
        return feesTotal-feesPaid;
    }

    public String toString(){
        return "Student Name: "+name+"\n"+"Student ID: "+id+"\nStudent Grade: "+grade;
    }

}
