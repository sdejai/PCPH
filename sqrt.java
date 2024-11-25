class Solution {
    public int mySqrt(int x) {
        int st=0;
        int end=(int)Math.sqrt(x);
        while(st<end){
            int mid=st+(end-st)/2;
            if((long)mid*mid==(long)x){
                return mid;
            }
            else if((long)mid*mid>(long)x){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return end;
    }
}