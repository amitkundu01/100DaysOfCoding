import java.util.*;
public class NewStack{ 
public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Boolean> out = new Stack<Boolean>();
        Stack<String> stack = new Stack<String>();
        while (sc.hasNext()) {
            String input=sc.next();
            stack.push(input);
        }
        sc.close();
        while(!stack.isEmpty()){
            int roundParantheses = 0;
            int squareParantheses = 0;
            int curlyParantheses = 0;
            String temp = stack.pop();
            
            char[] c = temp.toCharArray();
            Stack<Character> tempStack = new Stack<Character>();
            for (char ch : c) {
                tempStack.push(ch);
            }
            
            boolean control = true;
            
            while(!tempStack.isEmpty()){
                char ch = tempStack.pop();
                if(ch == '{'){
                    if(curlyParantheses == 0){
                        control = false;
                        break;
                    }else curlyParantheses--;         
                }
                else if(ch == '['){
                    if(squareParantheses == 0){
                        control = false;
                        break;
                    }else squareParantheses--;
                }
                else if(ch == '('){
                    if(roundParantheses==0){
                        control = false;
                        break;
                    }else roundParantheses--;
                }else if(ch == '}'){
                    curlyParantheses++;
                }
                else if(ch == ']'){
                    squareParantheses++;
                }
                else if(ch == ')'){
                    roundParantheses++;
                }
            }
            
            if(control){
                if(curlyParantheses == 0 && squareParantheses == 0 && roundParantheses == 0)
                    out.push(true);
                else out.push(false);
                
            }else out.push(false);
            
        }
        
        while(!out.isEmpty()){
            System.out.println(out.pop());
        }
        
    }


}
