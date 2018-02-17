package codingbat;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.IntPredicate;

public class Logic2 {

	public static void main(String[] args) {
		
        System.out.println("makeBricks");
        System.out.println(makeBricks(3, 1, 8) == true);
        System.out.println(makeBricks(3, 1, 9) == false);
        System.out.println(makeBricks(3, 2, 10) == true);

        System.out.println("loneSum");
        System.out.println(loneSum(1, 2, 3) == 6);
        System.out.println(loneSum(3, 2, 3) == 2);
        System.out.println(loneSum(3, 3, 3) == 0);

        System.out.println("loneSumLambda");
        System.out.println(loneSumLambda(1, 2, 3) == 6);
        System.out.println(loneSumLambda(3, 2, 3) == 2);
        System.out.println(loneSumLambda(3, 3, 3) == 0);

        System.out.println("luckySum");
        System.out.println(luckySum(1, 2, 3) == 6);
        System.out.println(luckySum(1, 2, 13) == 3);
        System.out.println(luckySum(1, 13, 3) == 1);

        System.out.println("noTeenSum");
        System.out.println(noTeenSum(1, 2, 3) == 6);
        System.out.println(noTeenSum(2, 13, 1) == 3);
        System.out.println(noTeenSum(2, 1, 14) == 3);

        System.out.println("noTeenSumLambda");
        System.out.println(noTeenSumLambda(1, 2, 3) == 6);
        System.out.println(noTeenSumLambda(2, 13, 1) == 3);
        System.out.println(noTeenSumLambda(2, 1, 14) == 3);

        System.out.println("roundSum");
        System.out.println(roundSum(16, 17, 18) == 60);
        System.out.println(roundSum(12, 13, 14) == 30);
        System.out.println(roundSum(6, 4, 4) == 10);

        System.out.println("roundSumLambda");
        System.out.println(roundSumLambda(16, 17, 18) == 60);
        System.out.println(roundSumLambda(12, 13, 14) == 30);
        System.out.println(roundSumLambda(6, 4, 4) == 10);

        System.out.println("closeFar");
        System.out.println(closeFar(1, 2, 10, 20) == true);
        System.out.println(closeFar(1, 2, 3, 4) == false);
        System.out.println(closeFar(1, 2, 10, 0) == false);

        System.out.println("blackjack");
        System.out.println(blackjack(21, 20, 21) == 21);
        System.out.println(blackjack(21, 21, 20) == 21);
        System.out.println(blackjack(21, 21, 22) == 21);
        System.out.println(blackjack(21, 22, 21) == 21);
        System.out.println(blackjack(21, 22, 23) == 0);

        System.out.println("blackjackLambda");
        System.out.println(blackjackLambda(21, 20, 21) == 21);
        System.out.println(blackjackLambda(21, 21, 20) == 21);
        System.out.println(blackjackLambda(21, 21, 22) == 21);
        System.out.println(blackjackLambda(21, 22, 21) == 21);
        System.out.println(blackjackLambda(21, 22, 23) == 0);

        System.out.println("evenlySpaced");
        System.out.println(evenlySpaced(2, 4, 6) == true);
        System.out.println(evenlySpaced(4, 6, 2) == true);
        System.out.println(evenlySpaced(4, 6, 3) == false);

        System.out.println("makeChocolate");
        System.out.println(makeChocolate(4, 1, 9) == 4);
        System.out.println(makeChocolate(4, 1, 10) == -1);
        System.out.println(makeChocolate(4, 1, 7) == 2);

	}

    /*
    We want to make a row of bricks that is goal inches long. 
    We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
    Return true if it is possible to make the goal by choosing from the given bricks. 
    This is a little harder than it looks and can be done without any loops. 

    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
    */
    public static boolean makeBricks(int small, int big, int goal)
    {
        return 5 * big + small >= goal && small >= goal % 5;
    }

    /*
    Given integer values, return their sum. If one value is the 
    same as another, it does not count towards the sum. 

    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0
    */
    public static int loneSum(int... values)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        
        for (int v : values) { 
            if (map.containsKey(v))
            	map.put(v, map.get(v) + 1);
            else
            	map.putIfAbsent(v, 1);
        }

        for(int k : map.keySet())
        	if (map.get(k) == 1)
        		sum += k;
        
        return sum;
    }

    /*
    Given integer values, return their sum. If one value is the 
    same as another, it does not count towards the sum. 

    loneSum(1, 2, 3) → 6
    loneSum(3, 2, 3) → 2
    loneSum(3, 3, 3) → 0
    */
    public static int loneSumLambda(int... values)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int v : values) { 
            if (map.containsKey(v))
            	map.put(v, map.get(v) + 1);
            else
            	map.putIfAbsent(v, 1);
        }
        
        return map.entrySet().stream().filter(e -> e.getValue() == 1).mapToInt(e -> e.getKey()).sum();
    }

    /*
    Given 3 int values, a b c, return their sum. 
    However, if one of the values is 13 then it does not count towards the sum 
    and values to its right do not count. So for example, if b is 13, then both 
    b and c do not count. 

    luckySum(1, 2, 3) → 6
    luckySum(1, 2, 13) → 3
    luckySum(1, 13, 3) → 1
    */
    public static int luckySum(int... values)
    {
        int sum = 0;
        
        for (int val : values)
        {
            if (val == 13)
                break;
            else
                sum += val;
        }
        
        return sum;
    }

    /*
    Given 3 int values, a b c, return their sum. 
    However, if any of the values is a teen -- in the 
    range 13..19 inclusive -- then that value counts as 0, 
    except 15 and 16 do not count as a teens. Write a 
    separate helper method "public int fixTeen(int n) {

    noTeenSum(1, 2, 3) → 6
    noTeenSum(2, 13, 1) → 3
    noTeenSum(2, 1, 14) → 3
    */
    public static int noTeenSum(int... values)
    {
        int sum = 0;
        
        for (int n : values)
            if (n < 13 || n > 19 || (n >= 15 && n <= 16))
				sum += n;

        return sum;
    }

    /*
    Given 3 int values, a b c, return their sum. 
    However, if any of the values is a teen -- in the 
    range 13..19 inclusive -- then that value counts as 0, 
    except 15 and 16 do not count as a teens. 
    Use Lambda. Do not use loops.

    noTeenSumLambda(1, 2, 3) → 6
    noTeenSumLambda(2, 13, 1) → 3
    noTeenSumLambda(2, 1, 14) → 3
    */
    public static int noTeenSumLambda(int... values)
    {
    	IntPredicate p = n -> n < 13 || n > 19 || (n >= 15 && n <= 16);
        return Arrays.stream(values).filter(p).sum();
    }

    /*
    For this problem, we'll round an int value up to the next multiple of 10 
    if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, 
    round down to the previous multiple of 10 if its rightmost digit is less
    than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of 
    their rounded values. To avoid code repetition, write a separate helper 
    "public int round10(int num) {" and call it 3 times. 

    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10
    */
    public static int roundSum(int... values)
    {
    	int sum = 0;
    	
        for(int n : values)
        	sum += round10(n);
        
        return sum;
    }

    public static int round10(int num)
    {
        if (num % 10 >= 5)
            return (num / 10) * 10 + 10;
        else
            return (num / 10) * 10;
    }

    /*
    For this problem, we'll round an int value up to the next multiple of 10 
    if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, 
    round down to the previous multiple of 10 if its rightmost digit is less
    than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of 
    their rounded values. Use Lambda. Do not use loops. 

    roundSumLambda(16, 17, 18) → 60
    roundSumLambda(12, 13, 14) → 30
    roundSumLambda(6, 4, 4) → 10
    */
    public static int roundSumLambda(int... values)
    {
    	return Arrays.stream(values).map(val -> round10(val)).sum();
    }    
    
    /*
    Given three ints, a b c, return true if one of b or c is "close" 
    (differing from a by at most 1), while the other is "far", 
    differing from both other values by 2 or more. 

    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
    */
    public static boolean closeFar(int a, int... values)
    {
        boolean[] closeToA = new boolean[values.length];
        boolean[] farFromOthers = new boolean[values.length];

        for (int i = 0; i < values.length; i++)
        {
            closeToA[i] = Math.abs(a - values[i]) <= 1;

            int min = Integer.MAX_VALUE; 
            
            for (int j = 0; j < values.length; j++)
            {
                if (i != j)
                    min = Math.min(min, Math.abs(values[j] - values[i]));
            }
            
            farFromOthers[i] = min >= 2;
        }

        for (int i = 0; i < values.length; i++)
        {
            if (closeToA[i])
            {
                boolean allFar = true;
                for (int j = 0; j < values.length; j++)
                {
                    if (i != j)
                    {
                        if (!farFromOthers[j] || closeToA[j])
                        {
                            allFar = false;
                            break;
                        }
                    }
                }
                if (allFar)
                    return true;
            }
        }
        return false;
    }

    /*
    
    Given 2 int values greater than 0, return whichever value is 
    nearest to 21 without going over. Return 0 if they both go over. 

    blackjack(21, 19, 21, 21) → 21
    blackjack(21, 21, 19) → 21
    blackjack(21, 19, 22) → 19
    */
    public static int blackjack(int limit, int... values)
    {
        int max = 0;
        
        for (int val : values)
            if (val <= limit && val > max)
            	max = val;

        return max;
    }

    /*
    
    Given 2 int values greater than 0, return whichever value is 
    nearest to 21 without going over. Return 0 if they both go over. 
    Use Lambda. Do not use loops.
    blackjackLambda(21, 19, 21, 21) → 21
    blackjackLambda(21, 21, 19) → 21
    blackjackLambda(21, 19, 22) → 19
    */
    public static int blackjackLambda(int limit, int... values)
    {
    	return Arrays.stream(values).filter(val -> val <= limit).max().orElse(0);
    }

    /*
    Given three ints, a b c, one of them is small, one is medium and one is large. 
    Return true if the three values are evenly spaced, so the difference between 
    small and medium is the same as the difference between medium and large. 

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
    */
    public static boolean evenlySpaced(int... values)
    {
        Arrays.sort(values);

        for (int i = 2; i < values.length; i++)
            if (values[i] - values[i-1] != values[i - 1] - values[i - 2])
                return false;

        return true;
    }

    /*
    We want make a package of goal kilos of chocolate. 
    We have small bars (1 kilo each) and big bars (5 kilos each). 
    Return the number of small bars to use, assuming we always 
    use big bars before small bars. Return -1 if it can't be done. 

    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2
    */
    public static int makeChocolate(int small, int big, int goal)
    {
        if (5 * big + small >= goal && goal % 5 <= small)
            return goal % 5;
        else
            return -1;
    }

}
