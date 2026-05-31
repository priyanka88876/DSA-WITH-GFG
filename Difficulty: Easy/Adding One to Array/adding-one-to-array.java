// User function Template for Java

class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
          int n = arr.length;

        int carry = 1;

    Vector<Integer> ans = new Vector<>();

        for(int i = n - 1;i >= 0;i--){

          int temp = arr[i] + carry;

          ans.add(0,temp % 10);

          carry = temp / 10;

                

    }

    if(carry == 1){

        ans.add(0,1);

    }

    return ans;

         

    


    }
}