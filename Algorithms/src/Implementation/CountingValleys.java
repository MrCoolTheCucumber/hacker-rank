package Implementation;

import java.util.Scanner;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        char[] steps = in.next().toCharArray();
        int currentLevel = 0;
        int numberOfValleys = 0;
        int prevLevel;

        for (char step : steps) {
            prevLevel = currentLevel;
            if(step == 'U') {
                currentLevel += 1;
                if(currentLevel == 0 && prevLevel == -1) {
                    numberOfValleys += 1;
                }
            } else {
                currentLevel -= 1;
            }
        }

        System.out.println(numberOfValleys);
    }

}
