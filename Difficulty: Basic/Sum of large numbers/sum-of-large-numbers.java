// User function Template for Java

class Solution {
    public String add(String s1, String s2){
    StringBuilder sb = new StringBuilder();
    int i=s1.length()-1;
    int j =s2.length()-1;
    int carry = 0;
    while(i >= 0 || j >=0 || carry > 0) {
        int sum = carry;
        if(i >= 0) sum +=s1.charAt(i--) - '0';
        if(j >= 0) sum +=s2.charAt(j--) - '0';
        sb.append(sum % 10);
        carry = sum / 10;
    }
    return sb.reverse().toString();
    }
}
        
    
