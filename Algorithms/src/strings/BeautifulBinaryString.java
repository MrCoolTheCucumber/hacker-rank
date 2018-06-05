package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {

    static int minSteps(int n, String B){
        int numOfSteps = 0;

        Pattern pattern = Pattern.compile("010");
        Matcher matcher = pattern.matcher(B);
        while (matcher.find()) {
            numOfSteps++;
        }

        return numOfSteps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }

}
