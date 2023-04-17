class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        int [] arr = new int [amount+1];
        Arrays.fill(arr,10001);
        // arr 초기화 
        arr[0] = 0;
        
        for(int i = 1; i <= amount; i++) {
            for(int j = 0; j< coins.length; j++ ) {
                if(i - coins[j] >= 0) {
                 arr[i] = Math.min(arr[i], arr[i-coins[j]]+1);   
                }
            }
        }
        if(arr[amount] == 10001) {
            return -1;
        } else {
         return arr[amount];   
        }
    }
}