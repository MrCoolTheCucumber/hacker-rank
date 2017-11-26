package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PasswordCracker {

    static HashSet<String> memory = new HashSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfTestCases = in.nextInt();

        while(numOfTestCases-- > 0) {
            int n = in.nextInt();
            String[] pass = new String[n];

            for(int i = 0; i < pass.length; ++i) {
                pass[i] = in.next();
            }

            String testcase = in.next();

            System.out.println(Solve(pass, testcase, new ArrayList<>()));
        }
    }

    public static String Solve(String[] pass, String testcase, ArrayList<String> currentPasswords) {
        if(testcase.length() == 0) {
            StringBuilder sb = new StringBuilder();
            for (String currentPassword : currentPasswords) {
                sb.append(currentPassword);
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);

            return sb.toString();
        }

        if(memory.contains(testcase)) {
            return "WRONG PASSWORD";
        }

        for (String p : pass) {
            if(p.length() > testcase.length()) {
                continue;
            }

            if(testcase.startsWith(p)) {
                currentPasswords.add(p);
                memory.add(testcase);
                testcase = testcase.substring(p.length());

                String out = Solve(pass, testcase, currentPasswords);
                if(!out.equals("WRONG PASSWORD")) {
                    return out;
                }
            }
        }

        return "WRONG PASSWORD";
    }
}
