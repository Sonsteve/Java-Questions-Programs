class Fibonacci{
    public static void main(String[] args){
        int num = 0;
        int y = 1;
        for(int i=1;i<=10;i++){
            System.out.print(num+",");
            int temp = num;
            num=y;
            y=temp+y;
        }
    }
}
