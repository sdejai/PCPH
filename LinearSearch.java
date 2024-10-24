


public class Main {
    public static String linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return"Key found";
            }
        }
        return "Key Not Found";
    }
    public static void main(String args[]) {
        int arr[]={10,15,30,105,189};
        int key=1050;
        System.out.println(linearSearch(arr,key));
    }
}