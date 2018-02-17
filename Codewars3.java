package codingbat;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Codewars3 {

	public static void main(String[] args) {
        System.out.println("TwistedSum");
        System.out.println(TwistedSum(10));// == 46 = 46 * 1 + 0);
        System.out.println(TwistedSum(11));// == 48);
        System.out.println(TwistedSum(12));// == 51);
        System.out.println(TwistedSum(20));// == 102 = 46 * 2 + 10); 
        System.out.println(TwistedSum(90));// == 774 = 46 * 9 + 360);
        System.out.println(TwistedSum(99));// == 900 = );
        System.out.println(TwistedSum(100));// == 901 = 46 * 10 + 441);
        System.out.println(TwistedSum(1000));// == 13501);

        System.out.println("bouncingBall");
        System.out.println(bouncingBall(3, 0.66, 1.5) == 3);
        System.out.println(bouncingBall(3, 1, 1.5) == -1);

        System.out.println("dirReduc");
        System.out.println(Arrays.equals(dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }), new String[] { "WEST" }));
        System.out.println(Arrays.equals(dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH" }), new String[] { }));
    
        System.out.println("isMerge");
        System.out.println(isMerge("codewars", "cdw", "oears") == true);
        System.out.println(isMerge("codewars", "cod", "wars") == false);
        System.out.println(isMerge("Can we merge it? Yes, we can!", "n ee tYw n!", "Cawe mrgi? es, eca") == true);
        System.out.println(isMerge("", "", "") == true);
        System.out.println(isMerge("BananaBanana", "Banana", "Banana") == true);
    
        System.out.println("orderWeight");
        System.out.println(orderWeight("103 123 4444 99 2000").equals("2000 103 123 4444 99"));
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123").equals("11 11 2000 10003 22 123 1234000 44444444 9999"));
        
        System.out.println("GetReadableTime");
        System.out.println(GetReadableTime(0));//.equals("00:00:00");
        System.out.println(GetReadableTime(60));//.equals("00:01:00");
        System.out.println(GetReadableTime(86399));//.equals("23:59:59");
        System.out.println(GetReadableTime(359999));//.equals("4.03:59:59"); 

        System.out.println("Score");
        System.out.println(Score(new int[] { 5, 1, 3, 4, 1 }) == 250);
        System.out.println(Score(new int[] { 1, 1, 1, 3, 1 }) == 1100);
        System.out.println(Score(new int[] { 2, 4, 4, 5, 4 }) == 450);
        
        System.out.println("DigitalRoot");
        System.out.println(DigitalRoot(15) ==  6);
        System.out.println(DigitalRoot(16) == 7);
        
        System.out.println("NextBiggerNumber");
        System.out.println(NextBiggerNumber(12) == 21);
        System.out.println(NextBiggerNumber(513) == 531);
        System.out.println(NextBiggerNumber(2017) == 2071);
        System.out.println(NextBiggerNumber(144) == 414);
        System.out.println(NextBiggerNumber(1234567890) == 1234567908);
        System.out.println(NextBiggerNumber(111) == -1);
        System.out.println(NextBiggerNumber(9) == -1);

        System.out.println("maxPizza");
        System.out.println(maxPizza(0));
        System.out.println(maxPizza(1));
        System.out.println(maxPizza(2));
        System.out.println(maxPizza(3));
        
        System.out.println("isTriangleNumber");
        System.out.println(isTriangleNumber(0) == true);
        System.out.println(isTriangleNumber(1) == true);
        System.out.println(isTriangleNumber(2) == false);
        System.out.println(isTriangleNumber(3) == true);
        System.out.println(isTriangleNumber(4) == false);
        System.out.println(isTriangleNumber(5) == false);
        System.out.println(isTriangleNumber(6) == true);
        System.out.println(isTriangleNumber(10) == true);
        System.out.println(isTriangleNumber(120) == true);
        System.out.println(isTriangleNumber(300) == true);
        System.out.println(isTriangleNumber(325) == true);
        
        System.out.println("validBraces");
        System.out.println(validBraces("(){}[]") == true);
        System.out.println(validBraces("(}") == false);
        System.out.println(validBraces("[(])") == false);
        System.out.println(validBraces("([{}])") == true);
        
        System.out.println("BinarytoString");
        System.out.println(BinarytoString("").equals(""));
        System.out.println(BinarytoString("0100100001100101011011000110110001101111").equals("Hello"));
        
        System.out.println("sumStrings");
        System.out.println(sumStrings("1", "2"));//.equals("3");
        System.out.println(sumStrings("123", "456"));//.equals("579");
        System.out.println(sumStrings("821429", "999999"));//.equals("1821428");
        System.out.println(sumStrings("712577413488402631964821329", "100"));//.equals("712577413488402631964821429");
        
        System.out.println("compoundArray");
        System.out.println(compoundArray(new int[] { 1, 2, 3, 4, 5, 6 },
            new int[] { 9, 8, 7, 6 }) == new int[] { 1, 9, 2, 8, 3, 7, 4, 6, 5, 6 });

        System.out.println("compoundArrayLambda");
        System.out.println(compoundArrayLambda(new int[] { 1, 2, 3, 4, 5, 6 },
            new int[] { 9, 8, 7, 6 }) == new int[] { 1, 9, 2, 8, 3, 7, 4, 6, 5, 6 });
        
        System.out.println("vowel2Index");
        System.out.println(vowel2Index("this is my String").equals("th3s 6s my str15ng"));
        System.out.println(vowel2Index("Codewars is the best site : the world")
                                  .equals("C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"));

        System.out.println("vowel2IndexLambda");
        System.out.println(vowel2IndexLambda("this is my String").equals("th3s 6s my str15ng"));
        System.out.println(vowel2IndexLambda("Codewars is the best site : the world")
                                  .equals("C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"));

        
        System.out.println("stat");
        System.out.println(stat("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17")
                      .equals("Range: 01|01|18 Average: 01|38|05 Median: 01|32|34"));
        System.out.println(stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41")
                      .equals("Range: 00|31|17 Average: 02|26|18 Median: 02|22|00"));
        System.out.println(stat("01|15|59, 1|47|16, 01|17|20, 1|32|34"));
        
        System.out.println("flipNumber");
        System.out.println(flipNumber("012345").equals("504132"));
        
        System.out.println("maxDifflength");
        String[] MDL1 = { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz" };
        String[] MDL2 = { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
        System.out.println(maxDifflength(MDL1, MDL2) == 13);

        System.out.println("maxDifflengthLambda");
        String[] MDLL1 = { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz" };
        String[] MDLL2 = { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };
        System.out.println(maxDifflengthLambda(MDLL1, MDLL2) == 13);

        System.out.println("inArray");
        String[] inA1 = { "arp", "live", "strong" };
        String[] inA2 = { "lively", "alive", "harp", "sharp", "armstrong" };
        String[] inA1inA2Result = { "arp", "live", "strong" };
        System.out.println(inArray(inA1, inA2) == inA1inA2Result);
        
        System.out.println("seriesSum");
        System.out.println(seriesSum(0).equals("0.00"));
        System.out.println(seriesSum(1) ==  "1.00");
        System.out.println(seriesSum(2).equals("1.25")); // 1 + 1 / 4
        System.out.println(seriesSum(5).equals("1.57")); // 1 + 1 / 4 + 1 / 7 + 1 / 10 + 1 / 13
	}

    /*
    Find the sum of the digits of all the numbers from 1 to N (both ends included).
    For N = 10 the sum is 1+2+3+4+5+6+7+8+9+(1+0) = 46
    For N = 11 the sum is 1+2+3+4+5+6+7+8+9+(1+0)+(1+1) = 48
    For N = 12 the sum is 1+2+3+4+5+6+7+8+9+(1+0)+(1+1) +(1+2)= 51
    When N = 123 Then 1038
    When N = 1234 Then 15895
    When N = 12345 Then 214455
    When N = 123456 Then 2700051
    When N = 1234567 Then 32556016
    */
    public static long TwistedSum(long n)
    {
        long num = Math.abs(n);
        long sumOfSums = 0;

        for (long i = 1; i <= num; i++)
        {
            long sum = 0;
            long val = i;
            while (val > 0)
            {
                sum += val % 10;
                val /= 10;
            }
            sumOfSums += sum;
        }
        return sumOfSums;
    }

    /*
     A child plays with a ball on the nth floor of a big building the height of which is known.
    (float parameter "h" in meters, h > 0)

    He drops the ball and the ball rebounds, for example, to two-thirds of its height.
    (float parameter "bounce", 0 < bounce < 1)

    His mother looks out of a window that is 1.5 meters from the ground.
    (float parameters window < h)

	The ball can only be seen if the height of the bouncing ball is greater than the window parameter.
    How many times will the mother see the ball either falling or bouncing in front of the window?
    (return a positive integer unless conditions are not fulfilled in which case return -1)

    Example:
    h = 3, bounce = 0.66, window = 1.5, result is 3
    h = 3, bounce = 1, window = 1.5, result is -1
    */
    public static int bouncingBall(double h, double bounce, double window)
    {
        // check for invalid input
        if (bounce >= 1 || window >= h || bounce <= 0 || h <= 0 || window <= 0)
            return -1;

        int count = 1;
        h = h * bounce;
        
        while (h > window)
        {
            count += 2;
            h = h * bounce;
        }
        
        return count;
    }

    /*
    You have to write a function dirReduc which will take an array of Strings and returns 
    an array of Strings with the needless directions removed (W<->E or S<->N) side by side.
    
    Examples
    dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})
    => new String[]{"WEST"}
    dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"})
    => new String[]{}
    */

    public static String[] dirReduc(String[] arr)
    {
        List<String> directions = new ArrayList<String>(Arrays.asList(arr));
        boolean didDelete = false;

        do
        {
            didDelete = reduceIt(directions);

        } while (didDelete);

        String result[] = new String[directions.size()];
        result = directions.toArray(result);
        return result;
    }

    private static boolean reduceIt(List<String> dir)
    {
        for (int i = dir.size() - 2; i >= 0; i--)
        {
             if ((dir.get(i + 1).equalsIgnoreCase("NORTH") && dir.get(i).equalsIgnoreCase("SOUTH"))
              || (dir.get(i + 1).equalsIgnoreCase("SOUTH") && dir.get(i).equalsIgnoreCase("NORTH"))
              || (dir.get(i + 1).equalsIgnoreCase("EAST")  && dir.get(i).equalsIgnoreCase("WEST"))
              || (dir.get(i + 1).equalsIgnoreCase("WEST")  && dir.get(i).equalsIgnoreCase("EAST")))
            {
                dir.remove(i + 1);
                dir.remove(i);
                return true;
            }
        }

        return false;
    }


    /*
    Write an algorithm to check if a given string, s, can be formed from two other strings, part1 and part2.
    The restriction is that the characters in part1 and part2 are in the same order as in the result, s.
    Example1: 'codewars' is a merge from 'cdw' and 'oears':
        s:  c o d e w a r s   = codewars
        part1:  c   d   w         = cdw
        part2:    o   e   a r s   = oears

    Example2: Can we merge it? Yes, we can!' is a merge of 'n ee tYw n!' and 'Cawe mrgi? es, eca

    */
    public static boolean isMerge(String s, String part1, String part2)
    {
        if (part1.length() + part2.length() != s.length())
            return false;
        if (part1.length() == 0 && part2.length() == 0)
            return true;

        int posS = 0;
        int posP1 = 0;
        int posP2 = 0;
        Queue<Character> q = new LinkedList<>();
        boolean matchP1 = false;
        boolean matchP2 = false;
        boolean didUseQ = false;

        while (posS < s.length() - 1 && (posP1 < part1.length() || posP2 < part2.length()))
        {
            matchP1 = posP1 < part1.length() && s.charAt(posS) == part1.charAt(posP1) ? true : false;
            matchP2 = posP2 < part2.length() && s.charAt(posS) == part2.charAt(posP2) ? true : false;

            if (matchP1 && matchP2)
            {
                q.add(s.charAt(posS));
                didUseQ = true;
                posS++;
                posP1++;
                posP2++;
            }

            else if (matchP1)
            {
                posS++;
                posP1++;
            }

            else if (matchP2)
            {
                posS++;
                posP2++;
            }

            else
            {
                if (q.size() != 0 && q.peek() == s.charAt(posS))
                {
                    q.remove();
                    posS++;
                }
                else
                {
                    return false;
                }
            }
        }

        while (q.size() != 0 && q.peek() == s.charAt(posS))
        {
            q.remove();
            posS++;
        }

        if (posS == s.length() - 1 || (posS == s.length() && didUseQ))
            return true;
        else
            return false;
    }

    /*
    The weight of a number will be from now on the sum of its digits. For example 99 will have "weight" 18.
    Given a String with weights in normal order can you give this string ordered by "weights" of these numbers?  
    For Example:
    a = "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes: "100 180 90 56 65 74 68 86 99"
    When two numbers have the same "weight", let us class them as if they were strings and not numbers so 
    180 is before 90 since, having the same "weight" (9) it comes before as a String.
    All numbers in the list are positive numbers and the list can be empty.

    System.out.println("orderWeight");    
    System.out.println(orderWeight("2000 103 123 4444 99").equals("103 123 4444 99 2000");
	System.out.println(orderWeight("11 11 2000 10003 22 123 1234000 44444444 9999").equals("2000 10003 1234000 44444444 9999 11 11 22 123");
    */

    public static String orderWeight(String str)
    {
        List<Weighted> tlist = new ArrayList<Weighted>();
        String[] input = str.split(" ");

        for (String s : input)
            tlist.add(new Codewars3().new Weighted(s));

        Collections.sort(tlist);
        StringBuilder sb = new StringBuilder();
        
        for (Weighted w : tlist)
        	sb.append(w.getString() + " ");

        return sb.toString().trim();
    }
    
    class Weighted implements Comparable<Weighted>
    {
        private Integer w;
        private String s;

    	public Weighted(String s){
    		this.s = s;
    		this.w = calcWeight(s);
    	}

        private int calcWeight(String s)
        {
            String str = s.toLowerCase().trim();
            int sum = 0;
            for (int i = 0; i < str.length(); i++)
            {
                sum += (int)Character.getNumericValue(str.charAt(i));
            }
            return sum;
        }
    	
    	public Integer getWeight() { return w; }
    	public String  getString() { return s; }
    	
    	public int compareTo(Weighted compareWeighted) {
    		int cw = compareWeighted.getWeight();
    		
    		if (this.w > cw)
    			return 1;
    		else if (this.w < cw)
    			return -1;
    		else
    			return s.compareTo(compareWeighted.getString());
    	}	
    }
    

    /*
    Write a function, which takes a non-negative integer (seconds) as input 
    and returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59
    The maximum time never exceeds 359999 (99:59:59)

        System.out.println("GetReadableTime");
        System.out.println(GetReadableTime(0));//.equals("00:00:00");
        System.out.println(GetReadableTime(60));//.equals("00:01:00");
        System.out.println(GetReadableTime(86399));//.equals("23:59:59");
        System.out.println(GetReadableTime(359999));//.equals("4.03:59:59");
    */
    public static String GetReadableTime(int seconds)
    {
    	return "";
    	//Duration span = Duration.ofSeconds(seconds);

        // Note to get this format: 99:59:59 use (int)span.TotalHours
        //return (int)span.toHours() + ":" + (int)span.toMinutes() + ":" + (int)span.toSeconds();

        // Note to get this format: "4.03:59:59" use the default span.toString()
        //return span.toString();
    }


    /*
     Score a throw according to these rules. You will always be given an array with five six-sided dice values.

     Three 1's => 1000 points
     Three 6's =>  600 points
     Three 5's =>  500 points
     Three 4's =>  400 points
     Three 3's =>  300 points
     Three 2's =>  200 points
     One   1   =>  100 points
     One   5   =>   50 point
    
     A single die can only be counted once : each roll. For example, a "5" can only count as part of a triplet 
     (contributing to the 500 points) or as a single 50 points, but not both : the same roll.

     Example scoring
     Throw       Score
     5 1 3 4 1   50 + 2 * 100 = 250
     1 1 1 3 1   1000 + 100 = 1100
     2 4 4 5 4   400 + 50 = 450
     */

    public static int Score(int[] dice)
    {
        int[] vals = new int[6];

        for (int d : dice)
        {
            if (d == 1) vals[0]++;
            else if (d == 2) vals[1]++;
            else if (d == 3) vals[2]++;
            else if (d == 4) vals[3]++;
            else if (d == 5) vals[4]++;
            else if (d == 6) vals[5]++;
        }

        int score = 0;

        for (int i = 0; i < vals.length; i++)
        {
            if (vals[i] >= 3)
            {
                if (i == 0)
                    score += 1000;
                else
                    score += 100 * (i + 1);
                vals[i] -= 3;
            }
        }

        score += 100 * vals[0];
        score += 50 * vals[4];

        return score;
    }//score


    /*
    Compute sum of digits
    Ex: digital_root(16) => 7
    */
    public static int DigitalRoot(long n)
    {
        long num = Math.abs(n);
        int sum = 0;

        while (num > 0)
        {
            sum += (int)(num % 10);
            num /= 10;
        }

        return sum;
    }

    /*
    Compute sum of digits
    Ex: digital_root("16") => 7
    */
    public static int DigitalRootString(String num)
    {
        int sum = 0;
        String str = num.toLowerCase().trim();
        
        for (int i = 0; i < str.length(); i++)
        {
        	sum += (int)Character.getNumericValue(str.charAt(i));
        }
        
        return sum;
    }

    /*
    You have to create a function that takes a positive integer number 
    and returns the next bigger number formed by the same digits:
    NextBiggerNumber(12)==21
    NextBiggerNumber(513)==531
    NextBiggerNumber(2017)==2071
    Assert.AreEqual(441, Kata.NextBiggerNumber(414));
    Assert.AreEqual(414, Kata.NextBiggerNumber(144));

    If no bigger number can be composed using those digits, return -1:
    NextBiggerNumber(9)==-1
    NextBiggerNumber(111)==-1
    NextBiggerNumber(531)==-1
    */
    public static long NextBiggerNumber(long n)
    {
    	String nString = String.valueOf(n);

        // if there is only one digit there is nothing to rearrange
        if (nString.length() <= 1)
            return -1;

        char[] letters = nString.toCharArray();
        int[] digits = new int[letters.length];

        for (int i = 0; i < digits.length; i++)
        {
            digits[i] = (int)Character.getNumericValue(letters[i]);
        }

        int[] newDigits = new int[digits.length];
        System.arraycopy(digits, 0, newDigits, 0, newDigits.length);

        // find the first digit to swap
        int pos = newDigits.length - 1;
        boolean allSame = true;
        for (int i = newDigits.length - 1; i > 0; i--)
        {
            pos = i - 1;

            if (newDigits[i - 1] != newDigits[i])
                allSame = false;

            if (newDigits[i - 1] < newDigits[i])
                break;
        }

        // if digits are all the same there is nothing to rearrange
        if (allSame)
            return -1;

        // find the last digit to swap
        int endpos = newDigits.length - 1;
        for (int i = pos + 1; i < newDigits.length; i++)
        {
            endpos = i + 1;

            if (i < newDigits.length - 1 && newDigits[i] > newDigits[i + 1])
                break;
        }

        if (endpos >= newDigits.length)
            endpos = newDigits.length - 1;

        //System.out.println("pos " + pos + " endpos " + endpos);
        List<Long> candidates = new ArrayList<Long>();

        for (int i = newDigits.length - 1; i >= pos; i--)
        {
            // rotate digits between pos and endpos
            int temp = newDigits[pos];
            for (int j = pos; j < endpos; j++)
            {
                newDigits[j] = newDigits[j + 1];
            }
            newDigits[endpos] = temp;

            // create new number from the rotated digits
            long newNum = 0;
            for (int rank = 0; rank < newDigits.length; rank++)
                newNum += (long)Math.pow(10, rank) * newDigits[newDigits.length - 1 - rank];

            // if new number is big enough add it to the candidates list
            if (newNum > n)
                candidates.add(newNum);
            //System.out.println("newNum " + newNum);
            //Array.Copy(digits, newDigits, newDigits.length());

        }

        if (candidates.size() > 0)
            return candidates.min();
        else
            return -1;
    }

    /*
    Given a number K (K<=45000), help her get the maximum of pieces possible 
    (not necessarily of equal size) with K cuts. If K is a negative number, 
    the result must be -1 (or Nothing : Haskell).
    Examples  maxPizza(0) == 1  maxPizza(1) == 2 maxPizza(2) == 4 maxPizza(3) == 7
    */
    public static int maxPizza(int cut)
    {
        if (cut < 0)
            return -1;
        else if (cut == 0)
            return 1;
        else if (cut == 1)
            return 2;
        else
            return cut + maxPizza(cut - 1);
    }


    /*
    The nth triangle number is equal to the sum of the n natural numbers from 1 to n.
    Check if a given input is a valid triangle number. Return true if it is, false if it is not. 
    Note that any non-integers, including non-number types, are not triangle numbers.
    You may assume that the given input, if it is a number, is always positive.
    Triangle numbers: 0, 1, 3, 6, 10, 15, 21, ... 120 ...  300, 325, ...
    n = n*(n+1)/2
    */
    public static boolean isTriangleNumber(long number)
    {
        long previous = 0;
        long current = 0;
        long increment = 1;

        while (current < number)
        {
            current = previous + increment;
            previous = current;
            increment++;
        }

        if (current == number)
            return true;
        else
            return false;
    }


    /*
    Write a function called validBraces that takes a String of braces, and determines if the order of the 
    braces is valid. validBraces should return true if the String is valid, and false if it's invalid.
    Examples: 
    validBraces( "(){}[]" ) => returns true 
    validBraces( "(}" ) => returns false 
    validBraces( "[(])" ) => returns false 
    validBraces( "([{}])" ) => returns true 
    */
    public static boolean validBraces(String input)
    {
        Stack<Character> stack = new Stack<Character>();

        for (char c : input)
        {
            if (c == '(' || c == '[' || c == '{')
            {
                 stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}')
            {
                if (stack.size() == 0)
                    return false;

                char closing = stack.pop();

                if (c == ')' && closing != '(')
                        return false;
                else if (c == ']' && closing != '[')
                        return false;
                else if (c == '}' && closing != '{')
                        return false;
            }
        }

        if (stack.size() == 0)
            return true;
        else
            return false;
    }

    /*
    Write a function that takes : a binary String and returns the equivalent decoded text (the text is ASCII encoded).
    Each 8 bits on the binary String represent 1 character on the ASCII table.
    The input String will always be a valid binary String.
    In the case of an empty binary String your function should return an empty String.
    System.out.println(BinarytoString("").equals("");
    System.out.println(BinarytoString("0100100001100101011011000110110001101111").equals("Hello");
    */

    public static String BinarytoString(String binary)
    {
        var text = new StringBuilder();
        byte[] bytes = new byte[binary.length() / 8];

        for (int i = 0; i < binary.length(); i += 8)
        {
            bytes[i / 8] = Convert.ToByte(binary.substring(i, 8), 2);
        }

        return Encoding.ASCII.GetString(bytes);
    }

    /*
    Given the String representations of two integers, return the String representation of their sum.
    For example:
    System.out.println("sumStrings"");
    System.out.println(sumStrings("1","2").equals("3");
    System.out.println(sumStrings("123","456").equals("579");
    System.out.println(sumStrings("821429", "999999"));//.equals("1821428");
    The input will contain no characters besides the ten numerals "0" to "9".
    NOTE The tests will try to overflow your INTS!
    test7.equals("712577413488402631964821329"
    test8.equals("131151201344081895336534324866"
    */
    public static String sumStrings(String a, String b)
    {
        List<String> aParts = new ArrayList<String>();
        List<String> bParts = new ArrayList<String>();
        final int chunk = 6;

        if (a.length() <= chunk)
            aParts.add(a);
        else
        {
            for (int i = a.length() - chunk; i >= 0; i -= chunk)
            {
                aParts.add(a.substring(i, chunk));
                if (i != 0 && i < chunk)
                    aParts.add(a.substring(0,i));
            }
        }

        if (b.length() <= chunk)
            bParts.add(b);
        else
        {
            for (int i = b.length() - chunk; i >= 0; i -= chunk)
            {
                bParts.add(b.substring(i, chunk));
                if (i != 0 && i < chunk)
                    bParts.add(b.substring(0, i));
            }
        }

        List<Long> results = new List<Long>();
        long overage = 0;
        long sum = 0;
        for(int i = 0; i < Math.max(aParts.Count, bParts.Count); i++)
        {
            if (i < aParts.Count && i < bParts.Count)
                sum = overage + Convert.ToInt64(aParts[i]) + Convert.ToInt64(bParts[i]);
            else if (i < aParts.Count)
                sum = overage + Convert.ToInt64(aParts[i]);
            else
                sum = overage + Convert.ToInt64(bParts[i]);

            overage = 0;
            String sumString = sum.toString();
            if (sumString.length() > chunk)
            {
                int len = sumString.length() - chunk;
                String front = sumString.substring(0, len);
                String back = sumString.substring(len);
                overage = Convert.ToInt64(front);
                sum = Convert.ToInt64(back);
            }
            results.add(sum);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = results.size() - 1; i >= 0; i--)
        {
            sb.Append(results[i]);
        }

        if (overage > 0)
            sb.insert(0, overage);

        return sb.toString();
    }


    /*
    You have to create a method "compoundArray" which should take as input two int arrays of 
    different length and return one int array with numbers of both arrays shuffled one by one. 
    Example: Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
    */
    public static int[] compoundArray(int[] a, int[] b)
    {
        int aLen = a.length;
        int bLen = b.length;
        int min = Math.min(aLen, bLen);
        int[] result = new int[aLen + bLen];

        for (int i = 0; i < min; i++)
        {
            int rpos = 2 * i;
            result[rpos] = a[i];
            result[rpos + 1] = b[i];
        }

        if (aLen < bLen)
            System.arraycopy(b, aLen, result, aLen * 2, bLen - aLen);
        else if (bLen < aLen)
        	System.arraycopy(a, bLen, result, bLen * 2, aLen - bLen);

        return result;
    }


    /*
    You have to create a method "compoundArray" which should take as input two int arrays of 
    different length and return one int array with numbers of both arrays shuffled one by one. 
    Example: Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}
    Use Lambda. Do not use loops.
    */
    public static int[] compoundArrayLambda(int[] a, int[] b)
    {
    	/*
        List<int> result =  a.Zip(b, (x, y) => new[] { x, y })
                         .SelectMany(element => element).ToList();

        int[] longer = a.length() >= b.length() ? a : b;
        int[] shorter = a.length() >= b.length() ? b : a;
        int lenC = longer.length() - shorter.length();
        int[] c = new int[lenC];

        Array.Copy(longer, shorter.length(), c, 0, lenC);
        result.AddRange(c);
		
        return result.ToArray();
        */
    	int[] result = new int[0];
    	return result;
    }

    /*
    Vowel2Index(String s)
    Takes : a String and replaces all the vowels [a,e,i,o,u] 
    with their respective positions within that String. 
    Kata.vowel2Index("this is my String").equals("th3s 6s my str15ng"
    Kata.vowel2Index("Codewars is the best site : the world")
    */
    public static String vowel2Index(String str)
    {
        StringBuilder sb = new StringBuilder();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        for (int i = 0; i < str.length(); i++)
        {
            if (vowels.Contains(str.charAt(i)))
                sb.append(i + 1);
            else
                sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    /*
    Vowel2IndexLambda(String s)
    Takes : a String and replaces all the vowels [a,e,i,o,u] 
    with their respective positions within that String. 
    vowel2IndexLambda("this is my String") equals "th3s 6s my str15ng"
    vowel2IndexLambda("Codewars is the best site : the world")
    Use Lambda. Do not use loops.
    */
    public static String vowel2IndexLambda(String str)
    {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

        return String.Concat(str.SelectMany((c, i) => vowels.Contains(c) ? (i + 1).toString() : c.toString()));
    }

    /*
    Each part of the String is of the form: h|m|s where h, m, s are positive 
    or null integer (represented as Strings) with one or two digits. 
    You are asked for giving three statistics; range, average and median 
    where hh, mm, ss are integers (represented by Strings) with each 2 digits.
    Example Input: "01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"
    Example Output: "Range: 00|47|18 Average: 01|35|15 Median: 01|32|34"
    */
    public static String stat(String strg)
    {
        // In:  "01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17"
        // Out: "Range: 01|01|18 Average: 01|38|05 Median: 01|32|34"
        List<TimeSpan> times = new List<TimeSpan>();
        String[] timeStrings = strg.split(',');

        for (String tStr : timeStrings)
        {
            TimeSpan span = TimeSpan.Parse(tStr.trim().Replace("|", ":"));
            times.Add(span);
        }

        times.Sort();

        TimeSpan min = times.Min();
        TimeSpan max = times.Max();
        TimeSpan range = max - min;
        TimeSpan sum = default(TimeSpan);

        for (TimeSpan ts : times)
        {
            sum += ts;
        }

        
        TimeSpan average = TimeSpan.FromSeconds(Math.Round(sum.TotalSeconds / times.Count()));
        TimeSpan median = times[0];

        if (times.Count() % 2 == 1)
            median = times[times.Count() / 2];
        else
        {
            TimeSpan doubleMedian = times[times.Count() / 2 - 1] + times[times.Count() / 2];
            median = TimeSpan.FromSeconds(Math.Round(doubleMedian.TotalSeconds / 2));
        }

        String rangeStr = range.toString().Replace(":", "|");
        String averageStr = average.toString().Replace(":", "|");
        String medianStr = median.toString().Replace(":", "|");
        String result = "Range: " + rangeStr + " Average: " + averageStr + " Median: " + medianStr;

        return result;
    }


    /*
    You are going to be given a String. Let's say you start with this: 012345
    The first thing you do is reverse it:543210
    Then you will take the String from the 1st position and reverse it again:501234
    Then you will take the String from the 2nd position and reverse it again:504321
    Then you will take the String from the 3rd position and reverse it again:504123
    Continue this pattern until you have done every single position, and then you will 
    return the String you have created. For this particular number, you would return: 504132
    */
    public static String flipNumber(String n)
    {
        String str = n;

        for (int i = 0; i < n.length() - 1; i++)
        {
            str = flipString(str, i);
        }

        return str;
    }

    private static String flipString(String n, int index)
    {
        String front = n.substring(0, index);
        String back = n.substring(index);
        char[] arrBack = back.toCharArray();
        Array.Reverse(arrBack);
        String revBack = new String(arrBack);
        return front + revBack;
    }

    /*
    You are given two arrays a1 and a2 of Strings.Each String is composed with letters from a to z.
    Let x be any String : the first array and y be any String : the second array.
    Find max(abs(length(x) − length(y))).  If a1 or a2 are empty return -1.
    s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
    s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
    maxDifflength(s1, s2) --> 13
    */
    public static int maxDifflength(String[] a1, String[] a2)
    {
        if (a1 == null || a1.length == 0 || a2 == null || a2.length == 0)
            return -1;
        /*
        int max1 = a1.Max(w => w.length());
        int max2 = a2.Max(w => w.length());
        int min1 = a1.Min(w => w.length());
        int min2 = a2.Min(w => w.length());
        */
        return Math.max(max1 - min2, max2 - min1);
    }

    /*
    You are given two arrays a1 and a2 of Strings.Each String is composed with letters from a to z.
    Let x be any String : the first array and y be any String : the second array.
    Find max(abs(length(x) − length(y))).  If a1 or a2 are empty return -1.
    s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
    s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
    maxDifflength(s1, s2) --> 13
    */
    public static int maxDifflengthLambda(String[] a1, String[] a2)
    {
        if (a1 == null || a1.length == 0 || a2 == null || a2.length == 0)
            return -1;

        /*
        int max1 = a1.Max(w => w.length());
        int max2 = a2.Max(w => w.length());
        int min1 = a1.Min(w => w.length());
        int min2 = a2.Min(w => w.length());
		*/
        return Math.max(max1 - min2, max2 - min1);
    }
    /*
    Given two arrays of Strings a1 and a2 return a sorted array r in lexicographical order 
    and without duplicates of the Strings of a1 which are subStrings of Strings of a2.
    Example 1:
        a1 = ["arp", "live", "strong"]
        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        returns ["arp", "live", "strong"]
    Example 2:
        a1 = ["tarp", "mice", "bull"]
        a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
        returns []
    */
    public static String[] inArray(String[] array1, String[] array2)
    {
        String joined2 = String.Join(",", array2);
        String[] result = array1.Distinct().Where(element => joined2.Contains(element)).ToArray();
        Array.Sort(result);
        return result;
        /* better solution?
           return array1.Distinct()
                        .Where(s1 => array2.Any(s2 => s2.Contains(s1)))
                        .OrderBy(s => s)
                        .ToArray();
        */
    }


    /*
    Return the sum of following series upto nth term(parameter).
    Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
    Rules:
    You need to round the answer upto 2 decimal places and return it as String.
    If the given value is 0 then it should return 0.00
    You will only be given Natural Numbers as arguments.
    Examples:
    SeriesSum(1) => 1 = "1.00"
    SeriesSum(2) => 1 + 1/4 = "1.25"
    SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
    */
    public static String seriesSum(int n)
    {
        double numerator = 1.0;
        int denominator = 1;
        double sum = 0;

        for (int i = 0; i < n; i++)
        {
            sum += (numerator / denominator);
            denominator += 3;
        }

        return Math.round(sum, 2).toString("0.00");
    }

}
