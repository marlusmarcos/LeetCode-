class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        int qtd = nums.length - 1;
        while(qtd > pos) {
            if (nums[pos] >= target)
            {
            return pos;
            }
            pos +=1;
        }
        if (nums[qtd] < target) {
            return pos+1;
        }
        return pos;
    }
}
