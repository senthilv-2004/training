/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class converttoint{
    public static void main(String args[]){
       String a="9,9,9,8,8,8,7,7,7,6,6,6,5,5,5,4,4,4,3,3,3,2,2,2,1,1,1";
       String b="9,9,9,8,8,8,7,7,7,6,6,6,5,5,5,4,4,4,3,3,3,2,2,2,1,1,1";
      String[] a1=a.split(",");
      String[] b1=b.split(",");
     int sumA=0;
    int  sumB=0;
      for(int i=0;i<a1.length;i++){
          sumA += Integer.parseInt(a1[i]);
            sumB += Integer.parseInt(b1[i]);
      }
      System.out.println("sumA+sumB);
    }}


