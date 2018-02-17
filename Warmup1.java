package codingbat;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Warmup1 {

	public static void main(String[] args) {
		
        System.out.println("sleepIn");
        System.out.println(sleepIn(false, false) == true);
        System.out.println(sleepIn(true, false) == false);
        System.out.println(sleepIn(false, true) == true);

        System.out.println("monkeyTrouble");
        System.out.println(monkeyTrouble(true, true) == true);
        System.out.println(monkeyTrouble(false, false) == true);
        System.out.println(monkeyTrouble(true, false) == false);

        System.out.println("sumDouble");
        System.out.println(sumDouble(1, 2) == 3);
        System.out.println(sumDouble(3, 2) == 5);
        System.out.println(sumDouble(2, 2) == 8);

        System.out.println("close10");
        System.out.println(close10(8, 13) == 8);
        System.out.println(close10(13, 8) == 8);
        System.out.println(close10(13, 7) == 0);

        System.out.println("StringC");
        System.out.println(StringC("Hello", 'e', 1, 3) == true);
        System.out.println(StringC("Everyone", 'e', 1, 3) == true);
        System.out.println(StringC("Heelele", 'e', 1, 3) == false);

        System.out.println("StringCLambda");
        System.out.println(StringCLambda("Hello", 'e', 1, 3) == true);
        System.out.println(StringCLambda("Everyone", 'e', 1, 3) == true);
        System.out.println(StringCLambda("Heelele", 'e', 1, 3) == false);

        System.out.println("lastDigit");
        System.out.println(lastDigit(7, 17) == true);
        System.out.println(lastDigit(6, 17) == false);
        System.out.println(lastDigit(3, 113) == true);

        System.out.println("endUp");
        System.out.println(endUp("Hello", 3).equals("HeLLO"));
        System.out.println(endUp("hi there", 3).equals("hi thERE"));
        System.out.println(endUp("hi", 3).equals("HI"));

        System.out.println("everyNth");
        System.out.println(everyNth("Miracle", 2).equals("Mrce"));
        System.out.println(everyNth("abcdefg", 2).equals("aceg"));
        System.out.println(everyNth("abcdefg", 3).equals("adg"));

	}

    /*
    The parameter weekday is true if it is a weekday, and the parameter vacation 
    is true if we are on vacation. We sleep : if it is not a weekday or we're on 
    vacation. Return true if we sleep in. 

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
    */
    public static boolean sleepIn(boolean w, boolean v)
    {
        return !w || v;
    }

    /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate 
    if each is smiling. We are : trouble if they are both smiling or if neither 
    of them is smiling. Return true if we are : trouble. 

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
    */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return aSmile == bSmile;
    }

    /*
    Given two int values, return their sum. Unless the two values are the same, 
    then return double their sum. 

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
    */
    public static int sumDouble(int a, int b)
    {
        if (a == b)
            return 2 * (a + b);
        else
            return a + b;
    }

    /*
    Given 2 int values, return whichever value is nearest to the value 10, or 
    return 0 in the event of a tie. 

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
    */
    public static int close10(int a, int b)
    {
        int a10 = Math.abs(a - 10);
        int b10 = Math.abs(b - 10);

        if (a10 < b10)
            return a;
        else if (b10 < a10)
            return b;
        else
            return 0;
    }

    /*
    Return true if the given String contains between min and max 'c' chars. 

    StringC("Hello", 'e', 1, 3) → true
    StringC("Everyone", 'e', 1, 3) → true
    StringC("Heelele", 'e', 1, 3) → false
    */
    public static boolean StringC(String str, char c, int min, int max)
    {
        int count = 0;

        if (str != null && !str.isEmpty())
        {
        	StringCharacterIterator it = new StringCharacterIterator(str);
    		for(char ch = it.first(); ch != CharacterIterator.DONE; ch = it.next())
    		{
    			if(Character.toLowerCase(ch) == c)
    				count++;
    		}
        }

        return count >= min && count <= max;
    }

    /*
    Return true if the given String contains between min and max 'c' chars. 
    Use Lambda. Do not use loops.
    StringCLambda("Hello", 'e', 1, 3) → true
    StringCLambda("Everyone", 'e', 1, 3) → true
    StringCLambda("Heelele", 'e', 1, 3) → false
    */
    public static boolean StringCLambda(String str, char c, int min, int max)
    {
    	/*
        int count = str.toLowerCase().Count(letter => letter == c);
        return count >= min && count <= max;
        */
    	return false;
    }

    /*
    Given two non-negative int values, return true if they have the same last digit, 
    such as with 27 and 57. Note that the % "mod" operator computes remainders, 
    so 17 % 10 is 7. 

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
    */
    public static boolean lastDigit(int a, int b)
    {
        return a % 10 == b % 10;
    }

    /*
    Given a String, return a new String where the last 'num' chars are 
    now upper case. If the String has less than 'num' chars, 
    uppercase whatever is there. 

    endUp("Hello", 3) → "HeLLO"
    endUp("hi there", 3) → "hi thERE"
    endUp("hi", 3) → "HI"
    */
    public static String endUp(String str, int num)
    {
        if (num <= 0)
            return str;
        else if (str.length() > num)
        {
            String front = str.substring(0, str.length() - num);
            String back = str.substring(str.length() - num);
            return front + back.toUpperCase();
        }
        else
            return str.toUpperCase();
    }

    /*
    Given a non-empty String and an int N, return the String made starting 
    with char 0, and then every Nth char of the String. 
    So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
    */
    public static String everyNth(String str, int n)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i += n)
        {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }	
}
