package faqs;

//Leetcode 1431 --The problem statement is kind of confusing here
/*
An integer array candies where candies[i] represents the number of candies the i-th kid has.
and An integer extraCandies.

For each kid, check if giving them all the
extraCandies would make them have the greatest number of candies among all kids.

You have:

A bunch of kids, each kid has some number of candies.

You also have some extra candies that you can give (same number of extra candies to any one kid).

Your task:
For each kid, check —
If I give all the extra candies to this kid, will they have the most candies compared to all the other kids?

If yes → true
If no → false

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]

If candies[i] + extraCandies >= maxCandies -> true.
Else -> false.
 */

import java.util.ArrayList;
import java.util.List;

public class kidwcandies {


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){

        List<Boolean> result = new ArrayList<>();//Creates an empty list named result.
        // We’ll store true or false here for each kid.

        int maxCandies = 0;

        for(int candy: candies){
            maxCandies = Math.max(maxCandies, candy); //Math.max(a, b) returns the bigger value between a and b.
        }

        for(int candy : candies){
            if (candy + extraCandies >= maxCandies){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }


    public static void main(String[] args) {

    }
        /*

        for(int candy: candies){ maxCandies = Math.max(maxCandies, candy); //Math.max(a, b)
        returns the bigger value between a and b. } here a candy is a single candy and that single
         candy traverses to all candies and gets all the total number of candies
        each is holding and maxCandies which was set to 0, now gets it max value from this candy array? right?


    for (int candy : candies)
    This is a for-each loop.
    It means: take each element from the array candies, one by one,
     and store it in the variable candy.
    So, if candies = [2, 3, 5, 1, 3], then candy will take values in this order:
    2 → 3 → 5 → 1 → 3.

    Math.max(maxCandies, candy)
This checks which is bigger: the current maxCandies or the current candy.
It returns the bigger one.

Dry run (with candies = [2, 3, 5, 1, 3])
Start: maxCandies = 0
First kid: Math.max(0, 2) = 2 → maxCandies = 2
Second kid: Math.max(2, 3) = 3 → maxCandies = 3
Third kid: Math.max(3, 5) = 5 → maxCandies = 5
Fourth kid: Math.max(5, 1) = 5 → maxCandies = 5
Fifth kid: Math.max(5, 3) = 5 → maxCandies = 5
End result: maxCandies = 5

About the candy variable in the second loop
for (int candy : candies) {
    if (candy + extraCandies >= maxCandies) {
        result.add(true);
    } else {
        result.add(false);
    }
}

Yes  this is a new loop.
A new variable named candy is declared again inside this loop’s scope.
It’s independent from the candy variable in the first loop.
In both loops, candy means: “one kid’s candy count” at that step of the loop.







     Find max maxCandies = 0
compare with 2 → max = 2

compare with 3 → max = 3

compare with 5 → max = 5

compare with 1 → still 5

compare with 3 → still 5
→ maxCandies = 5

Check each kid
2 + 3 = 5 → ≥ 5 → true
3 + 3 = 6 → ≥ 5 → true
5 + 3 = 8 → ≥ 5 → true
1 + 3 = 4 → < 5 → false
3 + 3 = 6 → ≥ 5 → true
Result → [true, true, true, false, true]
         */


}
