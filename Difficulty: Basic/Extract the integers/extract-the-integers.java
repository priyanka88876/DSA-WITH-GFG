class Solution {
    public List<String> extractInt(String s) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        String sr="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9'){
                sr+=ch;
                if(i==s.length()-1){
                    list.add(sr);
                }
            }
            else {
                if(!sr.isEmpty()){
               list.add(sr);
                }
               sr="";
            }
        }
        return list;
  
    }
}