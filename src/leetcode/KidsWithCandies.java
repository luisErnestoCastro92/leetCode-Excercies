package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> maxCandiesStatus = new ArrayList<>();
        int kidWithMaxCandies = findTheKidWithMaxCandies(candies);
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            if (candies[i] >= kidWithMaxCandies) {
                maxCandiesStatus.add(true);
            } else {
                maxCandiesStatus.add(false);
            }
        }
        return maxCandiesStatus;
    }

    public static int findTheKidWithMaxCandies(int[] candies) {
        int kidWithMaxCandies = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > kidWithMaxCandies) {
                kidWithMaxCandies = candies[i];
            }
        }
        return kidWithMaxCandies;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(KidsWithCandies.findTheKidWithMaxCandies(candies));
        System.out.println(KidsWithCandies.kidsWithCandies(candies, extraCandies));
    }

}
