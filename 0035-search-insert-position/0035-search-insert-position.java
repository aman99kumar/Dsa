class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        // int[] ans=new int[n+1];
        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        //     else{
        //          ans[0]=target;
        //          int p=1;
        //         for(int j=0;j<n;j++){
        //              ans[p]=nums[j];
        //              p++;

        //         }
            
        //     }
       
        // }
        // Arrays.sort(ans);
        // for(int i=0;i<ans.length;i++){
        //     if(ans[i]==target){
        //         return i;
        //     }
        // }
        // return 0;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target ) return mid;
            else if(nums[mid]>target)   high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}