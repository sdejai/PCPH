import java.util.*;
import java.io.*;
public class Main {
    public static long fact(int num){
        if(num==1||num==0){
            return 1;
        }
        long factorial=1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int testCase=sc.nextInt();
		while(testCase>0){
			int n=sc.nextInt();
			int r=sc.nextInt();
            long result=fact(n)/(fact(n-r)*fact(r));
            System.out.println(result);
			testCase--;
		}
    }
}