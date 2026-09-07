class Solution {
  public:
    vector<int> maxOfSubarrays(vector<int>& arr, int k) {
        // code here
          map<int,int>mp;
                int l=0;int r=k;int n=arr.size();
                vector<int>ans;
                for(int i=0;i<k;i++){
                    mp[arr[i]]++;
                }
                ans.push_back((*mp.rbegin()).first);
                while(r<n){
                    mp[arr[r]]++;
                    mp[arr[l]]--;
                    if(mp[arr[l]]==0)mp.erase(arr[l]);
                    ans.push_back((*mp.rbegin()).first);
                    r++;
                    l++;
                }
                return ans;
            
    }
};