import java.util.Scanner;

public class insertion {
 public static void sort(int[] A)
 {
   for(int j=1;j<A.length;j++)
         { int key=A[j];
           int i=j-1;
           while(i>=0 && A[i]>key)
           {
             A[i+1]=A[i];
             i=i-1;
           }
           A[i+1]=key;

         }
 }
 public static void main(String[] args) {
    long start=System.currentTimeMillis();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array: ");
  int n=sc.nextInt();
  int[] A=new int[n];
  System.out.println("Enter elements of array: ");
  for(int i=0;i<A.length;i++)
  {
   A[i]=sc.nextInt();
  }
  sort(A);
  System.out.println("Sorted array: ");
  for(int g=0;g<A.length;g++)
  { System.out.println(A[g]);
  }
  long end= System.currentTimeMillis();
  System.out.println("Execution Time"+((end-start)/1000f)+" seconds");
 }
}
