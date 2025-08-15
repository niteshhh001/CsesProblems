import java.util.Scanner;
import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int arr[]= new int[n-1];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        long targetSum= (long) n*(n+1)/2;
        long sumOfArr= 0;
        for(int i=0;i<arr.length;i++){
            sumOfArr+= arr[i];
        }
        System.out.println(targetSum-sumOfArr);
        scn.close();
    }
    
}
