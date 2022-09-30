import java.time.*;
import java.util.Scanner;

public class bubble {

 public static void sort(int A[])
    {
  
     int n = A.length;
     for(int i=0;i<=n;i++)
        for(int j=1;j<(n-i);j++)
        {
            if(A[j-1]>A[j])
            {
                int temp=A[j-1];
                A[j-1]=A[j];
                A[j]=temp;
            }

         }
    }
    public static void main(String[] args) {
    System.out.println(java.time.LocalDateTime.now());
     Scanner obj=new Scanner(System.in);
  System.out.println("Enter size of array: ");
  int k=obj.nextInt();
  int[] A=new int[k];
  System.out.println("Enter elements of array : ");
  for(int i=0;i<A.length;i++)
  {
   A[i]=obj.nextInt();
  }
  sort(A);
System.out.println("Sorted array is : ");
  for(int g=0;g<A.length;g++)
  { 
   System.out.print(A[g]);
   System.out.print(" ");
  
    }
    obj.close();
    System.out.println();
    System.out.println(java.time.LocalDateTime.now());
  }
}
