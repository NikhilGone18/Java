public class duplicate {
    public static boolean duplicates(int num[]){
        for(int i= 0;i<num.length;i++){
            for(int j= i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String args[]){
    int num []={1, 2, 3,4,5, 6, 7,8,9,10,1};
    if(duplicates(num)==true){
        System.out.println("duplicate is there!");
    }else{
        System.out.println("duplicate is not there!");
    }

}

}
