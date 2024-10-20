public class Main {
    public static void main(String args[]) {
        int arr[]={5,10,1,88,6,10};
        int k=2;
        int sum=0;
        int maxm=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        maxm=sum;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];//window Grow
            sum-=arr[i-k];//window shrink
            maxm=Math.max(maxm,sum);
        }
        System.out.println(maxm);
    }
}