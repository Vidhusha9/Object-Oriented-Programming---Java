import java.util.Scanner;

public class Employee {
    private Name name;
    private Date dob;
    private String nic;

    public Employee(){
        this.name = new Name();
        this.dob = new Date();
        this.nic = "00000000v";
    }

    public Employee(Name name, Date dob, String nic){
        this.name = new Name(name);
        this.dob = new Date(dob);
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("Enter Employee Information");
        name.input();
        dob.input();
        System.out.println("---------Enter NIC---------");
        System.out.print("NIC: ");
        nic = in.nextLine();
    }

    public void print(){
        System.out.println("------Employee Details-----");
        System.out.println("Name: " + name);
        System.out.println("DoB: " + dob);
        System.out.println("NIC: " + nic);
    }
}
