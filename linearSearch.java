public class linearSearch {


    public static int search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            } 
        }
        return -1;
    }
public static void main(String args[]){
   int numbers[]={1,2,3,4,5,6,7,8,9,22,18,44};
   int key = 18;

int index = search( numbers,key);

if(index == -1){
    
    System.out.println("Not Found !");
} else{
    System.out.println("The index of the given number in the array is : "+ index);
    
}
    }
}
