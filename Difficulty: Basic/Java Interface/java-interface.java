class testClass implements in1 {
    public void display(int k) {
        // Add your code here.
         int primecount=0;
      for(int i=2;i<=k;i++)
      {
          int flag=0;
          for(int j=2;j<=i/2;j++)
          {
              if(i%j==0)
              {
                  flag=1;
                  break;
              }
          }
          if(flag==0)
          {
              primecount++;
          }
      }
      System.out.println(primecount);
   }
}
    
