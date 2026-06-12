class Solution {
  public:
    int equalSum(vector<int> &arr) {
        // code here
        int prefix=0;
        for(int i=0;  i<arr.size(); i++){
            prefix= prefix+ arr[i];
        }
        //step2
        int left=0;
        for(int i=0; i<arr.size(); i++){
            int difference= prefix-arr[i];
            if(difference==left){
                return i;
            }
            prefix= prefix- arr[i];
            left= left+arr[i];
            
        }
        return -1;
        
    }
};

