/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class array5{
    public static void main(String args[]){
        int arr[]={1,1,0,1,1,0,1,1,0,1};
      int temp=0;

      for(int i=0; i<arr.length;i++)
      {
          if(arr[i]==1){
            temp++;  
          }
      }
          for( int i=0;i<arr.length;i++)
          {
              if(i<temp){
                  arr[i]=1;
              }
              else{
                  arr[i]=0;
              }
          }
          
      
          
            for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}
}     
      

