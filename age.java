import java.util.*;
public class age {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int year = sc.nextInt();

        if (year<18) {
            System.out.print("You are not an adult.");
            
        } else {
            System.out.print("You are an adult. ");
        }
    }
}