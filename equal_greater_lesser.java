import java.util.Scanner;

public class equal_greater_lesser {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the refference number:");
        int ref = sc.nextInt();

        System.out.print("Enter the number:");
        int num = sc.nextInt();

        if(ref>num)
        System.out.println("Munber is smaller");
        else if(ref==num)
        System.out.println("The number is equal.");
        else
        System.out.println("The number is greater.");
    }
}