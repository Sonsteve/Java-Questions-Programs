import java.util.Scanner;
class ConsonantsAndNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Type here: ");
        String string = in.nextLine();
        int conso=0;
        int num=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)>=65 && string.charAt(i)<=90 || string.charAt(i)>=97 && string.charAt(i)<=122){
                conso++;
            }
            else if(string.charAt(i)>=48 && string.charAt(i)<=57){
                num++;
            }
        }
        System.out.println("Alphabets: "+conso);
        System.out.println("Numbers: "+num);
    }
}
