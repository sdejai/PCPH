


public class Main {
    public static String BinarySearch(int arr[],int key){
        int stIndex=0;
        int endIndex=arr.length-1;
        while(stIndex<=endIndex){
            int mid=stIndex+(endIndex-stIndex)/2;
            if(arr[mid]==key){
                return "Key Found";
            }
            else if(key>arr[mid]){
                stIndex=mid+1;
            }
            else{
                endIndex=mid-1;
            }
        }
        return"Key not found";
    }
    public static void main(String args[]) {
        int arr[]={10,15,20,35,100};
        int key=10;
        
        System.out.println(BinarySearch(arr,key));
    }
}