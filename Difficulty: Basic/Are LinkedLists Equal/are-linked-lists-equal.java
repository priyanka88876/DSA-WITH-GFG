// User function Template for Java
class Solution {
    public static boolean areEqual(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
        // Your code here
         boolean flag=true;
        if(ll1.size()==ll2.size())
        {
            for(int i=0;i<ll1.size();i++)
            {
                if(ll1.get(i)!=ll2.get(i))
                {
                    flag=false;
                    break;
                }
            }
        }else{
            flag=false;
        }
        if(flag)
          return true;
          else
           return false;
  
    }
}
