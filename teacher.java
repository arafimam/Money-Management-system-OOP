package school.system;

public class teacher {

    private String name;
    private String ID;
    private double salary;
    private double salaryEarned;
    private int grade;

    public teacher(String name,String ID,int grade){
        salaryEarned=0;
        this.name=name;
        this.ID=ID;
        this.grade=grade;
        if (grade>3 && grade<=5){
            this.salary=500;
        }
        else if(grade<=3&&grade>=0){
            this.salary=300;
        }
        else if(grade>=6&& grade<8){
            this.salary=900;
        }
        else if (grade>=8 && grade<=12){
            this.salary=1100;
        }


    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }
//name and id of teacher wont change.
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void receivePayment(double s){
        salaryEarned+=s;
        school.updateMoneySpent(salaryEarned);

    }
    public String toString(){
        return "Name of the teacher is:"+name+"\nID is: "+ID+"\ngrade: "+grade;
    }
}
