package codingbat;

public class Warmup2 {

	public static void main(String[] args) {
		
        System.out.println("StringTimes");
        System.out.println(StringTimes("Hi", 2).equals("HiHi"));
        System.out.println(StringTimes("Hi", 3).equals("HiHiHi"));
        System.out.println(StringTimes("Hi", 1).equals("Hi"));

        System.out.println("StringTimesLambda");
        System.out.println(StringTimesLambda("Hi", 2).equals("HiHi"));
        System.out.println(StringTimesLambda("Hi", 3).equals("HiHiHi"));
        System.out.println(StringTimesLambda("Hi", 1).equals("Hi"));

        System.out.println("frontTimes");
        System.out.println(frontTimes("Chocolate", 2).equals("ChoCho"));
        System.out.println(frontTimes("Chocolate", 3).equals("ChoChoCho"));
        System.out.println(frontTimes("Abc", 3).equals("AbcAbcAbc"));

        System.out.println("frontTimesLambda");
        System.out.println(frontTimesLambda("Chocolate", 2).equals("ChoCho"));
        System.out.println(frontTimesLambda("Chocolate", 3).equals("ChoChoCho"));
        System.out.println(frontTimesLambda("Abc", 3).equals("AbcAbcAbc"));

        System.out.println("countXX");
        System.out.println(countXX("abcxx") == 1);
        System.out.println(countXX("xxx") == 2);
        System.out.println(countXX("xxxx") == 3);

        System.out.println("countXXLambda");
        System.out.println(countXXLambda("abcxx") == 1);
        System.out.println(countXXLambda("xxx") == 2);
        System.out.println(countXXLambda("xxxx") == 3);

        System.out.println("doubleX");
        System.out.println(doubleX("axXbb") == true);
        System.out.println(doubleX("axaxx") == false);
        System.out.println(doubleX("Xxxxx") == true);

        System.out.println("StringBits");
        System.out.println(StringBits("Hello").equals("Hlo"));
        System.out.println(StringBits("Hi").equals("H"));
        System.out.println(StringBits("Heeololeo").equals("Hello"));

        System.out.println("StringSplosion");
        System.out.println(StringSplosion("Code").equals("CCoCodCode"));
        System.out.println(StringSplosion("abc").equals("aababc"));
        System.out.println(StringSplosion("ab").equals("aab"));

        System.out.println("StringX");
        System.out.println(StringX("xxHxix").equals("xHix"));
        System.out.println(StringX("abxxxcd").equals("abcd"));
        System.out.println(StringX("xabxxxcdx").equals("xabcdx"));

        System.out.println("altPairs");
        System.out.println(altPairs("kitten").equals("kien"));
        System.out.println(altPairs("Chocolate").equals("Chole"));
        System.out.println(altPairs("CodingHorror").equals("Congrr"));

        System.out.println("StringYak");
        System.out.println(StringYak("yakpak").equals("pak"));
        System.out.println(StringYak("pakyak").equals("pak"));
        System.out.println(StringYak("yak123ya").equals("123ya"));

        System.out.println("noTriples");
        System.out.println(noTriples(new int[] { 1, 1, 2, 2, 1}) == true);
        System.out.println(noTriples(new int[] { 1, 1, 2, 2, 2, 1}) == false);
        System.out.println(noTriples(new int[] { 1, 1, 1, 2, 2, 2, 1}) == false);

        System.out.println("noTriplesLambda");
        System.out.println(noTriplesLambda(new int[] { 1, 1, 2, 2, 1 }) == true);
        System.out.println(noTriplesLambda(new int[] { 1, 1, 2, 2, 2, 1 }) == false);
        System.out.println(noTriplesLambda(new int[] { 1, 1, 1, 2, 2, 2, 1 }) == false);
	}

    /*
    Given a String and a non-negative int n, return a larger String 
    that is n copies of the original String. 
    StringTimes("Hi", 2) → "HiHi"
    StringTimes("Hi", 3) → "HiHiHi"
    StringTimes("Hi", 1) → "Hi"
    */
    public static String StringTimes(String str, int n)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++)
            sb.append(str);

        return sb.toString();
    }

    /*
    Given a String and a non-negative int n, return a larger String 
    that is n copies of the original String. Use Lambda. Do not use loops.
    StringTimesLambda("Hi", 2) → "HiHi"
    StringTimesLambda("Hi", 3) → "HiHiHi"
    StringTimesLambda("Hi", 1) → "Hi"
    */
    public static String StringTimesLambda(String str, int n)
    {
        //return String.Concat(Enumerable.Repeat(str, n));
    	return "";
    }

    /*
    Given a String and a non-negative int n, 
    we'll say that the front of the String is the first 3 chars, 
    or whatever is there if the String is less than length 3. 
    Return n copies of the front; 

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
    */
    public static String frontTimes(String str, int n)
    {
        StringBuilder sb = new StringBuilder();
        String front = str.substring(0, Math.min(str.length(), 3));

        for (int i = 0; i < n; i++)
            sb.append(front);

        return sb.toString();
    }

    /*
    Given a String and a non-negative int n, 
    we'll say that the front of the String is the first 3 chars, 
    or whatever is there if the String is less than length 3. 
    Return n copies of the front. Use Lambda. Do not use loops.

    frontTimesLambda("Chocolate", 2) → "ChoCho"
    frontTimesLambda("Chocolate", 3) → "ChoChoCho"
    frontTimesLambda("Abc", 3) → "AbcAbcAbc"
    */
    public static String frontTimesLambda(String str, int n)
    {
        //return String.Concat(Enumerable.Repeat(str.substring(0, 3), n));
    	return "";
    }

    /*
    Count the number of "xx" in the given String. 
    We'll say that overlapping is allowed, so "xxx" contains 2. 
    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
    */
    public static int countXX(String str)
    {
        int count = 0;

        for (int i = 1; i < str.length(); i++)
            if (str.charAt(i) == 'x' && str.charAt(i-1) == 'x')
                count++;

        return count;
    }

    /*
    Count the number of "xx" in the given String. 
    We'll say that overlapping is allowed, so "xxx" contains 2. 
    Use Lambda. Do not use loops.
    countXXLambda("abcxx") → 1
    countXXLambda("xxx") → 2
    countXXLambda("xxxx") → 3
    */
    public static int countXXLambda(String str)
    {
    	/*
        return str.Skip(1)
            .Where((value, index) => value == 'x' && str[index] == 'x')
            .Count();
        */
    	return 0;
    }

    /*
    Given a String, return true if the first instance of "x" in the String 
    is immediately followed by another "x". 
    doubleX("axxbb") → true
    doubleX("axaxx") → false
    doubleX("xxxxx") → true
    */
    public static boolean doubleX(String str)
    {
        String lowerCaseStr = str.toLowerCase();
        int pos = lowerCaseStr.indexOf('x');
        return pos > -1 && pos < str.length() - 1 && lowerCaseStr.charAt(pos + 1) == 'x';
    }

    /*
    Given a String, return a new String made of every other char starting 
    with the first, so "Hello" yields "Hlo". 

    StringBits("Hello") → "Hlo"
    StringBits("Hi") → "H"
    StringBits("Heeololeo") → "Hello"
    */

    public static String StringBits(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    /*
        Given a non-empty String like "Code" return a String like "CCoCodCode". 

        StringSplosion("Code") → "CCoCodCode"
        StringSplosion("abc") → "aababc"
        StringSplosion("ab") → "aab"
    */
    public static String StringSplosion(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            sb.append(str.substring(0, i+1));
        }
        return sb.toString();
    }
    /*

       Given a String, return a version where all the "x" have been removed. 
       Except an "x" at the very start or end should not be removed. 

       StringX("xxHxix") → "xHix"
       StringX("abxxxcd") → "abcd"
       StringX("xabxxxcdx") → "xabcdx"
    */
    public static String StringX(String str)
    {
        String noX = str.substring(1,str.length()-1).replace("x", "");
        return str.charAt(0) + noX + str.charAt(str.length() - 1);
    }

    /*
        Given a String, return a String made of the chars at 
        indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien". 

        altPairs("kitten") → "kien"
        altPairs("Chocolate") → "Chole"
        altPairs("CodingHorror") → "Congrr
    */
    public static String altPairs(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4)
        {
            sb.append(str.charAt(i));
            if (i < str.length() - 1)
                sb.append(str.charAt(i+1));
        }
        return sb.toString();
    }

    /*
    Suppose the String "yak" is unlucky. 
    Given a String, return a version where all the "yak" are removed, 
    but the "a" can be any char. The "yak" Strings will not overlap. 

    StringYak("yakpak") → "pak"
    StringYak("pakyak") → "pak"
    StringYak("yak123ya") → "123ya"
    */
    public static String StringYak(String str)
    {
    	String result = str.replaceAll("y.k", "");
        return result;
    }

    /*
    
    Given an array of ints, we'll say that a triple is a value appearing 3 times 
    in a row in the array. Return true if the array does not contain any triples. 

    noTriples({1, 1, 2, 2, 1}) → true
    noTriples({1, 1, 2, 2, 2, 1}) → false
    noTriples({1, 1, 1, 2, 2, 2, 1}) → false
    */
    public static Boolean noTriples(int[] nums)
    {
        for (int i = 2; i < nums.length; i++)
            if (nums[i] == nums[i - 1] && nums[i] == nums[i - 2])
                return false;

        return true;
    }

    /*
    
    Given an array of ints, we'll say that a triple is a value appearing 3 times 
    in a row in the array. Return true if the array does not contain any triples. 
    Use Lambda. Do not use loops.
    noTriplesLambda({1, 1, 2, 2, 1}) → true
    noTriplesLambda({1, 1, 2, 2, 2, 1}) → false
    noTriplesLambda({1, 1, 1, 2, 2, 2, 1}) → false
    */
    public static Boolean noTriplesLambda(int[] nums)
    {
    	/*
        return nums
            .Where((value, index) => index > 1
            && value == nums[index - 1]
            && value == nums[index - 2])
            .Count() == 0;
        */
    	return false;
    }

}
