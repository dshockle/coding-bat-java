package codingbat;

public class String3 {

	public static void main(String[] args) {
		
        System.out.println("countYZ");
        System.out.println(countYZ("Why ask why? Indeed, why ask why!") == 4);
        System.out.println(countYZ("my fez?") == 2);
        System.out.println(countYZ("day fyyyz") == 2);

        System.out.println("withoutString");
        System.out.println(withoutString("Hello there", "llo").equalsIgnoreCase("He there"));
        System.out.println(withoutString("Hello there", "E").equalsIgnoreCase("Hllo thr"));
        System.out.println(withoutString("Hello there", "X").equalsIgnoreCase("Hello there"));

        System.out.println("equalIsNot");
        System.out.println(equalIsNot("This is not", "is", "not") == false);
        System.out.println(equalIsNot("This is not not", "is", "not") == true);
        System.out.println(equalIsNot("Note the notice isn't.", "is", "not") == true);
        
        System.out.println("gHappy");
        System.out.println(gHappy("xxggxx", 'g') == true);
        System.out.println(gHappy("xxgxx", 'g') == false);
        System.out.println(gHappy("xxggyygxx", 'g') == false);

        System.out.println("countTriple");
        System.out.println(countTriple("abcXXXabc") == 1);
        System.out.println(countTriple("xxxabyyyycd") == 3);
        System.out.println(countTriple("a") == 0);

        System.out.println("countTripleLambda");
        System.out.println(countTripleLambda("abcXXXabc") == 1);
        System.out.println(countTripleLambda("xxxabyyyycd") == 3);
        System.out.println(countTripleLambda("a") == 0);

        System.out.println("sumDigits");
        System.out.println(sumDigits("aa1bc2d3") == 6);
        System.out.println(sumDigits("aa11b33") == 8);
        System.out.println(sumDigits("Chocolate") == 0);

        System.out.println("sumDigitsLambda");
        System.out.println(sumDigitsLambda("aa1bc2d3") == 6);
        System.out.println(sumDigitsLambda("aa11b33") == 8);
        System.out.println(sumDigitsLambda("Chocolate") == 0);

        System.out.println("sameEnds");
        System.out.println(sameEnds("abXYab").equals("ab"));
        System.out.println(sameEnds("xx").equals("x"));
        System.out.println(sameEnds("xxx").equals("x"));
        
        System.out.println("mirrorEnds");
        System.out.println(mirrorEnds("abXYZba").equals("ab"));
        System.out.println(mirrorEnds("abca").equals("a"));
        System.out.println(mirrorEnds("aba").equals("aba"));
        System.out.println(mirrorEnds("dog").equals(""));
        
        System.out.println("maxBlock");
        System.out.println(maxBlock("hoopla") == 2);
        System.out.println(maxBlock("abbCCCddBBBxx") == 3);
        System.out.println(maxBlock("") == 0);
        System.out.println(maxBlock("aaaa") == 4);
        
        System.out.println("sumNumbers");
        System.out.println(sumNumbers("abc123xyz") == 123);
        System.out.println(sumNumbers("aa11b33") == 44);
        System.out.println(sumNumbers("7 11") == 18);

        System.out.println("notReplace");
        System.out.println(notReplace("is test").equals("is not test"));
        System.out.println(notReplace("is-is").equals("is not-is not"));
        System.out.println(notReplace("This is right").equals("This is not right"));

	}

    /*
    Given a String, count the number of words ending with 'y' or 'z' -- so 
    the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" 
    (not case sensitive). We'll say that a y or z is at the end of a word if 
    there is not an alphabetic letter immediately following it. 
    
    countYZ("Why ask why? Indeed, why ask why!") → 4
    countYZ("my fez?") → 2
    countYZ("day fyyyz") → 2
    */
    public static int countYZ(String str)
    {
    	String input = str.toLowerCase().replaceAll("[^a-zA-Z ]", " ").trim();
        String[] words = input.split(" ");
        int count = 0;

        for (String word : words)
            if (word.endsWith("y") || word.endsWith("z"))
                count++;

        return count;
    }

    /*
    Given two Strings, original and remove, return a version of the original String 
    where all instances of the remove String have been removed (not case sensitive). 
    You may assume that the remove String is length 1 or more. 
    Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x". 

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"
    */
    public static String withoutString(String original, String remove)
    {
        String result = original.toLowerCase().replaceAll(remove.toLowerCase(), "");
        return result;
    }

    /*
    Given a String, return true if the number of appearances of "first" anywhere 
    in the String is equal to the number of appearances of "second" anywhere in 
    the String (case sensitive). 

    equalIsNot("This is not.", "is", "not") → false
    equalIsNot("This is not not.", "is", "not") → true
    equalIsNot("Note the notice isn't.", "is", "not") → true
    */
    public static boolean equalIsNot(String text, String first, String second)
    {
        int firstCount  = (text.length() - text.replace(first, "").length()) / first.length();
        int secondCount = (text.length() - text.replace(second, "").length()) / second.length();
        return firstCount == secondCount;
    }

    /*
    We'll say that a lower case 'g' in a String is "happy" if there is another 'g' 
    immediately to its left or right. Return true if all the g's in the given String 
    are happy. 

    gHappy("xxggxx", 'g') → true
    gHappy("xxgxx", 'g') → false
    gHappy("xxggyygxx", 'g') → false
    */
    public static boolean gHappy(String str, char g)
    {
        for(int i = 0; i < str.length(); i++)
            if (str.charAt(i) == g)
                if ((i > 0 && str.charAt(i-1) != g)
                    && (i < str.length() - 1 && str.charAt(i+1) != g))
                        return false;

        return true;
    }

    /*
    
    We'll say that a "triple" in a String is a char appearing three times in a row. 
    Return the number of triples in the given String. The triples may overlap. 

    countTriple("abcXXXabc") → 1
    countTriple("xxxabyyyycd") → 3
    countTriple("a") → 0
    */
    public static int countTriple(String str)
    {
        int count = 0;

        for (int i = 2; i < str.length(); i++)
            if (str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i - 2))
                count++;

        return count;
    }

    /*
    
    We'll say that a "triple" in a String is a char appearing three times in a row. 
    Return the number of triples in the given String. The triples may overlap. 
    Use Lambda. Do not use loops.
    countTripleLambda("abcXXXabc") → 1
    countTripleLambda("xxxabyyyycd") → 3
    countTripleLambda("a") → 0
    */
    public static int countTripleLambda(String str)
    {
    	/*
        return str
            .Skip(2)
            .Where((ch, index) => ch == str[index] && ch == str[index + 1])
            .Count();
            */
    	return 0;
    }

    /*
    Given a String, return the sum of the digits 0-9 that appear in the String, 
    ignoring all other characters. Return 0 if there are no digits in the String. 

    sumDigits("aa1bc2d3") → 6
    sumDigits("aa11b33") → 8
    sumDigits("Chocolate") → 0
    */
    public static int sumDigits(String str)
    {
        int sum = 0;

        for (int i = 0, n = str.length(); i < n; i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c))
            	sum += (int)Character.getNumericValue(c);
        }

        return sum;
    }

    /*
    Given a String, return the sum of the digits 0-9 that appear in the String, 
    ignoring all other characters. Return 0 if there are no digits in the String. 
    Use Lambda. Do not use loops.
    sumDigitsLambda("aa1bc2d3") → 6
    sumDigitsLambda("aa11b33") → 8
    sumDigitsLambda("Chocolate") → 0
    */
    public static int sumDigitsLambda(String str)
    {
    	/*
        return str.Where(c => Char.IsDigit(c))
               .Select(digit => (int)char.GetNumericValue(digit))
               .Sum();
    	 */
    	return 0;
    }


    /*
    Given a String, return the longest subString that appears at both the beginning and end 
    of the String without overlapping. For example, sameEnds("abXab") is "ab". 

    sameEnds("abXYab") → "ab"
    sameEnds("xx") → "x"
    sameEnds("xxx") → "x"
    */
    public static String sameEnds(String str)
    {
        int len = str.length() / 2;
        
        do
        {
        	String left = str.substring(0, len);
        	String right = str.substring(str.length() - len);
        	
            if (left.equalsIgnoreCase(right)){
            	return left;
            }
            else{
            	len--;	
            }
            
        } while (len > 0);

        return "";
    }

    /*
    Given a String, look for a mirror image (backwards) String at both the beginning 
    and end of the given String. in other words, zero or more characters at the very 
    beginning of the given String, and at the very end of the String in reverse order 
    (possibly overlapping). For example, the String "abXYZba" has the mirror end "ab". 

    mirrorEnds("abXYZba") → "ab"
    mirrorEnds("abca") → "a"
    mirrorEnds("aba") → "aba"
    mirrorEnds("dog") → ""
    */
    public static String mirrorEnds(String str)
    {
        for(int i = 0; i < str.length(); i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return str.substring(0, i);

        return str;
    }

    /*
    Given a String, return the length of the largest "block" in the String. 
    A block is a run of adjacent chars that are the same. 

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
    maxBlock("aaaa") → 4
    */
    public static int maxBlock(String str)
    {
        int max = 0;
        for(int i = 0; i < str.length(); i++)
        {
            int block = 0;
            int j = i;
            
            while (j < str.length() && str.charAt(i) == str.charAt(j))
            {
            	block = 1 - i + j;
            	j++;
            }
            
            if (block > max)
                max = block;
        }
        return max;
    }

    /*
    Given a String, return the sum of the numbers appearing in the String, 
    ignoring all other characters. A number is a series of 1 or more digit 
    chars in a row. 

    sumNumbers("abc123xyz") → 123
    sumNumbers("aa11b33") → 44
    sumNumbers("7 11") → 18
    */
    public static int sumNumbers(String str)
    {
        if (str == null || str.trim().length() == 0)
            return 0;

        String input = str.replaceAll("[^0-9]", " ").trim();
        String[] words = input.split(" ");
        int sum = 0;

        for (String word : words)
        {
        	  try  
        	  {  
        	    sum += Integer.parseInt(word);  
        	  }
        	  catch(NumberFormatException nfe)  
        	  {  
        	    // do nothing  
        	  }  
        }
        return sum;
    }

    /*
    Given a String, return a String where every appearance of the lower case word "is" 
    has been replaced with "is not". The word "is" should not be immediately preceded 
    or followed by a letter -- so for example the "is" in "this" does not count. 

    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"
    */
    public static String notReplace(String str)
    {
        String result = str.replaceAll("\\bis\\b", "is not");
        return result;
    }

}
