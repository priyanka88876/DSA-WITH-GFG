class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        if (a.length > b.length) return medianOf2(b, a);
        int n = a.length, m = b.length, low = 0, high = n;
        while (low <= high) {
            int i = (low + high) / 2, j = (n + m + 1) / 2 - i;
            int maxL1 = (i == 0) ? Integer.MIN_VALUE : a[i - 1], minR1 = (i == n) ? Integer.MAX_VALUE : a[i];
            int maxL2 = (j == 0) ? Integer.MIN_VALUE : b[j - 1], minR2 = (j == m) ? Integer.MAX_VALUE : b[j];
            if (maxL1 <= minR2 && maxL2 <= minR1) 
                return (n + m) % 2 == 0 ? (Math.max(maxL1, maxL2) + Math.min(minR1, minR2)) / 2.0 : Math.max(maxL1, maxL2);
            if (maxL1 > minR2) high = i - 1; else low = i + 1;
        }
        return 0.0;
    }
}