package codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AP1 {

	public static void main(String[] args) {
        System.out.println("scoresIncreasing");
        System.out.println(scoresIncreasing(new int[] { 1, 3, 4 }) == true);
        System.out.println(scoresIncreasing(new int[] { 1, 3, 2 }) == false);
        System.out.println(scoresIncreasing(new int[] { 1, 1, 4 }) == true);

        System.out.println("scoresIncreasingLambda");
        System.out.println(scoresIncreasingLambda(new int[] { 1, 3, 4 }) == true);
        System.out.println(scoresIncreasingLambda(new int[] { 1, 3, 2 }) == false);
        System.out.println(scoresIncreasingLambda(new int[] { 1, 1, 4 }) == true);

        System.out.println("scores100");
        System.out.println(scores100(new int[] { 1, 100, 100 }) == true);
        System.out.println(scores100(new int[] { 1, 100, 99, 100 }) == false);
        System.out.println(scores100(new int[] { 100, 1, 100, 100 }) == true);

        System.out.println("scores100Lambda");
        System.out.println(scores100Lambda(new int[] { 1, 100, 100 }) == true);
        System.out.println(scores100Lambda(new int[] { 1, 100, 99, 100 }) == false);
        System.out.println(scores100Lambda(new int[] { 100, 1, 100, 100 }) == true);

        System.out.println("scoresClump");
        System.out.println(scoresClump(new int[] { 3, 4, 5 }) == true);
        System.out.println(scoresClump(new int[] { 3, 4, 6 }) == false);
        System.out.println(scoresClump(new int[] { 1, 3, 5, 5 }) == true);

        System.out.println("scoresClumpLambda");
        System.out.println(scoresClumpLambda(new int[] { 3, 4, 5 }) == true);
        System.out.println(scoresClumpLambda(new int[] { 3, 4, 6 }) == false);
        System.out.println(scoresClumpLambda(new int[] { 1, 3, 5, 5 }) == true);
        
        System.out.println("scoresAverage");
        System.out.println(scoresAverage(new int[] { 2, 2, 4, 4 }) == 4);
        System.out.println(scoresAverage(new int[] { 4, 4, 4, 2, 2, 2 }) == 4);
        System.out.println(scoresAverage(new int[] { 3, 4, 5, 1, 2, 3 }) == 4);

        System.out.println("scoresAverageLambda");
        System.out.println(scoresAverageLambda(new int[] { 2, 2, 4, 4 }) == 4);
        System.out.println(scoresAverageLambda(new int[] { 4, 4, 4, 2, 2, 2 }) == 4);
        System.out.println(scoresAverageLambda(new int[] { 3, 4, 5, 1, 2, 3 }) == 4);

        System.out.println("wordsCount");
        System.out.println(wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1) == 2);
        System.out.println(wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3) == 1);
        System.out.println(wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4) == 0);

        System.out.println("wordsCountLambda");
        System.out.println(wordsCountLambda(new String[] { "a", "bb", "b", "ccc" }, 1) == 2);
        System.out.println(wordsCountLambda(new String[] { "a", "bb", "b", "ccc" }, 3) == 1);
        System.out.println(wordsCountLambda(new String[] { "a", "bb", "b", "ccc" }, 4) == 0);
        
        System.out.println("wordsFront");
        System.out.println(Arrays.equals(wordsFront(new String[] { "a", "b", "c", "d" }, 1), new String[] { "a" }));
        System.out.println(Arrays.equals(wordsFront(new String[] { "a", "b", "c", "d" }, 2), new String[] { "a", "b" }));
        System.out.println(Arrays.equals(wordsFront(new String[] { "a", "b", "c", "d" }, 3), new String[] { "a", "b", "c" }));

        System.out.println("wordsFrontLambda");
        System.out.println(Arrays.equals(wordsFrontLambda(new String[] { "a", "b", "c", "d" }, 1), new String[] { "a" }));
        System.out.println(Arrays.equals(wordsFrontLambda(new String[] { "a", "b", "c", "d" }, 2), new String[] { "a", "b" }));
        System.out.println(Arrays.equals(wordsFrontLambda(new String[] { "a", "b", "c", "d" }, 3), new String[] { "a", "b", "c" }));
        
        System.out.println("wordsWithoutList");
        System.out.println(Arrays.equals(wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1).toArray(), new String[] { "bb", "ccc" }));
        System.out.println(Arrays.equals(wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3).toArray(), new String[] { "a", "bb", "b" }));
        System.out.println(Arrays.equals(wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4).toArray(), new String[] { "a", "bb", "b", "ccc" }));

        System.out.println("wordsWithoutListLambda");
        System.out.println(Arrays.equals(wordsWithoutListLambda(new String[] { "a", "bb", "b", "ccc" }, 1).toArray(), new String[] { "bb", "ccc" }));
        System.out.println(Arrays.equals(wordsWithoutListLambda(new String[] { "a", "bb", "b", "ccc" }, 3).toArray(), new String[] { "a", "bb", "b" }));
        System.out.println(Arrays.equals(wordsWithoutListLambda(new String[] { "a", "bb", "b", "ccc" }, 4).toArray(), new String[] { "a", "bb", "b", "ccc" }));
        
        System.out.println("hasOneLambda");
        System.out.println(hasOneLambda(10) == true);
        System.out.println(hasOneLambda(22) == false);
        System.out.println(hasOneLambda(220) == false);

        System.out.println("hasOne");
        System.out.println(hasOne(10) == true);
        System.out.println(hasOne(22) == false);
        System.out.println(hasOne(220) == false);
        
        System.out.println("dividesSelf");
        System.out.println(dividesSelf(128) == true);
        System.out.println(dividesSelf(12) == true);
        System.out.println(dividesSelf(120) == false);
        
        System.out.println("copyEvens");
        System.out.println(Arrays.equals(copyEvens(new int[] { 3, 2, 4, 5, 8 }, 2), new int[] { 2, 4 }));
        System.out.println(Arrays.equals(copyEvens(new int[] { 3, 2, 4, 5, 8 }, 3), new int[] { 2, 4, 8 }));
        System.out.println(Arrays.equals(copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 3), new int[] { 6, 2, 4 }));

        System.out.println("copyEvensLambda");
        System.out.println(Arrays.equals(copyEvensLambda(new int[] { 3, 2, 4, 5, 8 }, 2), new int[] { 2, 4 }));
        System.out.println(Arrays.equals(copyEvensLambda(new int[] { 3, 2, 4, 5, 8 }, 3), new int[] { 2, 4, 8 }));
        System.out.println(Arrays.equals(copyEvensLambda(new int[] { 6, 1, 2, 4, 5, 8 }, 3), new int[] { 6, 2, 4 }));
        
        System.out.println("copyEndy");
        System.out.println(Arrays.equals(copyEndy(new int[] { 9, 11, 90, 22, 6 }, 2), new int[] { 9, 90 }));
        System.out.println(Arrays.equals(copyEndy(new int[] { 9, 11, 90, 22, 6 }, 3), new int[] { 9, 90, 6 }));
        System.out.println(Arrays.equals(copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 2), new int[] { 1, 1 }));

        System.out.println("copyEndyLambda");
        System.out.println(Arrays.equals(copyEndyLambda(new int[] { 9, 11, 90, 22, 6 }, 2), new int[] { 9, 90 }));
        System.out.println(Arrays.equals(copyEndyLambda(new int[] { 9, 11, 90, 22, 6 }, 3), new int[] { 9, 90, 6 }));
        System.out.println(Arrays.equals(copyEndyLambda(new int[] { 12, 1, 1, 13, 0, 20 }, 2), new int[] { 1, 1 }));
        
        System.out.println("matchUp");
        System.out.println(matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "xx", "bb" }) == 1);
        System.out.println(matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "b", "bb" }) == 2);
        System.out.println(matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "ccc" }) == 1);

        System.out.println("matchUpLambda");
        System.out.println(matchUpLambda(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "xx", "bb" }) == 1);
        System.out.println(matchUpLambda(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "b", "bb" }) == 2);
        System.out.println(matchUpLambda(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "ccc" }) == 1);
        
        System.out.println("scoreUp");
        System.out.println(scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "c", "b", "c" }) == 6);
        System.out.println(scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "c" }) == 11);
        System.out.println(scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "b" }) == 16);

        System.out.println("scoreUpLambda");
        System.out.println(scoreUpLambda(new String[] { "a", "a", "b", "b" }, new String[] { "a", "c", "b", "c" }) == 6);
        System.out.println(scoreUpLambda(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "c" }) == 11);
        System.out.println(scoreUpLambda(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "b" }) == 16);
        
        System.out.println("wordsWithout");
        System.out.println(Arrays.equals(wordsWithout(new String[] { "a", "b", "c", "a" }, "a"), new String[] { "b", "c" }));
        System.out.println(Arrays.equals(wordsWithout(new String[] { "a", "b", "c", "a" }, "b"), new String[] { "a", "c", "a" }));
        System.out.println(Arrays.equals(wordsWithout(new String[] { "a", "b", "c", "a" }, "c"), new String[] { "a", "b", "a" }));

        System.out.println("wordsWithoutLambda");
        System.out.println(Arrays.equals(wordsWithoutLambda(new String[] { "a", "b", "c", "a" }, "a"), new String[] { "b", "c" }));
        System.out.println(Arrays.equals(wordsWithoutLambda(new String[] { "a", "b", "c", "a" }, "b"), new String[] { "a", "c", "a" }));
        System.out.println(Arrays.equals(wordsWithoutLambda(new String[] { "a", "b", "c", "a" }, "c"), new String[] { "a", "b", "a" }));
        
        System.out.println("scoresSpecial");
        System.out.println(scoresSpecial(new int[] { 12, 10, 4 }, new int[] { 2, 20, 30 }) == 40);
        System.out.println(scoresSpecial(new int[] { 20, 10, 4 }, new int[] { 2, 20, 10 }) == 40);
        System.out.println(scoresSpecial(new int[] { 12, 11, 4 }, new int[] { 2, 20, 31 }) == 20);

        System.out.println("scoresSpecialLambda");
        System.out.println(scoresSpecialLambda(new int[] { 12, 10, 4 }, new int[] { 2, 20, 30 }) == 40);
        System.out.println(scoresSpecialLambda(new int[] { 20, 10, 4 }, new int[] { 2, 20, 10 }) == 40);
        System.out.println(scoresSpecialLambda(new int[] { 12, 11, 4 }, new int[] { 2, 20, 31 }) == 20);
        
        System.out.println("sumHeights");
        System.out.println(sumHeights(new int[] { 5, 3, 6, 7, 2 }, 2, 4) == 6);
        System.out.println(sumHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 1) == 2);
        System.out.println(sumHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 4) == 11);

        System.out.println("sumHeightsLambda");
        System.out.println(sumHeightsLambda(new int[] { 5, 3, 6, 7, 2 }, 2, 4) == 6);
        System.out.println(sumHeightsLambda(new int[] { 5, 3, 6, 7, 2 }, 0, 1) == 2);
        System.out.println(sumHeightsLambda(new int[] { 5, 3, 6, 7, 2 }, 0, 4) == 11);

        System.out.println("sumHeights2");
        System.out.println(sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 2, 4) == 7);
        System.out.println(sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 0, 1) == 2);
        System.out.println(sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 0, 4) == 15);
        
        System.out.println("bigHeights");
        System.out.println(bigHeights(new int[] { 5, 3, 6, 7, 2 }, 2, 4) == 1);
        System.out.println(bigHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 1) == 0);
        System.out.println(bigHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 4) == 1);

        System.out.println("bigHeightsLambda");
        System.out.println(bigHeightsLambda(new int[] { 5, 3, 6, 7, 2 }, 2, 4) == 1);
        System.out.println(bigHeightsLambda(new int[] { 5, 3, 6, 7, 2 }, 0, 1) == 0);
        System.out.println(bigHeightsLambda(new int[] { 5, 3, 6, 7, 2 }, 0, 4) == 1);
        
        System.out.println("userCompare");
        System.out.println(userCompare("bb", 1, "zz", 2) == -1);
        System.out.println(userCompare("bb", 1, "aa", 2) == 1);
        System.out.println(userCompare("bb", 1, "bb", 1) == 0);
        
        System.out.println("mergeTwo");
        System.out.println(Arrays.equals(mergeTwo(new String[] { "a", "c", "z" }, new String[] { "b", "f", "z" }, 3), new String[] { "a", "b", "c" }));
        System.out.println(Arrays.equals(mergeTwo(new String[] { "a", "c", "z" }, new String[] { "c", "f", "z" }, 3), new String[] { "a", "c", "f" }));
        System.out.println(Arrays.equals(mergeTwo(new String[] { "f", "g", "z" }, new String[] { "c", "f", "g" }, 3), new String[] { "c", "f", "g" }));

        System.out.println("mergeTwoLambda");
        System.out.println(Arrays.equals(mergeTwoLambda(new String[] { "a", "c", "z" }, new String[] { "b", "f", "z" }, 3), new String[] { "a", "b", "c" }));
        System.out.println(Arrays.equals(mergeTwoLambda(new String[] { "a", "c", "z" }, new String[] { "c", "f", "z" }, 3), new String[] { "a", "c", "f" }));
        System.out.println(Arrays.equals(mergeTwoLambda(new String[] { "f", "g", "z" }, new String[] { "c", "f", "g" }, 3), new String[] { "c", "f", "g" }));
        
        System.out.println("commonTwo");
        System.out.println(commonTwo(new String[] { "a", "c", "c", "x" }, new String[] { "b", "c", "d", "x" }) == 2);
        System.out.println(commonTwo(new String[] { "a", "c", "x" }, new String[] { "a", "b", "c", "x", "z" }) == 3);
        System.out.println(commonTwo(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }) == 3);

        System.out.println("commonTwoLambda");
        System.out.println(commonTwoLambda(new String[] { "a", "c", "c", "x" }, new String[] { "b", "c", "d", "x" }) == 2);
        System.out.println(commonTwoLambda(new String[] { "a", "c", "x" }, new String[] { "a", "b", "c", "x", "z" }) == 3);
        System.out.println(commonTwoLambda(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }) == 3);

	}

    /*
    Given an array of scores, return true if each score is equal or greater than the one before. 

    scoresIncreasing({1, 3, 4}) → true
    scoresIncreasing({1, 3, 2}) → false
    scoresIncreasing({1, 1, 4}) → true
    */

    public static boolean scoresIncreasing(int[] scores)
    {
    	if (scores == null || scores.length < 2)
    		return false;
    	
        for (int i = 1; i < scores.length; i++)
            if (scores[i] < scores[i - 1])
                return false;
        
        return true;
    }


    /*
    Given an array of scores, return true if each score is equal or greater than the one before.
    The array will be length 2 or more. Use Lambda. Do not use loops.

    scoresIncreasingLambda({ 1, 3, 4}) → true
    scoresIncreasingLambda({ 1, 3, 2}) → false
    scoresIncreasingLambda({ 1, 1, 4}) → true
    */
    public static boolean scoresIncreasingLambda(int[] scores)
    {
    	/*
        return !scores.Skip(1)
                      .Where((value, index) => value < scores[index])
                      .Any();
    	 */
    	return false;
    }

    /*
    Given an array of scores, return true if there are scores of 100 next to each other in the array. 

    scores100({1, 100, 100}) → true
    scores100({1, 100, 99, 100}) → false
    scores100({100, 1, 100, 100}) → true
    */
    public static boolean scores100(int[] scores)
    {
    	if (scores == null || scores.length < 2)
    		return false;
    	
        for (int i = 1; i < scores.length; i++)
            if (scores[i] == 100 && scores[i - 1] == 100)
                return true;
        
        return false;
    }


    /*
        Given an array of scores, return true if there are scores of 100 next to each other in the array. 
        The array length will be at least 2. Use Lambda. Do not use loops.

        scores100Lambda({1, 100, 100}) → true
        scores100Lambda({1, 100, 99, 100}) → false
        scores100Lambda({100, 1, 100, 100}) → true
    */
    public static boolean scores100Lambda(int[] scores)
    {
        //return scores.Skip(1).Where((val, index) => val == 100 && scores[index] == 100).Any();
    	return false;
    }

    /*
    Given a sorted array, return true if the array contains 3 adjacent scores 
    that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}. 

    scoresClump({3, 4, 5}) → true
    scoresClump({3, 4, 6}) → false
    scoresClump({1, 3, 5, 5}) → true
    */
    public static boolean scoresClump(int[] scores)
    {
    	if (scores == null || scores.length < 3)
    		return false;
    				
        for (int i = 1; i < scores.length - 1; i++)
            if (Math.abs(scores[i - 1] - scores[i + 1]) <= 2)
       			return true;
        
        return false;
    }

    /*
    Given a sorted array, return true if the array contains 3 adjacent scores 
    that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}. 
    Use Lambda. Do not use loops.
    scoresClump({3, 4, 5}) → true
    scoresClump({3, 4, 6}) → false
    scoresClump({1, 3, 5, 5}) → true
    */
    public static boolean scoresClumpLambda(int[] scores)
    {
        //return scores.Skip(2).Where((val, index) => Math.abs(val - scores[index]) <= 2).Any();
    	return false;
    }

    /*
    Given an array of scores, compute the int average of the first half and the second half, and return 
    whichever is larger. We'll say that the second half begins at index length/2. The array length will 
    be at least 2. Normally you would compute averages with doubles, but here we use ints so the expected 
    results are exact. 

    scoresAverage({2, 2, 4, 4}) → 4
    scoresAverage({4, 4, 4, 2, 2, 2}) → 4
    scoresAverage({3, 4, 5, 1, 2, 3}) → 4
    */
    public static int scoresAverage(int[] scores)
    {
        int leftCount = 0;
        int rightCount = 0;
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < scores.length; i++)
        {
            if (i < scores.length / 2)
            {
                leftCount++;
                leftSum += scores[i];
            }
            else
            {
                rightCount++;
                rightSum += scores[i];
            }
        }

        return Math.max(leftSum / leftCount, rightSum / rightCount);
    }

    /*
    Given an array of scores, compute the int average of the first half and the second half, and return 
    whichever is larger. We'll say that the second half begins at index length/2. The array length will 
    be at least 2. Normally you would compute averages with doubles, but here we use ints so the expected 
    results are exact. Use Lambda. Do not use loops.

    scoresAverage({2, 2, 4, 4}) → 4
    scoresAverage({4, 4, 4, 2, 2, 2}) → 4
    scoresAverage({3, 4, 5, 1, 2, 3}) → 4
    */
    public static int scoresAverageLambda(int[] scores)
    {
    	/*
        return (int)Math.max(scores.Take(scores.length / 2).Average(),
                             scores.Skip(scores.length / 2).Average());
		*/
    	return 0;
    }

    /*
    Given an array of Strings, return the count of the number of Strings with the given length. 

    wordsCount({"a", "bb", "b", "ccc"}, 1) → 2
    wordsCount({"a", "bb", "b", "ccc"}, 3) → 1
    wordsCount({"a", "bb", "b", "ccc"}, 4) → 0
    */
    public static int wordsCount(String[] words, int len)
    {
        int count = 0;

        for (String word : words)
        	if (word != null)
        		if (word.length() == len)
        			count++;

        return count;
    }

    /*
    Given an array of Strings, return the count of the number of Strings with the given length. 
    Use Lambda. Do not use loops.
    wordsCountLambda({"a", "bb", "b", "ccc"}, 1) → 2
    wordsCountLambda({"a", "bb", "b", "ccc"}, 3) → 1
    wordsCountLambda({"a", "bb", "b", "ccc"}, 4) → 0
    */
    public static int wordsCountLambda(String[] words, int len)
    {
        //return words.Where(word => word.length == len).Count();
    	return 0;
    }

    /*
    Given an array of Strings, return a new array containing the first N Strings. 
    N will be in the range 1..length.

    wordsFront({"a", "b", "c", "d"}, 1) → {"a"}
    wordsFront({"a", "b", "c", "d"}, 2) → {"a", "b"}
    wordsFront({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
    */
    public static String[] wordsFront(String[] words, int n)
    {
        String[] result = new String[n];
        System.arraycopy(words, 0, result, 0, n);
        return result;
    }

    /*
    Given an array of Strings, return a new array containing the first N Strings. 
    N will be in the range 1..length. Use Lambda. Do not use loops.

    wordsFrontLambda({"a", "b", "c", "d"}, 1) → {"a"}
    wordsFrontLambda({"a", "b", "c", "d"}, 2) → {"a", "b"}
    wordsFrontLambda({"a", "b", "c", "d"}, 3) → {"a", "b", "c"}
    */
    public static String[] wordsFrontLambda(String[] words, int n)
    {
        //return words.Take(n).ToArray();
    	return null;
    }

    /*
    Given an array of Strings, return a new List (e.g. an ArrayList) where all the Strings of the 
    given length are omitted. 

    wordsWithoutList({"a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
    wordsWithoutList({"a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
    wordsWithoutList({"a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}
    */
    public static List<String> wordsWithoutList(String[] words, int len)
    {
        List<String> result = new ArrayList<String>();

        for (String word : words)
        {
            if (word.length() != len)
                result.add(word);
        }

        return result;
    }

    /*
    Given an array of Strings, return a new List(e.g.an ArrayList) where all the Strings of the
    given length are omitted. Use Lambda. Do not use loops.

    wordsWithoutListLambda({ "a", "bb", "b", "ccc"}, 1) → {"bb", "ccc"}
    wordsWithoutListLambda({ "a", "bb", "b", "ccc"}, 3) → {"a", "bb", "b"}
    wordsWithoutListLambda({ "a", "bb", "b", "ccc"}, 4) → {"a", "bb", "b", "ccc"}
    */
    public static List<String> wordsWithoutListLambda(String[] words, int len)
    {
        //return words.Where(word => word.length != len).ToList<String>();
    	return new ArrayList<String>();
    }

    /*
    Given an int n, return true if it contains a 1 digit. Use Lambda. Do not use loops.
    hasOneLambda(10) → true
    hasOneLambda(22) → false
    hasOneLambda(220) → false
    */
    public static boolean hasOneLambda(int n)
    {
        //return n.ToString().Contains("1");
    	return false;
    }

    /*
    Given an int n, return true if it contains a 1 digit. Use a loop.
    hasOne(10) → true
    hasOne(22) → false
    hasOne(220) → false
    */
    public static boolean hasOne(int n)
    {
        int num = Math.abs(n);

        while (num > 0)
        {
            int digit = num % 10;

            if (digit == 1)
                return true;

            num /= 10;
        }

        return false;
    }

    /*
    We'll say that a positive int divides itself if every digit in the number divides into the 
    number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. 
    We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. 

    dividesSelf(128) → true
    dividesSelf(12) → true
    dividesSelf(120) → false
    */
    public static boolean dividesSelf(int n)
    {
        if (n == 0)
            return false;

        int num = Math.abs(n);

        while (num > 0)
        {
            int digit = n % 10;

            if (digit == 0)
                return false;
            else if (n % digit != 0)
                return false;

            num /= 10;
        }

        return true;
    }

    /*
    Given an array of positive ints, return a new array of length "count" containing the first even 
    numbers from the original array. The original array will contain at least "count" even numbers. 

    copyEvens({3, 2, 4, 5, 8}, 2) → {2, 4}
    copyEvens({3, 2, 4, 5, 8}, 3) → {2, 4, 8}
    copyEvens({6, 1, 2, 4, 5, 8}, 3) → {6, 2, 4}
    */
    public static int[] copyEvens(int[] nums, int count)
    {
        int[] result = new int[count];
        int rpos = 0;
        int npos = 0;

        while (rpos < count)
        {
            if (nums[npos] % 2 == 0)
            {
                result[rpos] = nums[npos];
                rpos++;
            }

            npos++;
        }

        return result;
    }

    /*
    Given an array of positive ints, return a new array of length "count" containing the first even 
    numbers from the original array. The original array will contain at least "count" even numbers. 
    Use Lambda. Do not use loops.
    copyEvens({3, 2, 4, 5, 8}, 2) → {2, 4}
    copyEvens({3, 2, 4, 5, 8}, 3) → {2, 4, 8}
    copyEvens({6, 1, 2, 4, 5, 8}, 3) → {6, 2, 4}
    */
    public static int[] copyEvensLambda(int[] nums, int count)
    {
        //return nums.Where(num => num % 2 == 0).Take(count).ToArray();
    	return null;
    }

    /*
    We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
    Given an array of positive ints, return a new array of length "count" containing the first endy 
    numbers from the original array. 

    copyEndy({9, 11, 90, 22, 6}, 2) → {9, 90}
    copyEndy({9, 11, 90, 22, 6}, 3) → {9, 90, 6}
    copyEndy({12, 1, 1, 13, 0, 20}, 2) → {1, 1}
    */
    public static int[] copyEndy(int[] nums, int count)
    {
        int[] result = new int[count];
        int rpos = 0;
        int npos = 0;

        while (rpos < count)
        {
            if ((nums[npos] >= 0  && nums[npos] <= 10) 
             || (nums[npos] >= 90 && nums[npos] <= 100))
            {
                result[rpos] = nums[npos];
                rpos++;
            }

            npos++;
        }

        return result;
    }

    /*
    We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). 
    Given an array of positive ints, return a new array of length "count" containing the first endy 
    numbers from the original array. Use Lambda. Do not use loops.

    copyEndyLambda({9, 11, 90, 22, 6}, 2) → {9, 90}
    copyEndyLambda({9, 11, 90, 22, 6}, 3) → {9, 90, 6}
    copyEndyLambda({12, 1, 1, 13, 0, 20}, 2) → {1, 1}
    */
    public static int[] copyEndyLambda(int[] nums, int count)
    {
    	/*
        return nums
            .Where(num => (num >= 0 && num <= 10) || (num >= 90 && num <= 100))
            .Take(count).ToArray();
        */
    	return null;
    }

    /*
    Given 2 arrays that are the same length containing Strings, compare the 1st String in one 
    array to the 1st String in the other array, the 2nd to the 2nd and so on. Count the number 
    of times that the 2 Strings are non-empty and start with the same char. The Strings may be 
    any length, including 0. 

    matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) → 1
    matchUp({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) → 2
    matchUp({"aa", "bb", "cc"}, {"", "", "ccc"}) → 1
    */
    public static int matchUp(String[] a, String[] b)
    {
        int count = 0;
        int len = Math.min(a.length, b.length);

        for (int i = 0; i < len; i++)
        {
            if (a[i] != null && !b[i].isEmpty())
                if (a[i].charAt(0) == b[i].charAt(0))
                    count++;
        }

        return count;
    }

    /*
    Given 2 arrays that are the same length containing Strings, compare the 1st String in one 
    array to the 1st String in the other array, the 2nd to the 2nd and so on. Count the number 
    of times that the 2 Strings are non-empty and start with the same char. The Strings may be 
    any length, including 0. Use Lambda. Do not use loops.

    matchUpLambda({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) → 1
    matchUpLambda({"aa", "bb", "cc"}, {"aaa", "b", "bb"}) → 2
    matchUpLambda({"aa", "bb", "cc"}, {"", "", "ccc"}) → 1
    */
    public static int matchUpLambda(String[] a, String[] b)
    {
    	/*
        var matches = a.Zip(b, (x, y) => !String.IsNullOrEmpty(x) 
                                      && !String.IsNullOrEmpty(y) 
                                      && x[0] == y[0]);

        return matches.Where(element => element == true).Count();
        */
    	return 0;
    }

    /*
    The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. 
    The "answers" array contains a student's answers, with "?" representing a question left blank. 
    The two arrays are not empty and are the same length. Return the score for this array of answers, 
    giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer. 

    scoreUp({"a", "a", "b", "b"}, {"a", "c", "b", "c"}) → 6
    scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "c"}) → 11
    scoreUp({"a", "a", "b", "b"}, {"a", "a", "b", "b"}) → 16
    */
    public static int scoreUp(String[] key, String[] answers)
    {
        int score = 0;
        for (int i = 0; i < Math.min(key.length, answers.length); i++)
        {
            if (key[i] != null && !answers[i].isEmpty())
                if (key[i] == answers[i])
                    score += 4;
                else if (answers[i] != "?")
                    score -= 1;
        }
        return score;
    }

    /*
    The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. 
    The "answers" array contains a student's answers, with "?" representing a question left blank. 
    The two arrays are not empty and are the same length. Return the score for this array of answers, 
    giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer. 

    scoreUpLambda({"a", "a", "b", "b"}, {"a", "c", "b", "c"}) → 6
    scoreUpLambda({"a", "a", "b", "b"}, {"a", "a", "b", "c"}) → 11
    scoreUpLambda({"a", "a", "b", "b"}, {"a", "a", "b", "b"}) → 16
    */
    public static int scoreUpLambda(String[] key, String[] answers)
    {
        final int pointsPerCorrect = 4;
        final int wrongPenalty = 1;
        final int blankPenalty = 0;

        /*
        var results = key.Zip(answers, (x, y) => x == y);
        int corrects = results.Where(element => element == true).Count();
        int blanks = answers.Where(x => x == "?").Count();
        int incorrects = answers.length - corrects - blanks;

        return corrects * pointsPerCorrect - incorrects * wrongPenalty - blanks * blankPenalty;
        */
        return 0;
    }

    /*
    Given an array of Strings, return a new array without the Strings that are equal to the target 
    String.  

    wordsWithout({"a", "b", "c", "a"}, "a") → {"b", "c"}
    wordsWithout({"a", "b", "c", "a"}, "b") → {"a", "c", "a"}
    wordsWithout({"a", "b", "c", "a"}, "c") → {"a", "b", "a"}
    */
    public static String[] wordsWithout(String[] words, String target)
    {
        List<String> result = new ArrayList<String>();

        for (String word : words)
        {
            if (word != target)
                result.add(word);
        }

        String result2[] = new String[result.size()];
        result2 = result.toArray(result2);
        return result2;
    }

    /*
    Given an array of Strings, return a new array without the Strings that are equal to the target 
    String. Use Lambda. Do not use loops.

    wordsWithoutLambda({"a", "b", "c", "a"}, "a") → {"b", "c"}
    wordsWithoutLambda({"a", "b", "c", "a"}, "b") → {"a", "c", "a"}
    wordsWithoutLambda({"a", "b", "c", "a"}, "c") → {"a", "b", "a"}
    */
    public static String[] wordsWithoutLambda(String[] words, String target)
    {
        //return words.Where(word => word != target).ToArray();
    	return null;
    }

    /*
    Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a 
    multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest 
    special score in B. 

    scoresSpecial({12, 10, 4}, {2, 20, 30}) → 40
    scoresSpecial({20, 10, 4}, {2, 20, 10}) → 40
    scoresSpecial({12, 11, 4}, {2, 20, 31}) → 20
    */
    public static int scoresSpecial(int[] a, int[] b)
    {
        int aMod10Max = 0;
        int bMod10Max = 0;

        for (int num : a)
            if (num % 10 == 0 && num > aMod10Max)
                aMod10Max = num;

        for (int num : b)
            if (num % 10 == 0 && num > bMod10Max)
                bMod10Max = num;

        return aMod10Max + bMod10Max;
    }

    /*
    Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a 
    multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest 
    special score in B. Use Lambda. Do not use loops.

    scoresSpecialLambda({12, 10, 4}, {2, 20, 30}) → 40
    scoresSpecialLambda({20, 10, 4}, {2, 20, 10}) → 40
    scoresSpecialLambda({12, 11, 4}, {2, 20, 31}) → 20
    */
    public static int scoresSpecialLambda(int[] a, int[] b)
    {
    	/*
        int aMod10Max = a.Where(value => value % 10 == 0).DefaultIfEmpty(0).Max();
        int bMod10Max = b.Where(value => value % 10 == 0).DefaultIfEmpty(0).Max();
        return aMod10Max + bMod10Max;
        */
    	return 0;
    }

    /*
    We have an array of heights, representing the altitude along a walking trail. Given start/end 
    indexes into the array, return the sum of the changes for a walk beginning at the start index 
    and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 
    yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array 
    with start <= end. 

    sumHeights({5, 3, 6, 7, 2}, 2, 4) → 6
    sumHeights({5, 3, 6, 7, 2}, 0, 1) → 2
    sumHeights({5, 3, 6, 7, 2}, 0, 4) → 11
    */
    public static int sumHeights(int[] heights, int start, int end)
    {
        int sum = 0;

        for (int i = start; i < end; i++)
            sum += Math.abs(heights[i] - heights[i + 1]);

        return sum;
    }

    /*
    We have an array of heights, representing the altitude along a walking trail. Given start/end 
    indexes into the array, return the sum of the changes for a walk beginning at the start index 
    and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 
    yields a sum of 1 + 5 = 6. The start end end index will both be valid indexes into the array 
    with start <= end. Use Lambda. Do not use loops.

    sumHeightsLambda({5, 3, 6, 7, 2}, 2, 4) → 6
    sumHeightsLambda({5, 3, 6, 7, 2}, 0, 1) → 2
    sumHeightsLambda({5, 3, 6, 7, 2}, 0, 4) → 11
    */
    public static int sumHeightsLambda(int[] heights, int start, int end)
    {
    	/*
        var steps = heights.Skip(start).Take(1 + end - start);

        return steps
            .Zip(steps
            .Skip(1), (x, y) => Math.abs(y - x))
            .Sum();
        */
    	return 0;
    }

    /*
    (A variation on the sumHeights problem.) We have an array of heights, representing the altitude 
    along a walking trail. Given start/end indexes into the array, return the sum of the changes 
    for a walk beginning at the start index and ending at the end index, however increases in height 
    count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum 
    of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with start <= end. 

    sumHeights2({5, 3, 6, 7, 2}, 2, 4) → 7
    sumHeights2({5, 3, 6, 7, 2}, 0, 1) → 2
    sumHeights2({5, 3, 6, 7, 2}, 0, 4) → 15
    */
    public static int sumHeights2(int[] heights, int start, int end)
    {
        int sum = 0;
        for(int i = start; i < end; i++)
        {
            if (heights[i + 1] > heights[i])
                sum += 2 * (heights[i + 1] - heights[i]);
            else
                sum += heights[i] - heights[i + 1];
        }
        return sum;
    }

    /*
    (A variation on the sumHeights problem.) We have an array of heights, representing the altitude 
    along a walking trail. Given start/end indexes into the array, return the number of "big" steps 
    for a walk starting at the start index and ending at the end index. We'll say that step is big 
    if it is 5 or more up or down. The start end end index will both be valid indexes into the array 
    with start <= end. 

    bigHeights({5, 3, 6, 7, 2}, 2, 4) → 1
    bigHeights({5, 3, 6, 7, 2}, 0, 1) → 0
    bigHeights({5, 3, 6, 7, 2}, 0, 4) → 1
    */
    public static int bigHeights(int[] heights, int start, int end)
    {
        int count = 0;

        for (int i = start; i < end; i++)
            if (Math.abs(heights[i + 1] - heights[i]) >= 5)
                count++;

        return count;

    }

    /*
    (A variation on the sumHeights problem.) We have an array of heights, representing the altitude 
    along a walking trail. Given start/end indexes into the array, return the number of "big" steps 
    for a walk starting at the start index and ending at the end index. We'll say that step is big 
    if it is 5 or more up or down. The start end end index will both be valid indexes into the array 
    with start <= end. Use Lambda. Do not use loops.

    bigHeightsLambda({5, 3, 6, 7, 2}, 2, 4) → 1
    bigHeightsLambda({5, 3, 6, 7, 2}, 0, 1) → 0
    bigHeightsLambda({5, 3, 6, 7, 2}, 0, 4) → 1
    */
    public static int bigHeightsLambda(int[] heights, int start, int end)
    {
    	/*
        var steps = heights.Skip(start).Take(1 + end - start);

        return steps
            .Zip(steps.Skip(1), (x, y) => Math.abs(y - x))
            .Where(value => value >= 5).Count();
        */
    	return 0;
    }

    /*
    We have data for two users, A and B, each with a String name and an int id. The goal is to order 
    the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they 
    are the same. Order first by the String names, and then by the id numbers if the names are the same. 
    
    userCompare("bb", 1, "zz", 2) → -1
    userCompare("bb", 1, "aa", 2) → 1
    userCompare("bb", 1, "bb", 1) → 0
    */
    public static int userCompare(String aName, Integer aId, String bName, Integer bId)
    {
        if (aName.compareTo(bName) < 0)
            return -1;
        else if (aName.compareTo(bName) > 0)
            return 1;
        else if (aId.compareTo(bId) < 0)
            return -1;
        else if (aId.compareTo(bId) > 0)
            return 1;
        else
            return 0;

    }

    /*
    Start with two arrays of Strings, A and B, each with its elements in alphabetical order and 
    without duplicates. Return a new array containing the first N elements from the two arrays. 
    The result array should be in alphabetical order and without duplicates. A and B will both 
    have a length which is N or more. The best "linear" solution makes a single pass over A and B, 
    taking advantage of the fact that they are in alphabetical order, copying elements directly 
    to the new array. 

    mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
    mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
    mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}
    */
    public static String[] mergeTwo(String[] a, String[] b, int n)
    {
        String[] result = new String[n];
        int apos = 0;
        int bpos = 0;
        for (int i = 0; i < result.length; i++)
        {
            while(apos < a.length && i > 0 && a[apos].compareTo(result[i-1]) <= 0)
                apos++;

            while (bpos < b.length && i > 0 && b[bpos].compareTo(result[i-1]) <= 0)
                bpos++;

            if (a[apos].compareTo(b[bpos]) <= 0)
                result[i] = a[apos++];
            else
                result[i] = b[bpos++];
        }
        return result;
    }

    /*
    Start with two arrays of Strings, A and B, each with its elements in alphabetical order and 
    without duplicates. Return a new array containing the first N elements from the two arrays. 
    The result array should be in alphabetical order and without duplicates. A and B will both 
    have a length which is N or more. Use Lambda. Do not use loops.

    mergeTwoLambda({"a", "c", "z"}, {"b", "f", "z"}, 3) → {"a", "b", "c"}
    mergeTwoLambda({"a", "c", "z"}, {"c", "f", "z"}, 3) → {"a", "c", "f"}
    mergeTwoLambda({"f", "g", "z"}, {"c", "f", "g"}, 3) → {"c", "f", "g"}
    */
    public static String[] mergeTwoLambda(String[] a, String[] b, int n)
    {
        //return a.Concat(b).OrderBy(v => v).Distinct().Take(n).ToArray();
    	return null;
    }

    /*
    Start with two arrays of Strings, a and b, each in alphabetical order, possibly with duplicates. 
    Return the count of the number of Strings which appear in both arrays. The best "linear" solution 
    makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical 
    order. 

    commonTwo({"a", "c", "c", "x"}, {"b", "c", "d", "x"}) → 2
    commonTwo({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) → 3
    commonTwo({"a", "b", "c"}, {"a", "b", "c"}) → 3
    */
    public static int commonTwo(String[] a, String[] b)
    {
        int count = 0;
        int apos = 0;
        int bpos = 0;

        while (apos < a.length && bpos < b.length)
        {
            while (apos > 0 && a[apos - 1] == a[apos])
                apos++;

            while (bpos > 0 && b[bpos - 1] == b[bpos])
                bpos++;

            if (a[apos].compareTo(b[bpos]) < 0)
                apos++;
            else if(a[apos].compareTo(b[bpos]) > 0)
                 bpos++;
            else
            {
                count++;
                apos++;
                bpos++;
            }
        }

        return count;
    }

    /*
    Start with two arrays of Strings, a and b, each in alphabetical order, possibly with duplicates. 
    Return the count of the number of Strings which appear in both arrays. The best "linear" solution 
    makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical 
    order. Use Lambda. Do not use loops.

    commonTwoLambda({"a", "c", "c", "x"}, {"b", "c", "d", "x"}) → 2
    commonTwoLambda({"a", "c", "x"}, {"a", "b", "c", "x", "z"}) → 3
    commonTwoLambda({"a", "b", "c"}, {"a", "b", "c"}) → 3
    */
    public static int commonTwoLambda(String[] a, String[] b)
    {
        //return a.Intersect(b).Count();
    	return 0;
    }

}
