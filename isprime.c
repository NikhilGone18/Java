#include <stdio.h>
 int isprime(int a){
    if (a <= 1){
            return 0 ;
    }for(int i = 2 ; i < a ; i++){
        if (a % i == 0 ){
            return 0 ;
        }
       
    }
  return 1; 

}
int main(){
    int a ;
    scanf("%d",&a);
    if (isprime(a)){
        printf("The given numver is prime\n");
    }else {
        printf("The given number is not prime\n");
    }
 return 0;
}