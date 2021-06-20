package school.system;

import java.util.List;

public class school {

    private List<teacher> teachers;
    private List<Student> students;
    private List<Staffs> staffs;
    private static int MoneyEarned;
    private static int MoneySpent;

    public school(List<teacher> teachers, List<Student> students,List<Staffs> staffs) {
        this.teachers = teachers;
        this.students = students;
        this.staffs=staffs;

        MoneyEarned=0;
        MoneySpent=0;
    }

    public List<teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(teacher teacher) {
        teachers.add(teacher);

    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getMoneyEarned() {
        return MoneyEarned;
    }

    public static void updateMoneyEarned(double m) {
        MoneyEarned +=m;

    }

    public int getMoneySpent() {
        return MoneySpent;
    }

    public static void updateMoneySpent(double m) {
        MoneySpent += m;
    }
    public void remainingAmount(){
        if (MoneyEarned>MoneySpent){
            double z=MoneyEarned-MoneySpent;
            System.out.println("We are making a profit of:");
            System.out.println(z);

        }
        else {
            double z=MoneySpent-MoneyEarned;
            System.out.println("We are making a loss of:");
            System.out.println(z);

        }
    }
}
