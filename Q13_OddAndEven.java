import java.util.*;
class getValues {
    int[] a = {6,7,3,2,1,4,5,9,8};
    void oddNdEven() {
        Arrays.sort(a);
        System.out.println("Odd Numbers: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                System.out.print(a[i]+", ");
            }
        }
        System.out.println("\nEven Numbers: ");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+", ");
            }
        }
    }
}
class OddAndEven {
    public static void main(String[] args) {
        getValues ob = new getValues();
        ob.oddNdEven();
    }
}
