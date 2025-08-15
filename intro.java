import java.util.*;
class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        long n = scn.nextLong();
        System.out.print(n+" ");
        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.print(n+" ");
            }else{
                n=(3*n)+1;
                System.out.print(n+" ");
            }
        }
        scn.close();
    }
}