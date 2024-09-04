public class Insertionatend {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int newarr[]= new int[arr.length+1];
       for(int k=0;k<arr.length;k++){
        newarr[k]=arr[k];
        
       }
        newarr[arr.length]=7;
        for(int j=0;j<newarr.length;j++){
            System.out.print(newarr[j]+" ");
        }
    }
}
