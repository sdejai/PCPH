


import java.io.*;
import java.util.*;
public class Main {
    public static int findKLengthSubArrayMaxSum(int arr[],int k){
        int maxm=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=arr[j+i];
            }
            if(sum>maxm){
                maxm=sum;
            }
            // maxm=Math.max(sum,maxm);
        }
        return maxm;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(findKLengthSubArrayMaxSum(arr,k));
    }
}