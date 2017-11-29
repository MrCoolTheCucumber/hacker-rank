package strings;

import java.util.Scanner;
import java.util.Stack;

public class AlternatingCharacters {

    static int alternatingCharacters(String s){
        int numOfDeletes = 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(stack.empty()) {
                stack.push(c);
                continue;
            }

            if(stack.peek() == c) {
                numOfDeletes++;
                continue;
            }

            stack.push(c);
        }

        return numOfDeletes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }

}
