import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = in.nextInt();
        int temp = 1;
        for(int i=val;i>=1;i--){
            temp = temp*i;			// (or) temp *= i;
        }
        System.out.println("The factorial of given number is: "+temp);
    }
}
