class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        ArrayList<Integer> list= new ArrayList<> ();
        HashMap<Integer,Integer> map= new HashMap<> ();
        HashSet<Integer> set= new HashSet<> ();
        for(int a :arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a : arr)
        {
            if(map.get(a)>arr.length/3 && set.add(a))
            {
                list.add(a);
            }
        }
        Collections.sort(list);
        return list;
    }
}


    