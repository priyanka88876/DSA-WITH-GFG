class Solution {
    public static String encode(String s) {
        // code here
         StringBuilder sb=new StringBuilder();
      int cnt=1;
      char c=' ';
      for(int i=0;i<s.length()-1;i++){
          c=s.charAt(i+1);
          char ch=s.charAt(i);
          if(ch==s.charAt(i+1)){
              cnt++;
              
          }else{
              if(cnt==1)
              {
                  sb.append(s.charAt(i));
              sb.append(cnt);
              }else{
                  
              
              sb.append(s.charAt(i-1));
              sb.append(cnt);
              cnt=1;
              }
          }
      }
       sb.append(s.charAt(s.length() - 1));
       sb.append(cnt);
       
       return sb.toString();
        
    }
}

