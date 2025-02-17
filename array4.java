/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class array4{
    public static void main(String args[]){
        int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
        int prv=0;
        int c=0;
        int prv1=0;
        int c1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
            {
                c++;
            }
            else{ 
                if(c>prv)
                
               prv=c;
                    
                
               
               c=0;
            }
        }
            
            if(c>prv)
            
            prv=c;
            
    
             System.out.println(prv);
              for(int i=0;i<arr.length;i++)
              {
                  if (arr[i]==0)
                  {
                      c1++;
                  }
                   else{ 
                if(c1>prv1){
               prv1=c1;
                }
               c1=0;
                   }
              
             if(c1>prv1)
             {
            prv1=c1;
             }
              }
               System.out.println(prv1);
        }
    }

