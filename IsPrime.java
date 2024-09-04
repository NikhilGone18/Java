public class IsPrime{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        outer: for(int i=2;i<num;i++){
            for(int j=2;j<num/2;j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}