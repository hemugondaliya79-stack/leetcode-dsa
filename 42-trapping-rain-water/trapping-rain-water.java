class Solution {
    public int trap(int[] height) {
        int lp =0;
        int rp = height.length-1;

        int lm =0;
        int rm =0;
        int water =0;


        while(lp < rp){
            if(height[lp] < height[rp]){
                if(lm <= height[lp]){
                    lm = height[lp];
                }
                else{
                    water = water + lm - height[lp];
                }
                lp++;
            }
            else{

                if(rm <= height[rp]){
                    rm = height[rp];
                }
                else{
                    water = water + rm - height[rp];
                }
                rp--;
            }
        }
        return water;
     }
}