class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
         HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
      for(int i=2;i<arr.length;i++){
          if(!map.containsKey(arr[i])){
              ArrayList<Integer>list=new ArrayList<>();
              list.add(i);
              map.put(arr[i],list);  
              
          }else{
              map.get(arr[i]).add(i);
          
          }
      }
      List<List<Integer>>l=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              int search=0-arr[i]-arr[j];
              if(map.containsKey(search)){
                  ArrayList<Integer>li=new ArrayList<>();
                  
                  li=map.get(search);
                  for(int k=0;k<li.size();k++){
                      if(li.get(k)>j){
                          ArrayList<Integer>li2=new ArrayList<>();
                          li2.add(i);
                          li2.add(j);
                          li2.add(li.get(k));
                          l.add(li2);
                      }
                  }
              }
          }
    }
    return l;
    }
}