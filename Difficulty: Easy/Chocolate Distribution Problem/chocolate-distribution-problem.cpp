//Back-end complete function Template for C++

int minDiff(vector<int> &arr, int k) {
    // code here
     if (k == 0 || arr.size() < k) return 0;

    sort(arr.begin(), arr.end());

    int minDiff = INT_MAX;

    for (int i = 0; i <= arr.size() - k; i++) {
        int diff = arr[i + k - 1] - arr[i];
        minDiff = min(minDiff, diff);
    }

    return minDiff;

}