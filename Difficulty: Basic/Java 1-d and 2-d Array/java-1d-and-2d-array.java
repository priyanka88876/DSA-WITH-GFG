class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
      int sum=0;
        int max=0;
        ArrayList<Integer> ls=new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            
            if(b[i]>max) {
                max=b[i];
            }
            
            for(int j=0;j<n;j++) {
                
                if(i==j) {
                    sum=sum+a[i][j];
                }
            }
        }
        
        ls.add(sum);
        ls.add(max);
        
        return ls;
    }
}
