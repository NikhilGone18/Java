public class Insertionatmid {
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,7};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int newarr[]= new int[arr.length+1];
        for(int j=0;j<=2;j++){
            newarr[j]=arr[j];
        }
        newarr[3]=4;
        for(int k=4;k<newarr.length;k++){
            newarr[k]=arr[k-1];
        }
        for(int l=0;l<newarr.length;l++){
            System.out.print(newarr[l]+" ");
        }
    }
}
