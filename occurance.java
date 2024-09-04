public class occurance {
    public static int count(int array[], int key){
        int count = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7,8,6,3,2,5,6,8,7,};
        int key = 8;
        int result = count(array, key);
        System.out.println("The number of occurrance of the key is : "+ result);
    }
}
