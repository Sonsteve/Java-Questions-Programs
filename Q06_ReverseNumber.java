import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Reverse of given number is: ");
        int i=0;
        while (num>0){
            System.out.print(num%10);
            num/=10;
        }
    }
}
