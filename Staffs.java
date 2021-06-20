package school.system;

public class Staffs {
    private String name;
    private String ID;
    private double salary;
    private double salaryEarned;


    public Staffs(String name,String ID,double salary){
        salaryEarned=0;
        this.name=name;
        this.ID=ID;
        this.salary=salary;



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

}
