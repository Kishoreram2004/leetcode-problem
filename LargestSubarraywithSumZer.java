import java.util.*;
public class LargestSubarraywithSumZer {
    public static int myMethod(int[] nums){
        HashMap<Integer, Integer> hs = new HashMap<>();
        int prefixSum = 0 ; 
        int maxi = 0;
        for(int i = 0 ; i< nums.length; i++){
            prefixSum +=nums[i];
            if(prefixSum == 0){
               maxi = Math.max(maxi, i+1); 
            }
            if(hs.containsKey(prefixSum)){
                int len = i -  hs.get(prefixSum);
                maxi = Math.max(maxi , len);

            }
            if(!hs.containsKey(prefixSum)){
                hs.put(prefixSum, i);
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        
        System.out.println(myMethod(arr));
    }   
}
