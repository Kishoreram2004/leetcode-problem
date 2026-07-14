import java.util.*;

public class LongestsubarraywithsumK {
    public static int myMethod(int[] nums, int k){
        HashMap<Integer, Integer> hs= new HashMap<>();
        int maxi = 0;
        int prefixSum = 0;
        for(int i = 0 ; i < nums.length; i++){
            prefixSum+= nums[i];
            if(prefixSum==k){
                maxi = Math.max(maxi, i+1);
            }
            if(hs.containsKey(prefixSum-k)){
                int len = i - hs.get(prefixSum-k);
                maxi = Math.max(maxi, len); 
            }
            if(!hs.containsKey(prefixSum)){
                hs.put(prefixSum, i);
            }
        }

        return maxi;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(myMethod(arr, k));
    }    
}
