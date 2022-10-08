import java.util.Scanner;
import java.util.HashMap;
public class Maping{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> l = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine(); 
        String s;
        
        for(int i=0;i<n;i++)
        {
           
            s = sc.nextLine();
            
            l.put(s,sc.nextInt());
            sc.nextLine(); 
        }
        
        while(sc.hasNext())
        {
            s = sc.nextLine();
            if(l.containsKey(s)){
             System.out.println(s+"="+l.get(s));
            }
            else{
               System.out.println("Not found");
            }
        }
    }
}
