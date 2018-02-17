package codingbat;

public class String1 {

	public static void main(String[] args) {
		
        System.out.println("seeColor");
        System.out.println(seeColor("redxx").equals("red"));
        System.out.println(seeColor("xxred").equals(""));
        System.out.println(seeColor("blueTimes").equals("blue"));

        System.out.println("seeColorLambda");
        System.out.println(seeColorLambda("redxx").equals("red"));
        System.out.println(seeColorLambda("xxred").equals(""));
        System.out.println(seeColorLambda("blueTimes").equals("blue"));

        System.out.println("frontAgain");
        System.out.println(frontAgain("edited") == true);
        System.out.println(frontAgain("edit") == false);
        System.out.println(frontAgain("ed") == true);

        System.out.println("minCat");
        System.out.println(minCat("Hello", "Hi").equals("loHi"));
        System.out.println(minCat("Hello", "java").equals("ellojava"));
        System.out.println(minCat("java", "Hello").equals("javaello"));

        System.out.println("extraFront");
        System.out.println(extraFront("Hello", 3).equals("HelHelHel"));
        System.out.println(extraFront("ab", 2).equals("abab"));
        System.out.println(extraFront("H", 3).equals("HHH"));

        System.out.println("without2");
        System.out.println(without2("HelloHe").equals("lloHe"));
        System.out.println(without2("HelloHi").equals("HelloHi"));
        System.out.println(without2("").equals(""));
        System.out.println(without2(null).equals(""));
        System.out.println(without2("H").equals("H"));
        System.out.println(without2("Hi").equals(""));

        System.out.println("deFront");
        System.out.println(deFront("Hello").equals("llo"));
        System.out.println(deFront("java").equals("va"));
        System.out.println(deFront("away").equals("aay"));

        System.out.println("startWord");
        System.out.println(startWord("hippo", "hi").equals("hi"));
        System.out.println(startWord("hippo", "xip").equals("hip"));
        System.out.println(startWord("hippo", "z").equals("h"));

        System.out.println("withoutX");
        System.out.println(withoutX("xHix").equals("Hi"));
        System.out.println(withoutX("xHi").equals("Hi"));
        System.out.println(withoutX("Hxix").equals("Hxi"));

        System.out.println("withoutX2");
        System.out.println(withoutX2("xHi").equals("Hi"));
        System.out.println(withoutX2("Hxi").equals("Hi"));
        System.out.println(withoutX2("Hi").equals("Hi"));

	}

    /*
    Given a String, if the String begins with "red" or "blue" return that color String, 
    otherwise return the empty String. 

    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
    */
	
    public static String seeColor(String str)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}
    	
    	String[] colors = { "red", "green", "blue", "yellow" };
        String input = str.trim().toLowerCase();
        
        for (String color : colors)
        {
            if (input.startsWith(color))
                return color;
        }
        
        return "";
    }
    

    /*
    Given a String, if the String begins with "red" or "blue" return that color String, 
    otherwise return the empty String. Use Lambda. Do not use loops.

    seeColorLambda("redxx") → "red"
    seeColorLambda("xxred") → ""
    seeColorLambda("blueTimes") → "blue"
    */
    public static String seeColorLambda(String str)
    {
    	/*
        var values = Enum.GetNames(typeof(Colors));
        return values.Where(value => str.trim().toLowerCase().StartsWith(value))
                     .DefaultIfEmpty(String.Empty).First();
    	 */
    	return "";
    }

    /*
    Given a String, return true if the first 2 chars in the String also appear at 
    the end of the String, such as with "edited". 

    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
    */
    public static Boolean frontAgain(String str)
    {
    	if (str == null || str.isEmpty() || str.length() < 2){
    		return false;
    	}
    	
    	return str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }

    /*
        Given two Strings, append them together and return the result. 
        However, if the Strings are different lengths, omit chars 
        from the longer String so it is the same length as the 
        shorter String. So "Hello" and "Hi" yield "loHi". 
        The Strings may be any length including empty. 

        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"        
    */
    public static String minCat(String a, String b)
    {
    	if (a == null || a.isEmpty()){
    		return "";
    	}

        if (a.length() > b.length())
            return a.substring(a.length() - b.length()) + b;
        else if (a.length() < b.length())
            return a + b.substring(b.length() - a.length());
        else
            return a + b;
    }

    /*
    Given a String, return a new String made of n copies of the first n chars. 
    If there are fewer than n chars, use whatever is there. 

    extraFront("Hello", 3) → "HelHelHel"
    extraFront("ab", 2) → "abab"
    extraFront("H", 3) → "HHH"        
    */
    public static String extraFront(String str, int n)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}

        String item = str.substring(0, Math.min(n, str.length()));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
        	sb.append(item);
        
        return sb.toString();
    }

    /*

    Given a String, if a length 2 subString appears at both its beginning 
    and end, return a String without the subString at the beginning, 
    so "HelloHe" yields "lloHe". The subString may overlap with itself, 
    so "Hi" yields "". Otherwise, return the original String unchanged. 

    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""        
    */
    public static String without2(String str)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}

        if (str.length() < 2)
            return str;
        else if (str.substring(0, 2).equalsIgnoreCase(str.substring(str.length()-2)))
            return str.substring(2);
        else
            return str;
    }

    /*
        Given a String, return a version without the first 2 chars. 
        Except keep the first char if it is 'a' and keep the second 
        char if it is 'b'. The String may be any length. Harder than it looks. 

        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"        
    */
    public static String deFront(String str)
    {
        StringBuilder sb = new StringBuilder();
        
        if (str.length() > 0 && str.charAt(0) == 'a')
            sb.append(str.charAt(0));
        if (str.length() > 1 && str.charAt(1) == 'b')
            sb.append(str.charAt(1));
        if (str.length() > 2)
            sb.append(str.substring(2));
        
        return sb.toString();
    }

    /*
        Given a String and a second "word" String, we'll say that the word matches 
        the String if it appears at the front of the String, except its first char 
        does not need to match exactly. On a match, return the front of the String, 
        or otherwise return the empty String. So, so with the String "hippo" 
        the word "hi" returns "hi" and "xip" returns "hip". The word will be at 
        least length 1. 

        startWord("hippo", "hi") → "hi"
        startWord("hippo", "xip") → "hip"
        startWord("hippo", "z") → "h"        
    */
    public static String startWord(String str, String word)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}

    	if (str.substring(1).startsWith(word.substring(1)))
            return str.substring(0, word.length());
        else
            return "";
    }

    /*
        Given a String, if the first or last chars are 'x', return the String 
        without those 'x' chars, and otherwise return the String unchanged. 

        withoutX("xHix") → "Hi"
        withoutX("xHi") → "Hi"
        withoutX("Hxix") → "Hxi"        
    */
    public static String withoutX(String str)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}

        StringBuilder sb = new StringBuilder();

        if (str.length() > 0 && str.charAt(0) != 'x')
            sb.append(str.charAt(0));

        if (str.length() > 2)
            sb.append(str.substring(1, str.length() - 1));

        if (str.length() > 1 && str.charAt(str.length() - 1) != 'x')
            sb.append(str.charAt(str.length() - 1));

        return sb.toString();
    }

    /*
        Given a String, if one or both of the first 2 chars is 'x', return 
        the String without those 'x' chars, and otherwise return the String 
        unchanged. This is a little harder than it looks. 

        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"        
    */
    public static String withoutX2(String str)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}

        StringBuilder sb = new StringBuilder();

        if (str.length() > 0 && str.charAt(0) != 'x')
            sb.append(str.charAt(0));

        if (str.length() > 1 && str.charAt(1) != 'x')
            sb.append(str.charAt(1));

        if (str.length() > 2)
            sb.append(str.substring(2));

        return sb.toString();
    }	

}
