class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_cont = 0;
        while(left<right){
            int width = right - left;
            int h = Math.min(height[left],height[right]);
            int cont = width * h;
            max_cont = Math.max(cont ,max_cont);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_cont;
    }
}