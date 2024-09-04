public class HelloWorld {
    public static int pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j=0;j<arr.length;j++){
                System.out.print("("+current+j+")");
            }
            System.out.println();
        }
        return 0;
    } 
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        int result = pair(numbers);
    }
}