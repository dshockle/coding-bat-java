package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2 {

	public static void main(String[] args) {
        System.out.println("countEvens");
        System.out.println(countEvens(new int[] { 2, 1, 2, 3, 4}) == 3);
        System.out.println(countEvens(new int[] { 2, 2, 0}) == 3);
        System.out.println(countEvens(new int[] { 1, 3, 5}) == 0);

        System.out.println("countEvensLambda");
        System.out.println(countEvensLambda(new int[] { 2, 1, 2, 3, 4 }) == 3);
        System.out.println(countEvensLambda(new int[] { 2, 2, 0 }) == 3);
        System.out.println(countEvensLambda(new int[] { 1, 3, 5 }) == 0);

        System.out.println("bigDiff");
        System.out.println(bigDiff(new int[] { 10, 3, 5, 6 }) == 7);
        System.out.println(bigDiff(new int[] { 7, 2, 10, 9 }) == 8);
        System.out.println(bigDiff(new int[] { 2, 10, 7, 2 }) == 8);

        System.out.println("bigDiffLambda");
        System.out.println(bigDiffLambda(new int[] { 10, 3, 5, 6 }) == 7);
        System.out.println(bigDiffLambda(new int[] { 7, 2, 10, 9 }) == 8);
        System.out.println(bigDiffLambda(new int[] { 2, 10, 7, 2 }) == 8);
        
        System.out.println("centeredAverage");
        System.out.println(centeredAverage(new int[] { 1, 2, 3, 4, 100 }) == 3);
        System.out.println(centeredAverage(new int[] { 1, 1, 5, 5, 10, 8, 7 }) == 5);
        System.out.println(centeredAverage(new int[] { -10, -4, -2, -4, -2, 0}) == -3);

        System.out.println("centeredAverageLambda");
        System.out.println(centeredAverageLambda(new int[] { 1, 2, 3, 4, 100 }) == 3);
        System.out.println(centeredAverageLambda(new int[] { 1, 1, 5, 5, 10, 8, 7 }) == 5);
        System.out.println(centeredAverageLambda(new int[] { -10, -4, -2, -4, -2, 0 }) == -3);
        
        System.out.println("sum13");
        System.out.println(sum13(new int[] { 1, 13, 2, 2, 2, 1 }, 13, true) == 6);
        System.out.println(sum13(new int[] { 13, 13, 2, 1, 1}, 13, true) == 2);
        System.out.println(sum13(new int[] { 1, 2, 2, 1, 13}, 13, true) == 6);

        System.out.println("sum13Lambda");
        System.out.println(sum13Lambda(new int[] { 1, 13, 2, 2, 2, 1 }, 13, true) == 6);
        System.out.println(sum13Lambda(new int[] { 13, 13, 2, 1, 1 }, 13, true) == 2);
        System.out.println(sum13Lambda(new int[] { 1, 2, 2, 1, 13 }, 13, true) == 6);
        
        System.out.println("sum67");
        System.out.println(sum67(new int[] { 1, 2, 2}, 6, 7) == 5);
        System.out.println(sum67(new int[] { 1, 2, 2, 6, 99, 99, 7}, 6, 7) == 5);
        System.out.println(sum67(new int[] { 1, 1, 6, 7, 2}, 6, 7) == 4);
        
        System.out.println("has22");
        System.out.println(has22(new int[] { 1, 2, 2}, 2, 2) == true);
        System.out.println(has22(new int[] { 1, 2, 1, 2}, 2, 2) == false);
        System.out.println(has22(new int[] { 2, 1, 2}, 2, 2) == false);

        System.out.println("has22Lambda");
        System.out.println(has22Lambda(new int[] { 1, 2, 2 }, 2, 2) == true);
        System.out.println(has22Lambda(new int[] { 1, 2, 1, 2 }, 2, 2) == false);
        System.out.println(has22Lambda(new int[] { 2, 1, 2 }, 2, 2) == false);
        /*
        System.out.println("lucky13");
        System.out.println(lucky13(new int[] { 0, 2, 4}, 1, 3) == true);
        System.out.println(lucky13(new int[] { 1, 2, 3}, 1, 3) == false);
        System.out.println(lucky13(new int[] { 1, 2, 4}, 1, 3) == false);
        
        System.out.println("sum28");
        System.out.println(sum28(new int[] { 2, 3, 2, 2, 4, 2}, 2, 8) == true);
        System.out.println(sum28(new int[] { 2, 3, 2, 2, 4, 2, 2}, 2, 8) == false);
        System.out.println(sum28(new int[] { 1, 2, 3, 4}, 2, 8) == false);

        System.out.println("sum28Lambda");
        System.out.println(sum28Lambda(new int[] { 2, 3, 2, 2, 4, 2 }, 2, 8) == true);
        System.out.println(sum28Lambda(new int[] { 2, 3, 2, 2, 4, 2, 2 }, 2, 8) == false);
        System.out.println(sum28Lambda(new int[] { 1, 2, 3, 4 }, 2, 8) == false);

        System.out.println("more14");
        System.out.println(more14(new int[] { 1, 4, 1}, 1, 4) == true);
        System.out.println(more14(new int[] { 1, 4, 1, 4}, 1, 4) == false);
        System.out.println(more14(new int[] { 1, 1}, 1, 4) == true);

        System.out.println("more14Lambda");
        System.out.println(more14Lambda(new int[] { 1, 4, 1 }, 1, 4) == true);
        System.out.println(more14Lambda(new int[] { 1, 4, 1, 4 }, 1, 4) == false);
        System.out.println(more14Lambda(new int[] { 1, 1 }, 1, 4) == true);

        System.out.println("fizzArray");
        System.out.println(Arrays.equals(fizzArray(4), new int[] { 0, 1, 2, 3 }));
        System.out.println(Arrays.equals(fizzArray(1), new int[] { 0 }));
        System.out.println(Arrays.equals(fizzArray(10), new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));

        System.out.println("fizzArrayLambda");
        System.out.println(Arrays.equals(fizzArrayLambda(4), new int[] { 0, 1, 2, 3 }));
        System.out.println(Arrays.equals(fizzArrayLambda(1), new int[] { 0 }));
        System.out.println(Arrays.equals(fizzArrayLambda(10), new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));

        System.out.println("only14");
        System.out.println(only14(new int[] { 1, 4, 1, 4}) == true);
        System.out.println(only14(new int[] { 1, 4, 2, 4}) == false);
        System.out.println(only14(new int[] { 1, 1}) == true);

        System.out.println("only14Lambda");
        System.out.println(only14Lambda(new int[] { 1, 4, 1, 4 }) == true);
        System.out.println(only14Lambda(new int[] { 1, 4, 2, 4 }) == false);
        System.out.println(only14Lambda(new int[] { 1, 1 }) == true);

        System.out.println("fizzArray2");
        System.out.println(Arrays.equals(fizzArray2(4), new String[] { "0", "1", "2", "3"}));
        System.out.println(Arrays.equals(fizzArray2(10), new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
        System.out.println(Arrays.equals(fizzArray2(2), new String[] { "0", "1"}));

        System.out.println("fizzArray2Lambda");
        System.out.println(Arrays.equals(fizzArray2Lambda(4), new String[] { "0", "1", "2", "3" }));
        System.out.println(Arrays.equals(fizzArray2Lambda(10), new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        System.out.println(Arrays.equals(fizzArray2Lambda(2), new String[] { "0", "1" }));

        System.out.println("no14");
        System.out.println(no14(new int[] { 1, 2, 3 }, 1, 4) == true);
        System.out.println(no14(new int[] { 1, 2, 3, 4}, 1, 4) == false);
        System.out.println(no14(new int[] { 2, 3, 4}, 1, 4) == true);

        System.out.println("no14Lambda");
        System.out.println(no14Lambda(new int[] { 1, 2, 3 }, 1, 4) == true);
        System.out.println(no14Lambda(new int[] { 1, 2, 3, 4 }, 1, 4) == false);
        System.out.println(no14Lambda(new int[] { 2, 3, 4 }, 1, 4) == true);

        System.out.println("isEverywhere");
        System.out.println(isEverywhere(new int[] { 1, 2, 1, 3}, 1) == true);
        System.out.println(isEverywhere(new int[] { 1, 2, 1, 3}, 2) == false);
        System.out.println(isEverywhere(new int[] { 1, 2, 1, 3, 4}, 1) == false);

        System.out.println("isEverywhereLambda");
        System.out.println(isEverywhereLambda(new int[] { 1, 2, 1, 3 }, 1) == true);
        System.out.println(isEverywhereLambda(new int[] { 1, 2, 1, 3 }, 2) == false);
        System.out.println(isEverywhereLambda(new int[] { 1, 2, 1, 3, 4 }, 1) == false);

        System.out.println("either24");
        System.out.println(either24(new int[] { 1, 2, 2}, 2, 4) == true);
        System.out.println(either24(new int[] { 4, 4, 1}, 2, 4) == true);
        System.out.println(either24(new int[] { 4, 4, 1, 2, 2}, 2, 4) == false);

        System.out.println("matchUp");
        System.out.println(matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 10 }) == 2);
        System.out.println(matchUp(new int[] { 1, 2, 3}, new int[] { 2, 3, 5}) == 3);
        System.out.println(matchUp(new int[] { 1, 2, 3}, new int[] { 2, 3, 3}) == 2);

        System.out.println("matchUpLambda");
        System.out.println(matchUpLambda(new int[] { 1, 2, 3 }, new int[] { 2, 3, 10 }) == 2);
        System.out.println(matchUpLambda(new int[] { 1, 2, 3 }, new int[] { 2, 3, 5 }) == 3);
        System.out.println(matchUpLambda(new int[] { 1, 2, 3 }, new int[] { 2, 3, 3 }) == 2);

        System.out.println("has77");
        System.out.println(has77(new int[] { 1, 7, 7 }) == true);
        System.out.println(has77(new int[] { 1, 7, 1, 7 }) == true);
        System.out.println(has77(new int[] { 1, 7, 1, 1, 7 }) == false);

        System.out.println("has77Lambda");
        System.out.println(has77Lambda(new int[] { 1, 7, 7 }) == true);
        System.out.println(has77Lambda(new int[] { 1, 7, 1, 7 }) == true);
        System.out.println(has77Lambda(new int[] { 1, 7, 1, 1, 7 }) == false);

        System.out.println("modThree");
        System.out.println(modThree(new int[] { 2, 1, 3, 5}) == true);
        System.out.println(modThree(new int[] { 2, 1, 2, 5}) == false);
        System.out.println(modThree(new int[] { 2, 4, 2, 5}) == true);
        System.out.println(modThree(new int[] { 1 }) == false);
        System.out.println(modThree(new int[] { }) == false);

        System.out.println("modThreeLambda");
        System.out.println(modThreeLambda(new int[] { 2, 1, 3, 5 }) == true);
        System.out.println(modThreeLambda(new int[] { 2, 1, 2, 5 }) == false);
        System.out.println(modThreeLambda(new int[] { 2, 4, 2, 5 }) == true);
        System.out.println(modThreeLambda(new int[] { 1 }) == false);
        System.out.println(modThreeLambda(new int[] { }) == false);

        System.out.println("haveThree");
        System.out.println(haveThree(new int[] { 3, 1, 3, 1, 3 }) == true);
        System.out.println(haveThree(new int[] { 3, 1, 3, 3}) == false);
        System.out.println(haveThree(new int[] { 3, 4, 3, 3, 4}) == false);

        System.out.println("haveThreeLambda");
        System.out.println(haveThreeLambda(new int[] { 3, 1, 3, 1, 3 }) == true);
        System.out.println(haveThreeLambda(new int[] { 3, 1, 3, 3 }) == false);
        System.out.println(haveThreeLambda(new int[] { 3, 4, 3, 3, 4 }) == false);

        System.out.println("has12");
        System.out.println(has12(new int[] { 1, 2, 1}, 1, 2) == true);
        System.out.println(has12(new int[] { 3, 1, 2}, 1, 2) == true);
        System.out.println(has12(new int[] { 3, 2, 1}, 1, 2) == false);

        System.out.println("twoTwo");
        System.out.println(twoTwo(new int[] { 4, 2, 2}) == true);
        System.out.println(twoTwo(new int[] { 2, 2, 4}) == true);
        System.out.println(twoTwo(new int[] { 2, 4, 2}) == false);

        System.out.println("twoTwoLambda");
        System.out.println(twoTwoLambda(new int[] { 4, 2, 2 }) == true);
        System.out.println(twoTwoLambda(new int[] { 2, 2, 4 }) == true);
        System.out.println(twoTwoLambda(new int[] { 2, 4, 2 }) == false);

        System.out.println("sameEnds");
        System.out.println(sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6}, 1) == false);
        System.out.println(sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6}, 2) == true);
        System.out.println(sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6}, 3) == false);

        System.out.println("sameEndsLambda");
        System.out.println(sameEndsLambda(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 1) == false);
        System.out.println(sameEndsLambda(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 2) == true);
        System.out.println(sameEndsLambda(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 3) == false);
        
        System.out.println("tripleUp");
        System.out.println(tripleUp(new int[] { 1, 4, 5, 6, 2}) == true);
        System.out.println(tripleUp(new int[] { 1, 2, 3})  == true);
        System.out.println(tripleUp(new int[] { 1, 2, 4})  == false);

        System.out.println("tripleUpLambda");
        System.out.println(tripleUpLambda(new int[] { 1, 4, 5, 6, 2}) == true);
        System.out.println(tripleUpLambda(new int[] { 1, 2, 3})  == true);
        System.out.println(tripleUpLambda(new int[] { 1, 2, 4})  == false);

        System.out.println("fizzArray3");
        System.out.println(Arrays.equals(fizzArray3(5, 10), new int[] { 5, 6, 7, 8, 9 }));
        System.out.println(Arrays.equals(fizzArray3(11, 18), new int[] { 11, 12, 13, 14, 15, 16, 17}));
        System.out.println(Arrays.equals(fizzArray3(1, 3), new int[] { 1, 2}));

        System.out.println("fizzArray3Lambda");
        System.out.println(Arrays.equals(fizzArray3Lambda(5, 10), new int[] { 5, 6, 7, 8, 9 }));
        System.out.println(Arrays.equals(fizzArray3Lambda(11, 18), new int[] { 11, 12, 13, 14, 15, 16, 17 }));
        System.out.println(Arrays.equals(fizzArray3Lambda(1, 3), new int[] { 1, 2 }));

        System.out.println("shiftLeft");
        System.out.println(Arrays.equals(shiftLeft(new int[] { 6, 2, 5, 3 }), new int[] { 2, 5, 3, 6 }));
        System.out.println(Arrays.equals(shiftLeft(new int[] { 1, 2}), new int[] { 2, 1}));
        System.out.println(Arrays.equals(shiftLeft(new int[] { 1 }), new int[] { 1 }));

        System.out.println("tenRun");
        System.out.println(Arrays.equals(tenRun(new int[] { 10, 1, 9, 20 }), new int[] { 10, 10, 10, 20 }));
        System.out.println(Arrays.equals(tenRun(new int[] { 1 }), new int[] { 1 }));
        System.out.println(Arrays.equals(tenRun(new int[] { }), new int[] { }));

        System.out.println("pre4");
        System.out.println(Arrays.equals(pre4(new int[] { 1, 2, 4, 1 }), new int[] { 1, 2 }));
        System.out.println(Arrays.equals(pre4(new int[] { 3, 1, 4 }), new int[] { 3, 1 }));
        System.out.println(Arrays.equals(pre4(new int[] { 1, 4, 4 }), new int[] { 1 }));
        System.out.println(Arrays.equals(pre4(new int[] { 4, 4 }), new int[] { }));

        System.out.println("pre4Lambda");
        System.out.println(Arrays.equals(pre4Lambda(new int[] { 1, 2, 4, 1 }), new int[] { 1, 2 }));
        System.out.println(Arrays.equals(pre4Lambda(new int[] { 3, 1, 4 }), new int[] { 3, 1 }));
        System.out.println(Arrays.equals(pre4Lambda(new int[] { 1, 4, 4 }), new int[] { 1 }));
        System.out.println(Arrays.equals(pre4Lambda(new int[] { 4, 4 }), new int[] { }));

        System.out.println("post4");
        System.out.println(Arrays.equals(post4(new int[] { 2, 4, 1, 2}), new int[] { 1, 2}));
        System.out.println(Arrays.equals(post4(new int[] { 4, 1, 4, 2}), new int[] { 2 }));
        System.out.println(Arrays.equals(post4(new int[] { 4, 4, 1, 2, 3}), new int[] { 1, 2, 3}));
        System.out.println(Arrays.equals(post4(new int[] { 4, 4}), new int[] { }));

        System.out.println("post4Lambda");
        System.out.println(Arrays.equals(post4Lambda(new int[] { 2, 4, 1, 2 }), new int[] { 1, 2 }));
        System.out.println(Arrays.equals(post4Lambda(new int[] { 4, 1, 4, 2 }), new int[] { 2 }));
        System.out.println(Arrays.equals(post4Lambda(new int[] { 4, 4, 1, 2, 3 }), new int[] { 1, 2, 3 }));
        System.out.println(Arrays.equals(post4Lambda(new int[] { 4, 4 }), new int[] { }));

        System.out.println("zeroFront");
        System.out.println(Arrays.equals(zeroFront(new int[] { 1, 0, 0, 1}), new int[] { 0, 0, 1, 1}));
        System.out.println(Arrays.equals(zeroFront(new int[] { 0, 1, 1, 0, 1}), new int[] { 0, 0, 1, 1, 1}));
        System.out.println(Arrays.equals(zeroFront(new int[] { 1, 0}), new int[] { 0, 1}));
        System.out.println(Arrays.equals(zeroFront(new int[] { }), new int[] { }));

        System.out.println("withoutTen");
        System.out.println(Arrays.equals(withoutTen(new int[] { 1, 10, 10, 2}), new int[] { 1, 2, 0, 0}));
        System.out.println(Arrays.equals(withoutTen(new int[] { 10, 2, 10}), new int[] { 2, 0, 0}));
        System.out.println(Arrays.equals(withoutTen(new int[] { 1, 99, 10}), new int[] { 1, 99, 0}));
        System.out.println(Arrays.equals(withoutTen(new int[] { }), new int[] { }));

        System.out.println("zeroMax");
        System.out.println(Arrays.equals(zeroMax(new int[] { 0, 5, 0, 2 }), new int[] { 5, 5, 0, 2}));
        System.out.println(Arrays.equals(zeroMax(new int[] { 4, 0, 4, 3}), new int[] { 4, 3, 4, 3}));
        System.out.println(Arrays.equals(zeroMax(new int[] { 0, 1, 0}), new int[] { 1, 1, 0}));

        System.out.println("zeroMaxLambda");
        System.out.println(Arrays.equals(zeroMaxLambda(new int[] { 0, 5, 0, 2 }), new int[] { 5, 5, 0, 2 }));
        System.out.println(Arrays.equals(zeroMaxLambda(new int[] { 4, 0, 4, 3 }), new int[] { 4, 3, 4, 3 }));
        System.out.println(Arrays.equals(zeroMaxLambda(new int[] { 0, 1, 0 }), new int[] { 1, 1, 0 }));

        System.out.println("evenOdd");
        System.out.println(Arrays.equals(evenOdd(new int[] { -1, 0, -1, 0, 0, -1 }), new int[] { 0, 0, 0, -1, -1, -1 }));
        System.out.println(Arrays.equals(evenOdd(new int[] { 3, 3, 2 }), new int[] { 2, 3, 3 }));
        System.out.println(Arrays.equals(evenOdd(new int[] { 2, 2, 2 }), new int[] { 2, 2, 2 }));

        System.out.println("evenOddLambda");
        System.out.println(Arrays.equals(evenOddLambda(new int[] { -1, 0, -1, 0, 0, -1 }), new int[] { 0, 0, 0, -1, -1, -1 }));
        System.out.println(Arrays.equals(evenOddLambda(new int[] { 3, 3, 2 }), new int[] { 2, 3, 3 }));
        System.out.println(Arrays.equals(evenOddLambda(new int[] { 2, 2, 2 }), new int[] { 2, 2, 2 }));

        System.out.println("fizzBuzz");
        System.out.println(Arrays.equals(fizzBuzz(1, 6), new String[] { "1", "2", "Fizz", "4", "Buzz"}));
        System.out.println(Arrays.equals(fizzBuzz(1, 8), new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}));
        System.out.println(Arrays.equals(fizzBuzz(1, 11), new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}));

        System.out.println("fizzBuzzLambda");
        System.out.println(Arrays.equals(fizzBuzzLambda(1, 6), new String[] { "1", "2", "Fizz", "4", "Buzz" }));
        System.out.println(Arrays.equals(fizzBuzzLambda(1, 8), new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7" }));
        System.out.println(Arrays.equals(fizzBuzzLambda(1, 11), new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz" }));
        */
	}

    /*
    1. countEvens 
    Return the number of even ints in the given array. 

    countEvens({2, 1, 2, 3, 4}) → 3
    countEvens({2, 2, 0}) → 3
    countEvens({1, 3, 5}) → 0
    */
    public static int countEvens(int[] nums)
    {
        int count = 0;

        for (int n : nums)
            if (n % 2 == 0)
                count++;

        return count;
    }

    /*
    Return the number of even ints in the given array. 
    Use Lambda. Do not use loops.

    countEvensLambda({2, 1, 2, 3, 4}) → 3
    countEvensLambda({2, 2, 0}) → 3
    countEvensLambda({1, 3, 5}) → 0
    */
    public static int countEvensLambda(int[] nums)
    {
        //return nums.Where(a => a % 2 == 0).Count();
    	return (int)Arrays.stream(nums).filter(x -> x % 2 == 0).count();
    }

    /*
    2. bigDiff 
    Given an array length 1 or more of ints, return the difference between 
    the largest and smallest values in the array.

    bigDiff({10, 3, 5, 6}) → 7
    bigDiff({7, 2, 10, 9}) → 8
    bigDiff({2, 10, 7, 2}) → 8
    */
    public static int bigDiff(int[] nums)
    {
        int max = nums[0];
        int min = nums[0];

        for (int n : nums)
        {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }

        return max - min;
    }


    /*
    Given an array length 1 or more of ints, return the difference between 
    the largest and smallest values in the array. Use Lambda. Do not use loops.

    bigDiffLambda({10, 3, 5, 6}) → 7
    bigDiffLambda({7, 2, 10, 9}) → 8
    bigDiffLambda({2, 10, 7, 2}) → 8
    */
    public static int bigDiffLambda(int[] nums)
    {
        IntSummaryStatistics stat = Arrays.stream(nums).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
    	return max - min;
    }

    /*
    3. centeredAverage 
    Return the "centered" average of an array of ints, which we'll say is the mean average 
    of the values, except ignoring the largest and smallest values in the array. If there 
    are multiple copies of the smallest value, ignore just one copy, and likewise for the 
    largest value. Use int division to produce the final average. You may assume that the 
    array is length 3 or more. 

    centeredAverage({1, 2, 3, 4, 100}) → 3
    centeredAverage({1, 1, 5, 5, 10, 8, 7}) → 5
    centeredAverage({-10, -4, -2, -4, -2, 0}) → -3
    */
    public static int centeredAverage(int[] nums)
    {
        int max = nums[0];
        int min = nums[0];
        int sum = 0;

        for (int n : nums)
        { 
            if (n > max)
                max = n;
            if (n < min)
                min = n;
            sum += n;
        }

        return (sum - max - min) / (nums.length - 2);
    }

    /*
    Return the "centered" average of an array of ints, which we'll say is the mean average 
    of the values, except ignoring the largest and smallest values in the array. If there 
    are multiple copies of the smallest value, ignore just one copy, and likewise for the 
    largest value. Use int division to produce the final average. You may assume that the 
    array is length 3 or more. Use Lambda. Do not use loops.

    centeredAverageLambda({1, 2, 3, 4, 100}) → 3
    centeredAverageLambda({1, 1, 5, 5, 10, 8, 7}) → 5
    centeredAverageLambda({-10, -4, -2, -4, -2, 0}) → -3
    */
    public static int centeredAverageLambda(int[] nums)
    {
        IntSummaryStatistics stat = Arrays.stream(nums).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        int sum = (int)stat.getSum();
        int len = nums.length;
    	return (sum - max - min) / (len - 2);
    }

    /*
    4. sum13
    Return the sum of the numbers in the array, returning 0 for an empty array. 
    Do not count elements matching the numberToSkip and if alsoSkipTrailing is 
    true then skip any element immediately following the numberToSkip.

    sum13({13, 2, 1, 2, 2, 1}, 13, true) → 6
    sum13({13, 13, 2, 1, 1}, 13, true) → 2
    sum13({1, 2, 2, 1, 13}, 13, true) → 6
    */
    public static int sum13(int[] nums, int numberToSkip, boolean alsoSkipTrailing)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
      		if (nums[i] == numberToSkip)
      			continue;
      		if (alsoSkipTrailing && i > 0 && nums[i-1] == numberToSkip)
      			continue;
       		sum += nums[i];
        }
        return sum;
    }


    /*
    Return the sum of the numbers in the array, returning 0 for an empty array. 
    Do not count elements matching the numberToSkip and if alsoSkipTrailing is 
    true then skip any element immediately following the numberToSkip.
    Use Lambda. Do not use loops.
    sum13Lambda({13, 2, 1, 2, 2, 1}, 13, true) → 6
    sum13Lambda({13, 13, 2, 1, 1}, 13, true) → 2
    sum13Lambda({1, 2, 2, 1, 13}, 13, true) → 6
    */
    public static int sum13Lambda(int[] nums, int numberToSkip, boolean alsoSkipTrailing)
    {
    	/*
        if (alsoSkipTrailing)
            return nums.Where((value, index) => value != numberToSkip
                    && (index == 0 || nums[index - 1] != numberToSkip)).Sum();
        else
            return nums.Where(value => value != numberToSkip).Sum();
            */
    	int sum = 0;
   		sum += (int)Arrays.stream(nums).filter(x -> x != numberToSkip).sum();
    	if (alsoSkipTrailing){
    		List<Integer> result = new ArrayList<>();
    		Arrays.stream(nums).reduce((a,b) -> {if (a == numberToSkip && b != numberToSkip) result.add(b); return b;});
    		
    		int sum2 = result.stream().mapToInt(i -> i).sum();
    		sum -= sum2;
    	}
   	
    	return sum;
    }
    /*
    5. sum67 
    Return the sum of the numbers in the array, except ignore sections of numbers 
    starting with left and extending through the next right. 

    sum67({1, 2, 2}, 6, 7) → 5
    sum67({1, 2, 2, 6, 99, 99, 7}, 6, 7) → 5
    sum67({1, 1, 6, 7, 2}, 6, 7) → 4
    */
    public static int sum67(int[] nums, int left, int right)
    {
        boolean active = true;
        int sum = 0;
        for (int n : nums)
        {
            if (n == left)
                active = false;
            if (active)
                sum += n;
            if (n == right)
                active = true;
        }
        return sum;
    }

    /*
    Given an array of ints, return true if the array contains 
    left followed immediately by right. 

    has22({1, 2, 2}, 2, 2) → true
    has22({1, 2, 1, 2}, 2, 2) → false
    has22({2, 1, 2}, 2, 2) → false
    */
    public static boolean has22(int[] nums, int left, int right)
    {
        for (int i = 1; i < nums.length; i++)
            if (nums[i - 1] == left && nums[i] == right)
                return true;

        return false;
    }

    /*
    Given an array of ints, return true if the array contains 
    left followed immediately by right. Use Lambda. Do not use loops.

    has22Lambda({1, 2, 2}, 2, 2) → true
    has22Lambda({1, 2, 1, 2}, 2, 2) → false
    has22Lambda({2, 1, 2}, 2, 2) → false
    */
    public static boolean has22Lambda(int[] nums, int left, int right)
    {
    	/*
        return nums.Skip(1)
            .Where((value, index) => nums[index] == left && value == right)
            .Any();
        */
    	return true;
    }

    /*
    7. lucky13 

    Given an array of ints, return true if the array contains no elements 
    matching first and no elements matching second. 

    lucky13({0, 2, 4}, 1, 3) → true
    lucky13({1, 2, 3}, 1, 3) → false
    lucky13({1, 2, 4}, 1, 3) → false
    */
    public static boolean lucky13(int[] nums, int first, int second)
    {
        //return !nums.Contains(first) && !nums.Contains(second);
    	for(int n : nums)
    		if (n == first || n == second)
    			return false;
    	
    	return true;
    }

    /*
    8. sum28 

    Given an array of ints, return true if the sum of all the numberToSum 
    in the array is exactly equal to target. 

    sum28({2, 3, 2, 2, 4, 2}, 2, 8) → true
    sum28({2, 3, 2, 2, 4, 2, 2}, 2, 8) → false
    sum28({1, 2, 3, 4}, 2, 8) → false
    */
    public static boolean sum28(int[] nums, int numberToSum, int target)
    {
        int sum = 0;
        
        for (int n : nums)
            if (n == numberToSum)
                sum += n;

        return sum == target;
    }

    /*
    Given an array of ints, return true if the sum of all the numberToSum 
    in the array is exactly equal to target. Use Lambda. Do not use loops.

    sum28Lambda({2, 3, 2, 2, 4, 2}, 2, 8) → true
    sum28Lambda({2, 3, 2, 2, 4, 2, 2}, 2, 8) → false
    sum28Lambda({1, 2, 3, 4}, 2, 8) → false
    */
    public static boolean sum28Lambda(int[] nums, int numberToSum, int target)
    {
        //return nums.Where(i => i == numberToSum).Sum() == target;
    	return false;
    }

    /*
    9. more14 
    Given an array of ints, return true if the number of firsts is greater 
    than the number of seconds 

    more14({1, 4, 1}, 1, 4) → true
    more14({1, 4, 1, 4}, 1, 4) → false
    more14({1, 1}, 1, 4) → true
    */
    public static boolean more14(int[] nums, int first, int second)
    {
        int countF = 0;
        int countS = 0;

        for (int n : nums)
        { 
            if (n == first)
                countF++;
            else if (n == second)
                countS++;
        }

        return countF > countS;
    }

    /*
    Given an array of ints, return true if the number of firsts is greater 
    than the number of seconds. Use Lambda. Do not use loops.

    more14Lambda({1, 4, 1}, 1, 4) → true
    more14Lambda({1, 4, 1, 4}, 1, 4) → false
    more14Lambda({1, 1}, 1, 4) → true
    */
    public static boolean more14Lambda(int[] nums, int first, int second)
    {
    	/*
        return nums.Where(value => value == first).Count()
             > nums.Where(value => value == second).Count();
    	 */
    	return false;
    }

    /*
    10. fizzArray 

    Given a number n, create and return a new int array of length n, containing 
    the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return 
    a length 0 array.

    fizzArray(4) → {0, 1, 2, 3}
    fizzArray(1) → {0}
    fizzArray(10) → {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
    */
    public static int[] fizzArray(int n)
    {
        int[] result = new int[n];
        
        for (int i = 0; i < n; i++)
            result[i] = i;

        return result;
    }


    /*
    Given a number n, create and return a new int array of length n, containing 
    the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return 
    a length 0 array. Use Lambda. Do not use loops.

    fizzArrayLambda(4) → {0, 1, 2, 3}
    fizzArrayLambda(1) → {0}
    fizzArrayLambda(10) → {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
    */
    public static int[] fizzArrayLambda(int n)
    {
        //return Enumerable.Range(0, n).ToArray();
    	int[] result = new int[0];
    	return result;
    }

    /*
    11. only14
    Given an array of ints, return true if every element is a 1 or a 4. 

    only14({1, 4, 1, 4}) → true
    only14({1, 4, 2, 4}) → false
    only14({1, 1}) → true
    */
    public static boolean only14(int[] nums) {
        for (int n : nums)
            if (n != 1 && n != 4)
                return false;

        return true;
    }

    /*
    Given an array of ints, return true if every element is a 1 or a 4. 
    Use Lambda. Do not use loops.
    only14Lambda({1, 4, 1, 4}) → true
    only14Lambda({1, 4, 2, 4}) → false
    only14Lambda({1, 1}) → true
    */
    public static boolean only14Lambda(int[] nums)
    {
    	/*
        return nums.Where(a => a == 1).Count()
             + nums.Where(a => a == 4).Count()
            == nums.length;
        */
    	return false;
    }

    /*
    12. fizzArray2 
    Given a number n, create and return a new String array of length n, containing 
    the Strings "0", "1" "2" .. through n-1. N may be 0, in which case just return 
    a length 0 array.

    fizzArray2(4) → {"0", "1", "2", "3"}
    fizzArray2(10) → {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
    fizzArray2(2) → {"0", "1"}
    */
    public static String[] fizzArray2(int n)
    {
        String[] result = new String[n];
        for (int i = 0; i < n; i++){
        	//result[i] = i.toString();
        }
        return result;
    }

    /*
    Given a number n, create and return a new String array of length n, containing 
    the Strings "0", "1" "2" .. through n-1. N may be 0, in which case just return 
    a length 0 array. Use Lambda. Do not use loops.

    fizzArray2Lambda(4) → {"0", "1", "2", "3"}
    fizzArray2Lambda(10) → {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
    fizzArray2Lambda(2) → {"0", "1"}
    */
    public static String[] fizzArray2Lambda(int n)
    {
    	/*
        return Enumerable.Range(0, n)
            .Select(x => x.toString())
            .ToArray();
        */
    	String[] result = new String[0];
    	return result;
    }

    /*
    13. no14

    Given an array of ints, return true if it contains no firsts and/or no seconds. 

    no14({1, 2, 3}, 1, 4) → true
    no14({1, 2, 3, 4}, 1, 4) → false
    no14({2, 3, 4}, 1, 4) → true
    */
    public static boolean no14(int[] nums, int first, int second)
    {
        boolean noFirst = true;
        boolean noSecond = true;

        for (int n : nums)
        {
            if (n == first)
                noFirst = false;
            if (n == second)
                noSecond = false;
            if (!noFirst && !noSecond)
                break;
        }

        return noFirst || noSecond;
    }

    /*
    Given an array of ints, return true if it contains no firsts and/or no seconds. 
    Use Lambda. Do not use loops.
    no14Lambda({1, 2, 3}, 1, 4) → true
    no14Lambda({1, 2, 3, 4}, 1, 4) → false
    no14Lambda({2, 3, 4}, 1, 4) → true
    */
    public static boolean no14Lambda(int[] nums, int first, int second)
    {
    	/*
        return !nums.Where(value => value == first).Any()
            || !nums.Where(value => value == second).Any();
        */
    	return false;
    }

    /*
    14. isEverywhere 

    We'll say that a value is "everywhere" in an array if for every pair of adjacent 
    elements in the array, at least one of the pair is that value. Return true if 
    the given value is everywhere in the array. 

    isEverywhere({1, 2, 1, 3}, 1) → true
    isEverywhere({1, 2, 1, 3}, 2) → false
    isEverywhere({1, 2, 1, 3, 4}, 1) → false
    */
    public static boolean isEverywhere(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return false;
        else
        {
            for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] != val)
                {
                    if (i < nums.length - 1 && nums[i + 1] != val)
                        return false;

                    if (i > 0 && nums[i - 1] != val)
                        return false;
                }
            }
            return true;
        }
    }

    /*
    We'll say that a value is "everywhere" in an array if for every pair of adjacent 
    elements in the array, at least one of the pair is that value. Return true if 
    the given value is everywhere in the array. Use Lambda. Do not use loops.

    isEverywhereLambda({1, 2, 1, 3}, 1) → true
    isEverywhereLambda({1, 2, 1, 3}, 2) → false
    isEverywhereLambda({1, 2, 1, 3, 4}, 1) → false
    */
    public static boolean isEverywhereLambda(int[] nums, int val)
    {
    	/*
        return !nums.Skip(1)
            .Where((value, index) => value != val && nums[index] != val)
            .Any();
        */
    	return false;
    }

    /*
    15. either24 

    Given an array of ints, return true if the array contains adjacent elements 
    containing first or adjacent elements containing second but not both.

    either24({1, 2, 2}, 2, 4) → true
    either24({4, 4, 1}, 2, 4) → true
    either24({4, 4, 1, 2, 2}, 2, 4) → false
    */
    public static boolean either24(int[] nums, int first, int second)
    {
        return hasAdjacentLambda(nums, first) != hasAdjacentLambda(nums, second);
    }

    private static boolean hasAdjacentLambda(int[] nums, int target)
    {
    	/*
        return nums.Skip(1)
            .Where((value, index) => nums[index] == target && value == target)
            .Any();
        */
    	return false;
    }

    /*
    16. matchUp 

    Given arrays nums1 and nums2 of the same length, for every element : nums1, 
    consider the corresponding element : nums2 (at the same index). Return the 
    count of the number of times that the two elements differ by 2 or less, 
    but are not equal. 

    matchUp({1, 2, 3}, {2, 3, 10}) → 2
    matchUp({1, 2, 3}, {2, 3, 5}) → 3
    matchUp({1, 2, 3}, {2, 3, 3}) → 2
    */
    public static int matchUp(int[] nums1, int[] nums2)
    {
        int count = 0;
        for (int i = 0; i < Math.min(nums1.length, nums2.length); i++) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            if (diff == 1 || diff == 2)
                count++;
        }
        return count;   
    }

    /*
    Given arrays nums1 and nums2 of the same length, for every element : nums1, 
    consider the corresponding element : nums2 (at the same index). Return the 
    count of the number of times that the two elements differ by 2 or less, 
    but are not equal. Use Lambda. Do not use loops.

    matchUpLambda({1, 2, 3}, {2, 3, 10}) → 2
    matchUpLambda({1, 2, 3}, {2, 3, 5}) → 3
    matchUpLambda({1, 2, 3}, {2, 3, 3}) → 2
    */
    public static int matchUpLambda(int[] nums1, int[] nums2)
    {
    	/*
        var diff = nums1.Zip(nums2, (a, b) => Math.Abs(a - b));
        var result = diff.Select(element => element > 0 && element <= 2);
        return result.Where(element => element == true).Count();
        */
    	return 0;
    }

    /*
    17. has77

    Given an array of ints, return true if the array contains two 7's next to 
    each other, or there are two 7's separated by one element, such as with {7, 1, 7}. 

    has77({1, 7, 7}) → true
    has77({1, 7, 1, 7}) → true
    has77({1, 7, 1, 1, 7}) → false
    */
    public static boolean has77(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
        	if (nums[i] == 7)
        		if (nums[i - 1] == 7 || (i > 1 && nums[i - 2] == 7))
        			return true;
        }

        return false;
    }

    /*
    Given an array of ints, return true if the array contains two 7's next to 
    each other, or there are two 7's separated by one element, such as with {7, 1, 7}. 
    Use Lambda. Do not use loops.
    has77Lambda({1, 7, 7}) → true
    has77Lambda({1, 7, 1, 7}) → true
    has77Lambda({1, 7, 1, 1, 7}) → false
    */
    public static boolean has77Lambda(int[] nums)
    {
    	/*
        return
            nums.Skip(1).Where((value, index) => value == nums[index] && value == 7).Any()
         || nums.Skip(2).Where((value, index) => value == nums[index] && value == 7).Any();
         */
    	return false;
    }

    /*
    18. has12

    Given an array of ints, return true if first is in the array  
    with second somewhere later in the array. 

    has12({1, 2, 1}, 1, 2) → true
    has12({3, 1, 2}, 1, 2) → true
    has12({3, 2, 1}, 1, 2) → false
    */
    public static boolean has12(int[] nums, int first, int second)
    {
        int firstPos = 0; //Array.IndexOf(nums, first);
        int secondPos = 0; //Array.LastIndexOf(nums, second);
        return firstPos >= 0 && secondPos >= 0 && firstPos < secondPos;
    }

    /*
    19. modThree 

    Given an array of ints, return true if the array contains 
    either 3 even or 3 odd values all next to each other. 

    modThree({2, 1, 3, 5}) → true
    modThree({2, 1, 2, 5}) → false
    modThree({2, 4, 2, 5}) → true
    modThree({1}) → false
    modThree({}) → false
    */
    public static boolean modThree(int[] nums)
    {
        if (nums == null || nums.length < 3)
            return false;

        for (int i = 2; i < nums.length; i++)
            if (nums[i - 2] % 2 == nums[i - 1] % 2 && nums[i - 2] % 2 == nums[i] % 2)
                return true;

        return false;
    }

    /*
    Given an array of ints, return true if the array contains 
    either 3 even or 3 odd values all next to each other. 
    Use Lambda. Do not use loops.
    modThreeLambda({2, 1, 3, 5}) → true
    modThreeLambda({2, 1, 2, 5}) → false
    modThreeLambda({2, 4, 2, 5}) → true
    modThreeLambda({1}) → false
    modThreeLambda({}) → false
    */
    public static boolean modThreeLambda(int[] nums)
    {
    	/*
        return nums.Where((value, index) => index >= 2 
            && nums[index] % 2 == nums[index - 1] % 2 
            && nums[index] % 2 == nums[index - 2] % 2)
            .Any();
        */
    	return false;
    }

    /*
    20. haveThree 

    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
    and no 3's are next to each other. 

    haveThree({3, 1, 3, 1, 3}) → true
    haveThree({3, 1, 3, 3}) → false
    haveThree({3, 4, 3, 3, 4}) → false
    */
    public static boolean haveThree(int[] nums)
    {
        int count = 0;

        if (nums == null || nums.length < 2)
            return false;

        for (int i = 0; i < nums.length; i++)
        { 
            if (nums[i] == 3)
            {
                count++;

                if (i > 0 && nums[i - 1] == 3)
                    return false;
                if (i < nums.length - 1 && nums[i + 1] == 3)
                    return false;
            }
        }

        return count == 3;
    }

    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, 
    and no 3's are next to each other. Use Lambda. Do not use loops.

    haveThreeLambda({3, 1, 3, 1, 3}) → true
    haveThreeLambda({3, 1, 3, 3}) → false
    haveThreeLambda({3, 4, 3, 3, 4}) → false
    */
    public static boolean haveThreeLambda(int[] nums)
    {
    	/*
        return nums.Where(val => val == 3).Count() == 3
            && !hasAdjacentLambda(nums, 3);
        */
    	return false;
    }

    /*
    21. twoTwo 
    Given an array of ints, return true if every 2 that appears in the array is next to another 2. 

    twoTwo({4, 2, 2, 3}) → true
    twoTwo({2, 2, 4}) → true
    twoTwo({2, 2, 4, 2}) → false
    */
    public static boolean twoTwo(int[] nums)
    {
        boolean hasLoneTwo = false;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 2)
            {
                hasLoneTwo = true;

                if (i > 0 && nums[i - 1] == 2)
                    hasLoneTwo = false;
                else if (i < nums.length - 1 && nums[i + 1] == 2)
                    hasLoneTwo = false;
            }

            if (hasLoneTwo)
                return false;
        }

        return !hasLoneTwo;
    }

    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2. 
    Use Lambda. Do not use loops.
    twoTwoLambda({4, 2, 2, 3}) → true
    twoTwoLambda({2, 2, 4}) → true
    twoTwoLambda({2, 2, 4, 2}) → false
    */
    public static boolean twoTwoLambda(int[] nums)
    {
    	/*
        return !nums.Where((value, index) => value == 2
        && (index == 0 || nums[index - 1] != 2)
        && (index == nums.length - 1 || nums[index + 1] != 2))
        .Any();
        */
    	return false;
    }

    /*
    22. sameEnds 
    Return true if the group of N numbers at the start and end of the array are the same. 
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, 
    and false for n=1 and n=3.  

    sameEnds({5, 6, 45, 99, 13, 5, 6}, 1) → false
    sameEnds({5, 6, 45, 99, 13, 5, 6}, 2) → true
    sameEnds({5, 6, 45, 99, 13, 5, 6}, 3) → false
    */
    public static boolean sameEnds(int[] nums, int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (nums[i] != nums[i + nums.length - n])
                return false;
        }

        return true;
    }

    /*
    Return true if the group of N numbers at the start and end of the array are the same. 
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, 
    and false for n=1 and n=3. Use Lambda. Do not use loops.

    sameEndsLambda({5, 6, 45, 99, 13, 5, 6}, 1) → false
    sameEndsLambda({5, 6, 45, 99, 13, 5, 6}, 2) → true
    sameEndsLambda({5, 6, 45, 99, 13, 5, 6}, 3) → false
    */
    public static boolean sameEndsLambda(int[] nums, int n)
    {
        //return nums.Take(n), nums.Skip(nums.length - n).Take(n));
    	return false;
    }

    /*
    23. tripleUp
    Return true if the array contains, somewhere, three increasing adjacent numbers 
    like .... 4, 5, 6, ... or 23, 24, 25. 

    tripleUp({1, 4, 5, 6, 2}) → true
    tripleUp({1, 2, 3}) → true
    tripleUp({1, 2, 4}) → false
    */
    public static boolean tripleUp(int[] nums)
    {
        for (int i = 2; i < nums.length; i++)
            if (nums[i] == nums[i - 1] + 1 && nums[i] == nums[i - 2] + 2)
                return true;

        return false;
    }

    /*
    Return true if the array contains, somewhere, three increasing adjacent numbers 
    like .... 4, 5, 6, ... or 23, 24, 25. Use Lambda. Do not use loops.

    tripleUpLambda({1, 4, 5, 6, 2}) → true
    tripleUpLambda({1, 2, 3}) → true
    tripleUpLambda({1, 2, 4}) → false
    */
    public static boolean tripleUpLambda(int[] nums)
    {
    	/*
        return nums.Skip(2)
            .Where((value, index) => value == nums[index] + 2
                                  && value == nums[index + 1] + 1).Any();
    	 */
    	return false;
    }

    /*
    24. fizzArray3 
    Given start and end numbers, return a new array containing 
    the sequence of integers from start up to but not including end, 
    so start=5 and end=10 yields {5, 6, 7, 8, 9}. 

    fizzArray3(5, 10) → {5, 6, 7, 8, 9}
    fizzArray3(11, 18) → {11, 12, 13, 14, 15, 16, 17}
    fizzArray3(1, 3) → {1, 2}
    */
    public static int[] fizzArray3(int start, int end)
    {
        int[] result = new int[end - start];

        for (int i = 0; i < end - start; i++)
            result[i] = start + i;

        return result;
    }

    /*
    Given start and end numbers, return a new array containing 
    the sequence of integers from start up to but not including end, 
    so start=5 and end=10 yields {5, 6, 7, 8, 9}. Use Lambda. Do not use loops.

    fizzArray3Lambda(5, 10) → {5, 6, 7, 8, 9}
    fizzArray3Lambda(11, 18) → {11, 12, 13, 14, 15, 16, 17}
    fizzArray3Lambda(1, 3) → {1, 2}
    */
    public static int[] fizzArray3Lambda(int start, int end)
    {
        //return Enumerable.Range(start, end - start).ToArray();
    	int[] result = new int[0];
    	return result;
    }

    /*
    25. shiftLeft 

    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 

    shiftLeft({6, 2, 5, 3}) → {2, 5, 3, 6}
    shiftLeft({1, 2}) → {2, 1}
    shiftLeft({1}) → {1}
    */
    public static int[] shiftLeft(int[] nums)
    {
        if (nums == null || nums.length < 2)
            return nums;
        else
        {
            //List<Integer> list = nums.toList();
            //list.add(nums[0]);
            //list.remove(0);
            //return list.toArray();
        	return nums;
        }
    }

    /*
    26. tenRun 

    For each multiple of 10 in the given array, change all the values following it 
    to be that multiple of numBase, until encountering another multiple of 10. 
    So ({2, 10, 3, 4, 20, 5}, 10) yields {2, 10, 10, 10, 20, 20}. 

    tenRun({2, 10, 3, 4, 20, 5}) → {2, 10, 10, 10, 20, 20}
    tenRun({10, 1, 20, 2}) → {10, 10, 20, 20}
    tenRun({10, 1, 9, 20}) → {10, 10, 10, 20}
    tenRun({1}) → {1}	    
    tenRun({}) → {}    

    */
    public static int[] tenRun(int[] nums)
    {
        final int sentinel = -1;
        int replacement = sentinel;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 10 == 0)
                replacement = nums[i];
            else if (replacement != sentinel)
                nums[i] = replacement;
        }
        return nums;
    }

    /*
    27. pre4 
    Given a non-empty array of ints, return a new array containing the elements 
    from the original array that come before the first 4 in the original array. 
    The original array will contain at least one 4. 
    
    pre4({1, 2, 4, 1}) → {1, 2}
    pre4({3, 1, 4}) → {3, 1}
    pre4({1, 4, 4}) → {1}
    pre4({4, 4}) → {}	    
    */
    public static int[] pre4(int[] nums)
    {
        List<Integer> list = new ArrayList<>();
        int first4 = 0; //Array.IndexOf(nums, 4);

        for (int i = 0; i < first4; i++)
            list.add(nums[i]);

        return nums; //list.toArray();
    }

    /*
    Given a non-empty array of ints, return a new array containing the elements 
    from the original array that come before the first 4 in the original array. 
    The original array will contain at least one 4. Use Lambda. Do not use loops.
    
    pre4Lambda({1, 2, 4, 1}) → {1, 2}
    pre4Lambda({3, 1, 4}) → {3, 1}
    pre4Lambda({1, 4, 4}) → {1}
    pre4Lambda({4, 4}) → {}	    
    */
    public static int[] pre4Lambda(int[] nums)
    {
        //return nums.TakeWhile(item => item != 4).ToArray();
    	int[] result = new int[0];
    	return result;
    }

    /*
    28. post4 

    Given a non-empty array of ints, return a new array containing the elements 
    from the original array that come after the last 4 in the original array. 
    The original array will contain at least one 4. 

    post4({2, 4, 1, 2}) → {1, 2}
    post4({4, 1, 4, 2}) → {2}
    post4({4, 4, 1, 2, 3}) → {1, 2, 3}
    post4({4, 4}) → {}	    
    post4({4}) → {}	
    */
    public static int[] post4(int[] nums)
    {
    	/*
        List<Integer> list = new List<Integer>();
        int last4 = Array.LastIndexOf(nums, 4);

        for (int i = last4 + 1; i < nums.length; i++)
            list.add(nums[i]);

        return list.toArray();
        */
    	return nums;
    }

    /*
    Given a non-empty array of ints, return a new array containing the elements 
    from the original array that come after the last 4 in the original array. 
    The original array will contain at least one 4. Use Lambda. Do not use loops.

    post4Lambda({2, 4, 1, 2}) → {1, 2}
    post4Lambda({4, 1, 4, 2}) → {2}
    post4Lambda({4, 4, 1, 2, 3}) → {1, 2, 3}
    post4Lambda({4, 4}) → {}	    
    post4Lambda({4}) → {}	
    */
    public static int[] post4Lambda(int[] nums)
    {
    	/*
        int last4 = Array.LastIndexOf(nums, 4) + 1;
        return nums.Skip(last4).Take(nums.length - last4).ToArray();
        */
    	int[] result = new int[0];
    	return result;
    }

    /*
    29. notAlone 

    We'll say that an element in an array is "alone" if there are values before and after it, 
    and those values are different from it. 
    Return a version of the given array where every instance of the given value which is alone 
    is replaced by whichever value to its left or right is larger. 

    notAlone({1, 2, 3}, 2) → {1, 3, 3}
    notAlone({1, 2, 3, 2, 5, 2}, 2) → {1, 3, 3, 5, 5, 2}
    notAlone({3, 4}, 3) → {3, 4}
    */
    public static int[] notAlone(int[] nums, int val)
    { 
        for(int i = 1; i < nums.length - 1; i++)
        { 
            if (nums[i] != nums[i-1] && nums[i] != nums[i+1])
                nums[i] = Math.max(nums[i-1], nums[i+1]);
        }
        return nums;
    }

    /*
    30. zeroFront 

    Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the zeros are grouped at the start of the array. 
    The order of the non-zero numbers does not matter. 
    So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 

    zeroFront({1, 0, 0, 1}) → {0, 0, 1, 1}
    zeroFront({0, 1, 1, 0, 1}) → {0, 0, 1, 1, 1}
    zeroFront({1, 0}) → {0, 1}
    zeroFront({}) → {}	    
    */
    public static int[] zeroFront(int[] nums)
    {
        int[] result = new int[nums.length];
        int rpos = result.length - 1;

        for (int n : nums)
            if (n != 0)
                result[rpos--] = n;

        return result;
    }

    /*
    Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the zeros are grouped at the start of the array. 
    The order of the non-zero numbers does not matter. Use Lambda. Do not use loops.
    So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 

    zeroFrontLambda({1, 0, 0, 1}) → {0, 0, 1, 1}
    zeroFrontLambda({0, 1, 1, 0, 1}) → {0, 0, 1, 1, 1}
    zeroFrontLambda({1, 0}) → {0, 1}
    zeroFrontLambda({}) → {}	    
    */
    public static int[] zeroFrontLambda(int[] nums)
    {
    	/*
        var nonzero = nums.Where(item => item != 0).ToList();
        List<Integer> result = new List<Integer>(nums.length - nonzero.Count);
        result.AddRange(nonzero);
        return result.toArray();
        */
    	int[] result = new int[0];
    	return result;
    }

    /*
    31. withoutTen 

    Return a version of the given array where all the 10's have been removed. 
    The remaining elements should shift left towards the start of the array as needed, 
    and the empty spaces a the end of the array should be 0. 
    So {1, 10, 10, 2} yields {1, 2, 0, 0}. 

    withoutTen({1, 10, 10, 2}) → {1, 2, 0, 0}
    withoutTen({10, 2, 10}) → {2, 0, 0}
    withoutTen({1, 99, 10}) → {1, 99, 0}
    withoutTen({}) → {}	{}	OK	    
    */
    public static int[] withoutTen(int[] nums)
    {
        int[] result = new int[nums.length];
        int rpos = 0;

        for (int n : nums)
            if (n != 10)
                result[rpos++] = n;

        return result;
    }

    /*
    Return a version of the given array where all the 10's have been removed. 
    The remaining elements should shift left towards the start of the array as needed, 
    and the empty spaces a the end of the array should be 0. Use Lambda. Do not use loops.
    So {1, 10, 10, 2} yields {1, 2, 0, 0}. 

    withoutTenLambda({1, 10, 10, 2}) → {1, 2, 0, 0}
    withoutTenLambda({10, 2, 10}) → {2, 0, 0}
    withoutTenLambda({1, 99, 10}) → {1, 99, 0}
    withoutTenLambda({}) → {}	{}	OK	    
    */
    public static int[] withoutTenLambda(int[] nums)
    {
    	/*
        List<Integer> nonTen = nums.Where(item => item != 10).ToList();
        List<Integer> zeroes = new List<Integer>(nums.length - nonTen.Count);
        return nonTen.Concat(zeroes).ToArray();  // could use AddRange
        */
    	int[] result = new int[0];
    	return result;    	
    }

    /*
    32. zeroMax 

    Return a version of the given array where each zero value in the array is replaced 
    by the largest odd value to the right of the zero in the array. If there is no odd 
    value to the right of the zero, leave the zero as a zero. 

    zeroMax({0, 5, 0, 2}) → {5, 5, 0, 2}
    zeroMax({4, 0, 4, 3}) → {4, 3, 4, 3}
    zeroMax({0, 1, 0}) → {1, 1, 0}
    */
    public static int[] zeroMax(int[] nums)
    {
        for(int i = 0; i < nums.length - 1; i++)
        { 
            if (nums[i] == 0)
            {
                int max = 0;

                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] % 2 != 0 && nums[j] > max)
                        max = nums[j];

                nums[i] = max;
            }
        }

        return nums;
    }

    /*
    Return a version of the given array where each zero value in the array is replaced 
    by the largest odd value to the right of the zero in the array. If there is no odd 
    value to the right of the zero, leave the zero as a zero. Use Lambda. Do not use loops.

    zeroMaxLambda({0, 5, 0, 2}) → {5, 5, 0, 2}
    zeroMaxLambda({4, 0, 4, 3}) → {4, 3, 4, 3}
    zeroMaxLambda({0, 1, 0}) → {1, 1, 0}
    */
    public static int[] zeroMaxLambda(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
            	/*
                var odds = nums.Skip(i).Where(x => x % 2 == 1);
                nums[i] = odds.Any() ? odds.Max() : 0;
                */
            }
        }
        return nums;
    }

    /*
    33. evenOdd
    Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the even numbers come before all the odd numbers. 
    Other than that, the numbers can be in any order. 

    evenOdd({-1, 0, -1, 0, 0, -1}) → {0, 0, 0, -1, -1, -1}
    evenOdd({3, 3, 2}) → {2, 3, 3}
    evenOdd({2, 2, 2}) → {2, 2, 2}
    */
    public static int[] evenOdd(int[] nums)
    {
        int evenPos = 0;
        int oddPos = nums.length - 1;
        int temp = 0;

        for (int i = 0; i < nums.length; i++)
            if (evenPos == oddPos)
                break;
            else if (nums[i] % 2 == 0)
            {
                temp = nums[evenPos];
                nums[evenPos] = nums[i];
                nums[i] = temp;
                evenPos++;
            }
            else
            {
                temp = nums[oddPos];
                nums[oddPos] = nums[i];
                nums[i] = temp;
                oddPos--;
            }

        return nums;
    }

    /*
    Return an array that contains the exact same numbers as the given array, 
    but rearranged so that all the even numbers come before all the odd numbers. 
    Other than that, the numbers can be in any order. Use Lambda. Do not use loops.

    evenOddLambda({-1, 0, -1, 0, 0, -1}) → {0, 0, 0, -1, -1, -1}
    evenOddLambda({3, 3, 2}) → {2, 3, 3}
    evenOddLambda({2, 2, 2}) → {2, 2, 2}
    */
    public static int[] evenOddLambda(int[] nums)
    {
    	/*
        var evens = nums.Where(item => item % 2 == 0).toList();
        var odds = nums.Where(item => item % 2 != 0).toList();
        evens.AddRange(odds);
        return evens.ToArray();
        */
    	int[] result = new int[0];
    	return result;
    }

    /*
    34. fizzBuzz 
    Consider the series of numbers beginning at start and running up to but not 
    including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. 
    Return a new String[] array containing the String form of these numbers, except 
    for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", 
    and for multiples of both 3 and 5 use "FizzBuzz".

    fizzBuzz(1, 6) → {"1", "2", "Fizz", "4", "Buzz"}
    fizzBuzz(1, 8) → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}
    fizzBuzz(1, 11) → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}
    */
    public static String[] fizzBuzz(int start, int end)
    {
        String[] result = new String[end - start];

        for (int i = start; i < end; i++)
            result[i - start] = fb(i);

        return result;

    }


    /*
    Consider the series of numbers beginning at start and running up to but not 
    including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. 
    Return a new String[] array containing the String form of these numbers, except 
    for multiples of 3, use "Fizz" instead of the number, for multiples of 5 use "Buzz", 
    and for multiples of both 3 and 5 use "FizzBuzz". Use Lambda. Do not use loops.

    fizzBuzzLambda(1, 6) → {"1", "2", "Fizz", "4", "Buzz"}
    fizzBuzzLambda(1, 8) → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}
    fizzBuzzLambda(1, 11) → {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}
    */
    public static String[] fizzBuzzLambda(int start, int end)
    {
    	/*
        return Enumerable.Range(start, end - start)
            .Select(x => fb(x))
            .ToArray();
    	 */
    	String[] result = new String[0];
    	return result;
    }

    private static String fb(int num)
    {
        if (num % 3 == 0 && num % 5 == 0)
            return "FizzBuzz";
        else if (num % 3 == 0)
            return "Fizz";
        else if (num % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(num);
    }

}
