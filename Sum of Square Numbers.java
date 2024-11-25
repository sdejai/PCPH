class Solution {
    public boolean judgeSquareSum(int c) {
        long sqrtOfC=(long)Math.sqrt(c);
        long st = 0;
        long end=sqrtOfC;
        while(st<=end){
            long sum=st*st+end*end;
            if(sum==c){
                return true;
            }
            else if(sum<c){
                st++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}