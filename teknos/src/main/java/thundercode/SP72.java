package thundercode;
//https://isaaclo97.github.io/problems/AceptaelReto/470.html
import java.util.Scanner;
import java.util.Stack;

public class SP72 {
    public static void main(String[] args) {
        String line;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            line = sc.nextLine();
            Stack<Integer> S = new Stack<>();
            long R;
            long A;
            int V;
            R=A=V=0;
            for(int i=0; i<line.length();i++)
            {
                if(line.charAt(i)=='R') { R++; S.push(0);}
                else if(line.charAt(i)=='A' &&A<R && S.peek()!=1) { A++; S.push(1);}
                else if(line.charAt(i)=='V' && R>0 && A>0 && S.peek()==1) { V++; R--; A--; S.pop(); S.pop();}
                else { R=A=0; while(!S.empty()) S.pop();}
            }
            System.out.println(V);
        }
    }
}