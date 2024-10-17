
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nOrder=sc.nextInt();
        int row=0;
        int star=1;
        while(row<nOrder){
            int col=0;
            int val=1;
            while(col<star){
                System.out.print(val+" ");
                val=(val*(row-col))/(col+1);
                col++;
            }
            System.out.println();
            row++;
            star++;
        }
    }
}