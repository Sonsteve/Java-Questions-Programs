class ProgramXpattern {
    public static void main(String[] args) {
        String string ="PROGRAM";
        int x = string.length()-1;
        for(int i=0;i<string.length();i++){
            for(int j=0;j<string.length();j++){
                if(j==i || j==x){
                    System.out.print(string.charAt(j));
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            x--;
        }
    }
}
