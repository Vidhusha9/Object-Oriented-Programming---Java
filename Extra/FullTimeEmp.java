import java.util.Scanner;

public class FullTimeEmp extends Employee{
    private float salary;

    public FullTimeEmp(){
        super();
        this.salary = 0;
    }

    public FullTimeEmp(float salary, Name name, Date dob, String nic){
        super(name, dob, nic);
        this.salary = salary;
    }

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("----Full Time Employee----");
        super.input();
        System.out.println("----------Salary----------");
        System.out.print("Salary: ");
        salary = in.nextFloat();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Salary: " +salary);
    }

    @Override
    public String toString() {
        return "FTEmp";
    }
}
