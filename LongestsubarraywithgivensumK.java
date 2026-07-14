public class LongestsubarraywithgivensumK{
    public static int myMethod(int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = 0;
        int maxi = 0 ;
        while(j<arr.length){
            sum+=arr[j];
            if(sum==k){
                maxi = Math.max(maxi, j-i+1);
            }
            while(sum>k){
                sum-=arr[i++];
            }
            j++;

        }
        return maxi;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 1, 1, 1, 1};
        int k = 6;
        System.out.println(myMethod(arr, k));
    }    
}   
