/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class printprime
{
     
     static boolean isPrime(int n){

          if(n==1||n==0)return false;
  
        
          for(int i=2; i<n; i++){
         
                if(n%i==0)return false;
          }
          return true;
    }
    public static void main (String[] args) 
    { 
        int N = 100; 
        for(int i=1; i<=N; i++){
           
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}

