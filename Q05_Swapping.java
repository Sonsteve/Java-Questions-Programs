 class Swapping{
    public static void main(String[] args){
        int num1 = 23;
        int num2 = 54;
        System.out.println("Numbers Before Swapping: num1="+num1+", num2="+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Number After Swapping: num1="+num1+", num2="+num2);
    }
}
