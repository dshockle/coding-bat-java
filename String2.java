package codingbat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {

	public static void main(String[] args) {
		
        System.out.println("doubleChar");
        System.out.println(doubleChar("The").equals("TThhee"));
        System.out.println(doubleChar("AAbb").equals("AAAAbbbb"));
        System.out.println(doubleChar("Hi-There").equals("HHii--TThheerree"));

        System.out.println("countHi");
        System.out.println(countHi("ABChi hi", "hi") == 2);
        System.out.println(countHi("abc hi ho", "hi") == 1);
        System.out.println(countHi("hihi", "hi") == 2);

        System.out.println("catDog");
        System.out.println(catDog("catdog", "cat", "dog") == true);
        System.out.println(catDog("catcat", "cat", "dog") == false);
        System.out.println(catDog("1cat1cadodog", "cat", "dog") == true);

        System.out.println("countCode");
        System.out.println(countCode("aaacodebbb") == 1);
        System.out.println(countCode("codexxcode") == 2);
        System.out.println(countCode("cozexxcope") == 2);

        System.out.println("endOther");
        System.out.println(endOther("Hiabc", "abc") == true);
        System.out.println(endOther("AbC", "HiaBc") == true);
        System.out.println(endOther("abc", "abXabc") == true);

        System.out.println("xyzThere");
        System.out.println(xyzThere(".xyzabcxyz") == true);
        System.out.println(xyzThere("abcxyz") == true);
        System.out.println(xyzThere("abc.xyz") == false);
        System.out.println(xyzThere("xyz.abc") == true);
     
        System.out.println("bobThere");
        System.out.println(bobThere("abcbob") == true);
        System.out.println(bobThere("b9b") == true);
        System.out.println(bobThere("bac") == false);

        System.out.println("xyBalance");
        System.out.println(xyBalance("aaxbby") == true);
        System.out.println(xyBalance("aaxbb") == false);
        System.out.println(xyBalance("yaaxbb") == false);

        System.out.println("mixString");
        System.out.println(mixString("abc", "xyz").equals("axbycz"));
        System.out.println(mixString("Hi", "There").equals("HTihere"));
        System.out.println(mixString("xxxx", "There").equals("xTxhxexre"));

        System.out.println("repeatEnd");
        System.out.println(repeatEnd("Hello", 2).equals("lolo"));
        System.out.println(repeatEnd("Hello", 3).equals("llollollo"));
        System.out.println(repeatEnd("Hello", 1).equals("o"));

        System.out.println("repeatFront");
        System.out.println(repeatFront("Chocolate", 4).equals("ChocChoChC"));
        System.out.println(repeatFront("Chocolate", 3).equals("ChoChC"));
        System.out.println(repeatFront("Ice Cream", 2).equals("IcI"));

        System.out.println("repeatSeparator");
        System.out.println(repeatSeparator("Word", "X", 3).equals("WordXWordXWord"));
        System.out.println(repeatSeparator("This", "And", 2).equals("ThisAndThis"));
        System.out.println(repeatSeparator("This", "And", 1).equals("This"));

        System.out.println("prefixAgain");
        System.out.println(prefixAgain("abXYabc", 1) == true);
        System.out.println(prefixAgain("abXYabc", 2) == true);
        System.out.println(prefixAgain("abXYabc", 3) == false);

        System.out.println("subMiddle");
        System.out.println(subMiddle("AAxyzB", "xyz") == true);
        System.out.println(subMiddle("AxyzBB", "xyz") == true);
        System.out.println(subMiddle("AxyzBBB", "xyz") == false);
        System.out.println(subMiddle("AAxyzB", "xyz") == true);

        System.out.println("getSandwich");
        System.out.println(getSandwich("jellybreadjambreadbutter", "bread").equals("jam"));
        System.out.println(getSandwich("breadjambread", "bread").equals("jam"));
        System.out.println(getSandwich("xxbreadjambreadyy", "bread").equals("jam"));
        System.out.println(getSandwich("xxbreadyy", "bread").equals(""));
      
        System.out.println("sameStarChar");
        System.out.println(sameStarChar("xy*yzz") == true);
        System.out.println(sameStarChar("xy*zzz") == false);
        System.out.println(sameStarChar("*xa*az") == true);

        System.out.println("oneTwo");
        System.out.println(oneTwo("tcax").equals("cat"));
        System.out.println(oneTwo("abc").equals("bca"));
        System.out.println(oneTwo("tcagdo").equals("catdog"));

        System.out.println("zipZap");
        System.out.println(zipZap("zipXzap").equals("zpXzp"));
        System.out.println(zipZap("zopzop").equals("zpzp"));
        System.out.println(zipZap("zzzopzop").equals("zzzpzp"));

        System.out.println("starOut");
        System.out.println(starOut("sm**eilly").equals("silly"));
        System.out.println(starOut("ab*cd").equals("ad"));
        System.out.println(starOut("ab**cd").equals("ad"));
        System.out.println(starOut("sm**eilly").equals("silly"));

        System.out.println("plusOut");
        System.out.println(plusOut("12xy34xyabcxy", "xy").equals("++xy++xy+++xy"));
        System.out.println(plusOut("12xy34", "xy").equals("++xy++"));
        System.out.println(plusOut("12xy34", "1").equals("1+++++"));
        System.out.println(plusOut("12xy34xyabcxy", "xy").equals("++xy++xy+++xy"));

        System.out.println("wordEnds");
        System.out.println(wordEnds("abcXY123XYijk", "XY").equals("c13i"));
        System.out.println(wordEnds("XY1XY", "XY").equals("11"));
        System.out.println(wordEnds("XY123XY", "XY").equals("13"));
        System.out.println(wordEnds("XY1XY", "XY").equals("11"));

	}

    /*
    Given a String, return a String where for every char : the original, there are two chars. 

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
    */
    public static String doubleChar(String str)
    {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0, n = str.length(); i < n; i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }

    /*
    Return the number of times that the substring appears in the string.

    countHi("abc hi ho", "hi") → 1
    countHi("ABChi hi", "hi") → 2
    countHi("hihi", "hi") → 2
    */
    public static int countHi(String str, String sub)
    {
        return (str.length() - str.replaceAll(sub, "").length()) / sub.length();
    }

    /*
    Return true if the String "sub1" and "sub2" appear 
    the same number of times in the given String. 

    catDog("catdog", "cat", "dog") → true
    catDog("catcat", "cat", "dog") → false
    catDog("1cat1cadodog", "cat", "dog") → true
    */
    public static boolean catDog(String str, String sub1, String sub2)
    {
         int count1 = (str.length() - str.replaceAll(sub1, "").length()) / sub1.length();
         int count2 = (str.length() - str.replaceAll(sub2, "").length()) / sub2.length();
         return count1 == count2;
    }

    /*
    Return the number of times that the String "code" appears anywhere in the given String, 
    except we'll accept any letter for the 'd', so "cope" and "cooe" count. 

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
    */
    public static int countCode(String str)
    {
    	String pattern = "co.e";
    	return (str.length() - str.replaceAll(pattern, "").length()) / pattern.length();
    }

    /*
    Given two Strings, return true if either of the Strings appears at the 
    very end of the other String, ignoring upper/lower case differences. 

    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
    */
    public static boolean endOther(String a, String b)
    {
        return a.toLowerCase().endsWith(b.toLowerCase())  
            || b.toLowerCase().endsWith(a.toLowerCase());
    }

    /*
    Return true if the given String contains an appearance of "xyz" where the xyz is 
    not directly preceded by a period (.). So "xxyz" counts but "x.xyz" does not. 

	xyzThere(".xyzabcxyz") → true
    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
    */
    public static boolean xyzThere(String str)
    {
    	String regex    = "^xyz|[^\\.]xyz";
    	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    	Matcher matcher = pattern.matcher(str);
    	return matcher.find();
    }

    /*
    Return true if the given String contains a "bob" String, 
    but where the middle 'o' char can be any char. 

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
    */
    public static boolean bobThere(String str)
    {
    	String regex    = "b.b";
    	Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    	Matcher matcher = pattern.matcher(str);
    	return matcher.find();
    }

    /*        
    Return true if  for all the 'x' chars : the String, there exists a 'y' 
    char somewhere later : the String. One 'y' can balance multiple 'x's. 

    xyBalance("aaxbby") → true
    xyBalance("aaxbb") → false
    xyBalance("yaaxbb") → false
    */
    public static boolean xyBalance(String str)
    {
        return str.toLowerCase().lastIndexOf("x")
            <= str.toLowerCase().lastIndexOf("y");
    }

    /*
    Given two Strings, a and b, create a bigger String made of the first char of a, 
    the first char of b, the second char of a, the second char of b, and so on. 
    Any leftover chars go at the end of the result. 

    mixString("abc", "xyz") → "axbycz"
    mixString("Hi", "There") → "HTihere"
    mixString("xxxx", "There") → "xTxhxexre"
    */
    public static String mixString(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(a.length(), b.length());
        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < min; i++)
        {
            sb.append(a.charAt(i));
            sb.append(b.charAt(i));
        }

        if (max != min) 
            if (max == a.length())
                sb.append(a.substring(min));
            if (max == b.length())
                sb.append(b.substring(min));

        return sb.toString();
    }

    /*
    Given a string and an integer n, return a string made of n repetitions 
    of the last n characters of the string. If there are fewer than n chars,  
    use whatever is there.  

    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
    */
    public static String repeatEnd(String str, int n)
    {
    	if (str == null || str.isEmpty()){
    		return "";
    	}

        String item = str.substring(str.length() - Math.min(n, str.length()));
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++)
        	sb.append(item);
        
        return sb.toString();
    }

    /*
    Given a String and an int n, return a String made of the first n characters 
    of the String, followed by the first n-1 characters of the String, and so on. 

    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"
    */
    public static String repeatFront(String str, int n)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 0; i--)
        {
            sb.append(str.substring(0, i));
        }
        return sb.toString();
    }

    /*
    Given two Strings, word and a separator sep, return a big String 
    made of count occurrences of the word, separated by the separator String. 

    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
    */
    public static String repeatSeparator(String word, String sep, int count)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++)
        {
            sb.append(word);
            if (i < count - 1)
                sb.append(sep);
        }
        return sb.toString();
    }

    /*
    Given a string, consider the prefix string made of the first N chars 
    of the string. Does that prefix  appear somewhere else in the string? 
    Assume that the string is not empty and that N is in the range 1..str.length(). 

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
    */
    public static boolean prefixAgain(String str, int n)
    {
        return str.substring(n).contains(str.substring(0, n));
    }

    /*
    Given a string, does the sub String appear in the middle of the string? 
    To define middle, we'll say that the number of chars to the left 
    and right of the substring must differ by at most one. 
    This problem is harder than it looks. 

    subMiddle("AAxyzBB", "xyz") → true
    subMiddle("AxyzBB", "xyz") → true
    subMiddle("AxyzBBB", "xyz") → false
    subMiddle("AAxyzB", "xyz") → true
    */
    public static boolean subMiddle(String str, String sub)
    {
        int strLen = str.length();
        int subLen = sub.length();
        boolean oddPadding = (strLen - subLen) % 2 == 1;

        int startEven = strLen / 2 - subLen / 2;
        int startOdd = strLen / 2 - subLen / 2 - 1;

        String strEven = str.substring(startEven, subLen);
        String strOdd = str.substring(startOdd, subLen);

        boolean resultEven = strEven.equals(sub);
        boolean resultOdd = strOdd.equals(sub);

        return oddPadding ? resultEven || resultOdd : resultEven;
    }

    /*
    Return the String that is between the first and last appearance 
    of "bread" : the given String, or return the empty string "" if 
    there are not two pieces of bread. 

    getSandwich("breadjambread", "bread") → "jam"
    getSandwich("xxbreadjambreadyy", "bread") → "jam"
    getSandwich("xxbreadyy", "bread") → ""
    */
    public static String getSandwich(String str, String bread)
    {
        int first = str.indexOf(bread);
        int last = str.lastIndexOf(bread);
        int start = first + bread.length();

        if (first < 0 || start >= last)
            return "";
        else
            return str.substring(start, last);
    }

    /*
    Returns true if for every '*' (star) : the String, if there are chars 
    both immediately before and after the star, they are the same. 

    sameStarChar("xy*yzz") → true
    sameStarChar("xy*zzz") → false
    sameStarChar("*xa*az") → true
    */
    public static boolean sameStarChar(String str)
    {
        for(int i = 1; i < str.length() - 1; i++)
        {
            if (str.charAt(i) == '*')
                if (str.charAt(i-1) != str.charAt(i+1))
                    return false;
        }
        return true;
    }

    /*
    Given a String, compute a new String by moving the first char to come 
    after the next two chars, so "abc" yields "bca". Repeat this process for 
    each subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
    Ignore any group of fewer than 3 chars at the end. 

    oneTwo("abc") → "bca"
    oneTwo("tcax") → "cat"
    oneTwo("tcagdo") → "catdog"
    */
    public static String oneTwo(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length() - 2; i += 3)
        {
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i+2));
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /*
    Look for patterns like "zip" and "zap" : the String -- length-3, 
    starting with 'z' and ending with 'p'. Return a String where for 
    all such words, the middle letter is gone, so "zipXzap" yields "zpXzp". 

    zipZap("zipXzap") → "zpXzp"
    zipZap("zopzop") → "zpzp"
    zipZap("zzzopzop") → "zzzpzp"
    */
    public static String zipZap(String str)
    {
        return str.replaceAll("z.p", "zp");
    }

    /*
    Return a version of the given String, where for every star (*) : the 
    String the star and the chars immediately to its left and right are gone. 
    So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm**eilly") → "silly"
    */
    public static String starOut(String str)
    {
        return str.replaceAll(".\\*+.", "");
    }

    /*
    Given a String and a non-empty word String, return a version of the original 
    String where all chars have been replaced by pluses ("+"), except for appearances 
    of the word String which are preserved unchanged. 

    plusOut("12xy34", "xy") → "++xy++"
    plusOut("12xy34", "1") → "1+++++"
    plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
    */
    public static String plusOut(String str, String word)
    {
        return str.replaceAll("[^" + word + "]", "+");
    }

    /*
    Given a string and a non-empty word string, return a string made of each char 
    just before and just after every appearance of the word in the string. 
    Ignore cases where there is no char before or after the word, and a char may 
    be included twice if it is between two words. 

    wordEnds("abcXY123XYijk", "XY") → "c13i"
    wordEnds("XY123XY", "XY") → "13"
    wordEnds("XY1XY", "XY") → "11"
    */
    public static String wordEnds(String str, String word)
    {
        StringBuilder sb = new StringBuilder();
        int len = word.length();
        int pos = str.indexOf(word);

        while(pos >= 0) {
        	if (pos > 0)
        		sb.append(str.charAt(pos - 1));
        	
        	if (pos + len < str.length() - 1)
        		sb.append(str.charAt(pos + len));
        	
        	pos = str.indexOf(word, pos + 1);
        }

        return sb.toString();
    }

}
