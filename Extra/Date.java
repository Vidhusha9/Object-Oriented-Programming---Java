import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date(Date date){
        this.year = date.year;
        this.month = date.month;
        this.day = date.day;
    }

    @Override
    public String toString() {
        return year + "." + month + "." + day;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("-Enter Date-");
        System.out.println("Year:");
        year = in.nextInt();
        System.out.println("Month:");
        month = in.nextInt();
        System.out.println("Day:");
        day = in.nextInt();
    }
}
