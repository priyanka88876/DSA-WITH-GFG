class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
          int[] sol=new int[2];
        int[] freq=new int[(int)Math.pow(10,5)];
        int len=arr.length,sol_index=0;
        
        for(int i=0;i<len;i++){
            freq[arr[i]]+=1;
            if(freq[arr[i]]==2){
                sol[sol_index]=arr[i];
                sol_index++;
                if(sol_index==2){
                    break;
                }
            }
        }
        
        return sol;         

    }
}