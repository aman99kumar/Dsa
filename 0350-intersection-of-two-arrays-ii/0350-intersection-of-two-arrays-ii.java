class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> li =new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    li.add(nums1[i]);
                    nums2[j]=Integer.MIN_VALUE;
                    break;
                    
                }
            }
        }
        int n=li.size();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=li.get(i);

        }
        return res;
        
       
    }
}