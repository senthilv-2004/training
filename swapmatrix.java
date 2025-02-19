import java.util.*;
public class twodarray
{
 public static void main(String args[])
 {
 
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter the row :");
  int row=sc.nextInt();
    System.out.println("Enter the column :");
    int column=sc.nextInt();
  int arr[][]=new int[row][column];
  System.out.println("Enter the array numbers:");
  for(int i=0;i<row;i++)
  {
      for(int j=0;j<column;j++){
            System.out.print("Enter element at position [" + i + "][" + j + "]: ");
   arr[i][j]=sc.nextInt();
  }}
  for(int i=0;i<row;i++)
  {
     for(int j=0;j<column;j++)  {
    System.out.print(arr[i][j]+ " ");
  }
  System.out.println("");
  } 
  int r1=0,c1=0,curr=0,prev=0;
  while(r1<row && c1<column)
  {
      if(r1+2==row ||c1+2==column){
      break;}
     prev=arr[r1+1][c1];
      for(int i=c1;i<column;i++)
      {
          curr=arr[r1][i];
          arr[r1][i]=prev;
          prev=curr;

      }
      r1++;
      for(int j=r1;j<column;j++)
      {
          curr=arr[j][r1+1];
          arr[j][r1+1]=prev;
          prev=curr;

      }
      c1++;

    
       for(int j=column-2;j>=0;j--)
      {
          curr=arr[c1+1][j];
          arr[c1+1][j]=prev;
          prev=curr;

      }
      r1--;
           System.out.println(prev);
       for(int i=r1+1;i<column-1;i++){ 
       arr[i][r1]=prev;
       
       }
       
  }System.out.println("swaped matrix:");
  for(int i=0;i<row;i++)
  {
     for(int j=0;j<column;j++)  {
    System.out.print(arr[i][j]+ " ");
  }
  System.out.println("");
  } 
  
  }
 }
