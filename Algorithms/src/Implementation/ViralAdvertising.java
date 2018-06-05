package Implementation;

import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int numOfLikes = 0;
        int numOfPeople = 5;

        for(int i = 0; i < n; ++i) {
            int numOfNewPeople = 0;
            for(int j = 0; j < Math.floor(numOfPeople / 2); ++j) {
                numOfLikes += 1;
                numOfNewPeople += 3;
            }
            numOfPeople = numOfNewPeople;
        }

        System.out.println(numOfLikes);
    }
}
