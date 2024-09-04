import java.util.*;
public class learnsort{
    public static void bubblesort(int arr[]){
        for(int turn=0; turn < arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                //swap
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]= temp;
                }
            }
        }
         
    }
    public static void selectionsort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Printarr(int arr[]){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={12,5,6,2,7,9,18};
        Printarr(arr);
        System.out.println();
      selectionsort(arr);
      System.out.println();
      Printarr(arr); 
    }
}