
public class BinarySearch {
    public static int  search(int numbers[],int key){
         int start = 0; int end = numbers.length;
         while(start<=end){
            int mid = (start + end)/2;
            if(mid== key){
                return mid;
            }
            if(numbers[mid]<key){
              start = mid+1;
            }else{
                end = mid-1;
            }
         }
         return -1;
    }
    public static void main(String[] args){
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11};
        int key = 10;
        
        System.out.println("The index of the key is : "+search(numbers,key));

    }
}
