import java.util.Scanner;

public class Name {
    private String fName;
    private String mName;
    private String lName;

    public Name(){
        this.fName = null;
        this.mName = null;
        this.lName = null;
    }

    public Name(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public Name(Name name){
        this.fName = name.fName;
        this.mName = name.mName;
        this.lName = name.lName;
    }

    @Override
    public String toString() {
        return fName + " " + mName + " " + lName ;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("-Enter Name-");
        System.out.println("First Name:");
        fName = in.nextLine();
        System.out.println("Middle Name:");
        mName = in.nextLine();
        System.out.println("Last Name:");
        lName = in.nextLine();
    }
}
