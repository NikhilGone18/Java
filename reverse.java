public class reverse {
  public static void main (String agrgs[]){
    int arr[]={1,2,3,4,5};
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
      int arr2[]=new int[arr.length];
   for(int j=0;j<arr.length;j++){
     arr2[j]= arr[arr.length-1-j];

   }
   System.out.println();
   for (int k=0;k<arr2.length;k++){
    System.out.print(+arr2[k]);
   }
  }  
}
