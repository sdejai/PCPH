import java.util.*;
import java.io.*;
public class Main {
    public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1||num==0){
            System.out.println(num);
            return;
        }
        int factorial=1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}