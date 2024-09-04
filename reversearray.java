public class reversearray {
    public static void reverse(int num[]){
          int first=0;
          int end = num.length-1;
          while(first<end){
            int temp;
              temp = num[end];
              num[end] = num[first];
              num[first] = temp;
              first++;
              end--;
          }
          
    }
    public static void main(String[] args){
        int num []={1,2,3,4,5,6,7,8,9,10};
       reverse(num);
       for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
        
       }
       
    }
}
