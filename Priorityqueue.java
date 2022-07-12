
class Priorityqueue {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder()); // Its a MAX Heap (you should mention Collections.reverseOrder())
                                                                                         // If not by default it considers as a MIN heap
       ArrayList<Integer>hm=new ArrayList<Integer>();
        int i,max=-19999;
        for(i=0;i<nums.length;i++){
            if(!hm.contains(nums[i])){
            hm.add(nums[i]);
            pq.add(nums[i]);
            }
            if(max<nums[i])
                max=nums[i];
        }
        if(hm.size()<3)
            return max;
        for(i=0;i<2;i++)
            pq.poll();
        return pq.peek();
    }
}
