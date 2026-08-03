class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuffled[]=new int[2*n];
        int i=0;
        int j=n;
        for(int k=0;k<2*n;k++){
            if(k%2==0){shuffled[k]=nums[i];
                i++;
            }
            if(k%2!=0){shuffled[k]=nums[j];
                j++;
            }

        }

        

        return shuffled;
    }
}