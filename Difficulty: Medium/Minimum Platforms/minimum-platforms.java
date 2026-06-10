class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
         Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0, currPlatforms = 0, maxPlatforms = 0;
        while(i < arr.length && j < arr.length){
            if(arr[i] <= dep[j]){
                currPlatforms++;
                maxPlatforms = Math.max(maxPlatforms, currPlatforms);
                i++;
            }else{
                currPlatforms--;
                j++;
            }
        }
        return maxPlatforms;
    }


    
}
