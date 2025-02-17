/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class array2{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            
            System.out.print(i);
            i++;
        }System.out.println("");
        for( int i=4;i>=0;i--){
                        System.out.print(arr[i]);
        }
    }
    
}