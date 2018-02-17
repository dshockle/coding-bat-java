package codingbat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logic1 {

	public static void main(String[] args) {
  
        System.out.println("lastDigit");
        System.out.println(lastDigit(23, 19, 13) ==  true);
        System.out.println(lastDigit(23, 19, 12) == false);
        System.out.println(lastDigit(23, 19, 3) == true);    

        System.out.println("lessBy10");
        System.out.println(lessBy10(1, 7, 11) == true);
        System.out.println(lessBy10(1, 7, 10) == false);
        System.out.println(lessBy10(11, 1, 7) == true);     

        System.out.println("withoutDoubles");
        System.out.println(withoutDoubles(6, 6, true) == 7);
        System.out.println(withoutDoubles(2, 3, true) == 5);
        System.out.println(withoutDoubles(3, 3, true) == 7);
        System.out.println(withoutDoubles(3, 3, false) == 6);       

        System.out.println("maxMod5");
        System.out.println(maxMod5(25, 15) == 15);
        System.out.println(maxMod5(6, 2) == 6);
        System.out.println(maxMod5(3, 3) == 0);      

        System.out.println("redTicket");
        System.out.println(redTicket(2, 2, 2) == 10);
        System.out.println(redTicket(2, 2, 1) == 0);
        System.out.println(redTicket(0, 0, 0) == 5);      

        System.out.println("greenTicket");
        System.out.println(greenTicket(1, 2, 3) == 0);
        System.out.println(greenTicket(2, 2, 2) == 20);
        System.out.println(greenTicket(1, 1, 2) == 10);      
        
        System.out.println("blueTicket");
        System.out.println(blueTicket(14, 1, 4) == 5);
        System.out.println(blueTicket(9, 1, 0) == 10);
        System.out.println(blueTicket(9, 2, 0) == 0);
       
        System.out.println("shareDigit");
        System.out.println(shareDigit(12, 34, 56, 78, 90, 0) == true);
        System.out.println(shareDigit(12, 23) == true);
        System.out.println(shareDigit(12, 34) == false);
        System.out.println(shareDigit(12, 44) == false);      
        
        System.out.println("sumLimit");
        System.out.println(sumLimit(-12, 3) == -9);
        System.out.println(sumLimit(2, 3) == 5);
        System.out.println(sumLimit(8, 3) == 8);

	}

    /*
    Given three ints, a b c, return true if two or more of them have the same 
    rightmost digit. The ints are non-negative.

    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true        
    */
    public static boolean lastDigit(int... values)
    {
        List<Integer> digits = new ArrayList<>();
        
        for (int val : values)
            if (digits.contains(val % 10))
                return true;
            else
                digits.add(val % 10);
        
        return false;
    }

    /*
    Given three ints, a b c, return true if one of them is 10 or more less than 
    one of the others. 

    lessBy10(1, 7, 11) → true
    lessBy10(1, 7, 10) → false
    lessBy10(11, 1, 7) → true        
    */
    public static boolean lessBy10(int... values)
    {
        List<Integer> list = new ArrayList<>();
        
        for (int val : values)
            if (list.contains(val + 10) || list.contains(val - 10))
                return true;
            else
            	list.add(val);
        
        return false;
    }


    /*
        Return the sum of two 6-sided dice rolls, each in the range 1..6. 
        However, if noDoubles is true, if the two dice show the same value, 
        increment one die to the next value, wrapping around to 1 if its value was 6. 

        withoutDoubles(2, 3, true) → 5
        withoutDoubles(3, 3, true) → 7
        withoutDoubles(3, 3, false) → 6        
    */
    public static int withoutDoubles(int die1, int die2, boolean noDoubles)
    {
        if (noDoubles && (die1 == die2))
            if (die1 == 6)
                die1 = 1;
            else 
                die1++;

        return die1 + die2;
    }

    /*
    Given two int values, return whichever value is larger. 
    However if the two values have the same remainder when divided by 5, 
    then the return the smaller value. However, in all cases, if the two 
    values are the same, return 0.

    maxMod5(25, 15) → 15
    maxMod5(6, 2) → 6
    maxMod5(3, 3) → 0        
    */
    public static int maxMod5(int a, int b)
    {
    	if (a == b)
    		return 0;
    	else if (a % 5 == b % 5)
    		return Math.min(a, b);
    	else
    		return Math.max(a, b);
    }

    /*
    You have a red lottery ticket showing ints a, b, and c, each of which 
    is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise 
    if they are all the same, the result is 5. Otherwise so long as both 
    b and c are different from a, the result is 1. Otherwise the result is 0. 

    redTicket(2, 2, 2) → 10
    redTicket(2, 2, 1) → 0
    redTicket(0, 0, 0) → 5        
    */
    public static int redTicket(int... values)
    {
    	Set<Integer> vals = new HashSet<Integer>();
    	
    	for(int v : values)
    		vals.add(v);
    	
        if (vals.size() == 1)
        	return vals.contains(2) ? 10 : 5;
        else
            return vals.size() == values.length ? 1 : 0;
    }

    /*
    You have a green lottery ticket, with ints a, b, and c on it. 
    If the numbers are all different from each other, the result is 0. 
    If all of the numbers are the same, the result is 20. 
    If two of the numbers are the same, the result is 10. 

    greenTicket(1, 2, 3) → 0
    greenTicket(2, 2, 2) → 20
    greenTicket(1, 1, 2) → 10        
    */
    public static int greenTicket(int... values)
    {
        boolean allSame = true;
        boolean allDifferent = true;

        for (int i = 0; i < values.length; i++)
        {
            for (int j = i + 1; j < values.length; j++)
            {
                if (values[i] != values[j])
                    allSame = false;
                if (values[i] == values[j])
                    allDifferent = false;
            }
        }

        if (allSame)
            return 20;
        else if (allDifferent)
            return 0;
        else
            return 10;
    }

    /*
    You have a blue lottery ticket, with ints a, b, and c on it. 
    This makes three pairs, which we'll call ab, bc, and ac. 
    Consider the sum of the numbers in each pair. 
    If any pair sums to exactly 10, the result is 10. 
    Otherwise if the ab sum is exactly 10 more than either bc or ac sums, 
    the result is 5. Otherwise the result is 0. 

    blueTicket(9, 1, 0) → 10
    blueTicket(9, 2, 0) → 0
    blueTicket(14, 1, 4) → 5        
    */
    public static int blueTicket(int... values)
    {
        HashSet<Integer> pairs = new HashSet<Integer>();

        for(int i = 0; i < values.length; i++)
        {
            for(int j = 0; j < values.length; j++)
            {
                if (i != j)
                {
                    int pair = values[i] + values[j];
                    if (pair == 10)
                        return 10;
                    else if (pairs.contains(pair - 10))
                        return 5;
                    else if (pairs.contains(pair + 10))
                        return 5;
                    else
                        pairs.add(pair);
                }
            }
        }
        return 0;
    }

    /*
    Given two ints, each in the range 10..99, return true if there is 
    a digit that appears in both numbers, such as the 2 in 12 and 23.

    shareDigit(12, 23) → true
    shareDigit(12, 34) → false
    shareDigit(12, 44) → false        
    */
    public static boolean shareDigit(int... values)
    {
    	Set<Integer> digits = new HashSet<Integer>();
    	
    	for(int n : values){
	    	Set<Integer> myDigits = new HashSet<Integer>();

			do {
				int d = n % 10;

				if (!myDigits.contains(d)){
		    		if (digits.contains(d))
		    			return true;
		    		else
		    			myDigits.add(d);
				}

	    		n /= 10;
	    		
			} while (n != 0);
			
			digits.addAll(myDigits);
    	}

    	return false;
    }

    /*
        Calculate the sum and the maximum of the passed-in values. 
        If the sum and maximum have the same number of digits then 
        return the sum, otherwise return the maximum.

        sumLimit(2, 3) → 5
        sumLimit(8, 3) → 8
        sumLimit(-12, 3) → -9       
    */
    public static int sumLimit(int... values)
    {
    	int sum = 0;
    	int max = values[0];
    	
    	for(int v : values){
    		sum += v;
    		if (v > max)
    			max = v;
    	}
    	
    	int sumDigits = String.valueOf(Math.abs(sum)).length();
    	int maxDigits = String.valueOf(Math.abs(max)).length();
    	
    	if (sumDigits == maxDigits)
    		return sum;
    	else
    		return max;
    }	
}
