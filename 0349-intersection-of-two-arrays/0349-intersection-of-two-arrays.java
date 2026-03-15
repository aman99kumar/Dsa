class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> li=new ArrayList<>();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int ele:nums1){
            set1.add(ele);
        }
         for(int ele:nums2){
            set2.add(ele);
        }
        for(int ele:set1){
            if(set2.contains(ele)){
                li.add(ele);
            }
        }
        int[]res=new int[li.size()];
        for(int i=0;i<li.size();i++){
            res[i]=li.get(i);
        }
        return res;


        
        
    }
}