// User function Template for Java
class Solution {
    public static Character oneExtraCharacter(String s1, String s2) {
        // Your code here
  String a="",b="";
   if(s1.length()>s2.length()){
       a+=s2;
       b+=s1;
   }
   else{
       a+=s1;
       b+=s2;
   }int l=0,h=0,res=0,len=a.length();
   for(int i=0;i<len;i++){
       h+=b.charAt(i);
       l+=a.charAt(i);
   }
   h+=b.charAt(len);
   res=h-l;
   return (char)res;

    }
}