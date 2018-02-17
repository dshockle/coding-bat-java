package codingbat;

public class Recursion1 {

	public static void main(String[] args) {
		
        System.out.println("factorial");
        System.out.println(factorial(1) == 1);
        System.out.println(factorial(2) == 2);
        System.out.println(factorial(3) == 6);

        System.out.println("bunnyEars");
        System.out.println(bunnyEars(0) == 0);
        System.out.println(bunnyEars(1) == 2);
        System.out.println(bunnyEars(2) == 4);

        System.out.println("fibonacci");
        System.out.println(fibonacci(0) == 0);
        System.out.println(fibonacci(1) == 1);
        System.out.println(fibonacci(2) == 1);

        System.out.println("bunnyEars2");
        System.out.println(bunnyEars2(0) == 0);
        System.out.println(bunnyEars2(1) == 2);
        System.out.println(bunnyEars2(2) == 5);

        System.out.println("triangle");
        System.out.println(triangle(0) == 0);
        System.out.println(triangle(1) == 1);
        System.out.println(triangle(2) == 3);

        System.out.println("sumDigits");
        System.out.println(sumDigits(126) == 9);
        System.out.println(sumDigits(49) == 13);
        System.out.println(sumDigits(12) == 3);

        System.out.println("count7");
        System.out.println(count7(717) == 2);
        System.out.println(count7(7) == 1);
        System.out.println(count7(123) == 0);

        System.out.println("count8");
        System.out.println(count8(8) == 1);
        System.out.println(count8(818) == 2);
        System.out.println(count8(8818) == 4);

        System.out.println("powerN");
        System.out.println(powerN(3, 1) == 3);
        System.out.println(powerN(3, 2) == 9);
        System.out.println(powerN(3, 3) == 27);

        System.out.println("countX");
        System.out.println(countX("xxhixx") == 4);
        System.out.println(countX("xhixhix") == 3);
        System.out.println(countX("hi") == 0);

        System.out.println("countHi");
        System.out.println(countHi("xxhixx") == 1);
        System.out.println(countHi("xhixhix") == 2);
        System.out.println(countHi("hi") == 1);

        System.out.println("changeXY");
        System.out.println(changeXY("codex").equals("codey"));
        System.out.println(changeXY("xxhixx").equals("yyhiyy"));
        System.out.println(changeXY("xhixhix").equals("yhiyhiy"));

        System.out.println("changePi");
        System.out.println(changePi("xpix").equals("x3.14x"));
        System.out.println(changePi("pipi").equals("3.143.14"));
        System.out.println(changePi("pip").equals("3.14p"));

        System.out.println("noX");
        System.out.println(noX("xaxb").equals("ab"));
        System.out.println(noX("abc").equals("abc"));
        System.out.println(noX("xx").equals(""));

        System.out.println("array6");
        System.out.println(array6(new int[] { 1, 6, 4}, 0) == true);
        System.out.println(array6(new int[] { 1, 4}, 0) == false);
        System.out.println(array6(new int[] { 6 }, 0) == true);

        System.out.println("array11");
        System.out.println(array11(new int[] { 1, 2, 11}, 0) == 1);
        System.out.println(array11(new int[] { 11, 11}, 0) == 2);
        System.out.println(array11(new int[] { 1, 2, 3, 4}, 0) == 0);

        System.out.println("array220");
        System.out.println(array220(new int[] { 1, 2, 20}, 0) == true);
        System.out.println(array220(new int[] { 3, 30}, 0) == true);
        System.out.println(array220(new int[] { 3 }, 0) == false);

        System.out.println("allStar");
        System.out.println(allStar("hello") == "h*e*l*l*o");
        System.out.println(allStar("abc") == "a*b*c");
        System.out.println(allStar("ab") == "a*b");

        System.out.println("pairStar");
        System.out.println(pairStar("hello").equals("hel*lo"));
        System.out.println(pairStar("xxyy").equals("x*xy*y"));
        System.out.println(pairStar("aaaa").equals("a*a*a*a"));

        System.out.println("endX");
        System.out.println(endX("xxre").equals("rexx"));
        System.out.println(endX("xxhixx").equals("hixxxx"));
        System.out.println(endX("xhixhix").equals("hihixxx"));

        System.out.println("countPairs");
        System.out.println(countPairs("axa") == 1);
        System.out.println(countPairs("axax") == 2);
        System.out.println(countPairs("axbx") == 1);

        System.out.println("countAbc");
        System.out.println(countAbc("abc") == 1);
        System.out.println(countAbc("abcxxabc") == 2);
        System.out.println(countAbc("abaxxaba") == 2);

        System.out.println("count11");
        System.out.println(count11("11abc11") == 2);
        System.out.println(count11("abc11x11x11") == 3);
        System.out.println(count11("111") == 1);

        System.out.println("StringClean");
        System.out.println(StringClean("yyzzza").equals("yza"));
        System.out.println(StringClean("abbbcdd").equals("abcd"));
        System.out.println(StringClean("Hello").equals("Helo"));

        System.out.println("countHi2");
        System.out.println(countHi2("ahixhi") == 1);
        System.out.println(countHi2("ahibhi") == 2);
        System.out.println(countHi2("xhixhi") == 0);

        System.out.println("parenBit");
        System.out.println(parenBit("xyz(abc)123") == "(abc)");
        System.out.println(parenBit("x(hello)") == "(hello)");
        System.out.println(parenBit("(xy)1") == "(xy)");

        System.out.println("nestParen");
        System.out.println(nestParen("(())") == true);
        System.out.println(nestParen("((()))") == true);
        System.out.println(nestParen("(((x))") == false);

        System.out.println("strCount");
        System.out.println(strCount("catcowcat", "cat") == 2);
        System.out.println(strCount("catcowcat", "cow") == 1);
        System.out.println(strCount("catcowcat", "dog") == 0);

        System.out.println("strCopies");
        System.out.println(strCopies("catcowcat", "cat", 2) == true);
        System.out.println(strCopies("catcowcat", "cow", 2) == false);
        System.out.println(strCopies("catcowcat", "cow", 1) == true);

        System.out.println("strDist");
        System.out.println(strDist("catcowcat", "cat") == 9);
        System.out.println(strDist("catcowcat", "cow") == 3);
        System.out.println(strDist("cccatcowcatxx", "cat") == 9);

	}

    /*
    Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. 
    Compute the result recursively (without loops). 

    factorial(1) → 1
    factorial(2) → 2
    factorial(3) → 6
    */
    public static int factorial(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    /*        
    We have a number of bunnies and each bunny has two big floppy ears. We want to compute the 
    total number of ears across all the bunnies recursively (without loops or multiplication). 

    bunnyEars(0) → 0
    bunnyEars(1) → 2
    bunnyEars(2) → 4
    */
    public static int bunnyEars(int bunnies)
    {
        if (bunnies == 0)
            return 0;
        else if (bunnies == 1)
            return 2;
        else
            return 2 + bunnyEars(bunnies - 1);

    }

    /*
    The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive 
    definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
    Each subsequent value is the sum of the previous two values, so the whole sequence is: 
    0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns 
    the nth fibonacci number, with n=0 representing the start of the sequence. 

    fibonacci(0) → 0
    fibonacci(1) → 1
    fibonacci(2) → 1
    */
    public static int fibonacci(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*        
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the 
    normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a 
    raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without 
    loops or multiplication). 

    bunnyEars2(0) → 0
    bunnyEars2(1) → 2
    bunnyEars2(2) → 5
    */
    public static int bunnyEars2(int bunnies)
    {
        if (bunnies == 0)
            return 0;
        else if (bunnies == 1)
            return 2;
        else
            return 3 - bunnies % 2 + bunnyEars(bunnies - 1);
    }

    /*
    We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, 
    the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the 
    total number of blocks in such a triangle with the given number of rows. 

    triangle(0) → 0
    triangle(1) → 1
    triangle(2) → 3
    */
    public static int triangle(int rows)
    {
        if (rows == 0)
            return 0;
        else if (rows == 1)
            return 1;
        else
            return rows + triangle(rows - 1);
    }

    /*        
    Given a non-negative int n, return the sum of its digits recursively (no loops).

    sumDigits(126) → 9
    sumDigits(49) → 13
    sumDigits(12) → 3
*/
    public static int sumDigits(int n)
    {
        if (n == 0)
            return 0;
        else
            return n % 10 + sumDigits(n / 10);
    }

    /*        
    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for 
    example 717 yields 2. (no loops). 

    count7(717) → 2
    count7(7) → 1
    count7(123) → 0
    */
    public static int count7(int n)
    {
        if (n == 0)
            return 0;
        else if (n % 10 == 7)
            return 1 + count7(n / 10);
        else
            return count7(n / 10);
    }

    /*        
    Given a non-negative int n, compute recursively (no loops) the count of the occurrences 
    of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, 
    so 8818 yields 4. 

    count8(8) → 1
    count8(818) → 2
    count8(8818) → 4
    */
    public static int count8(int n)
    {
        if (n == 0)
            return 0;
        else if (n % 10 == 8)
            if ((n / 10) % 10 == 8)
                return 2 + count8(n / 10);
            else
                return 1 + count8(n / 10);
        else
            return count8(n / 10);
    }


    /*
    Given baseNum and n that are both 1 or more, compute recursively (no loops) the value of 
    baseNum to the 'pow' power, so powerN(3, 2) is 9 (3 squared). 

    powerN(3, 1) → 3
    powerN(3, 2) → 9
    powerN(3, 3) → 27
    */
    public static int powerN(int baseNum, int pow)
    {
        if (pow == 0)
            return 1;
        else if (pow == 1)
            return baseNum;
        else
            return baseNum * powerN(baseNum, pow - 1);
    }


    /*
    Given a String, compute recursively (no loops) the number of lowercase 'x' chars in the String. 

    countX("xxhixx") → 4
    countX("xhixhix") → 3
    countX("hi") → 0

        */
    public static int countX(String str)
    {
        if (str.length() == 0)
            return 0;
        else if (str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));
        else
            return countX(str.substring(1));
    }


    /*
    Given a String, compute recursively (no loops) the number of times lowercase "hi" appears 
    in the String. 

    countHi("xxhixx") → 1
    countHi("xhixhix") → 2
    countHi("hi") → 1
    */
    public static int countHi(String str)
    {
        if (str.length() < 2)
            return 0;
        else if (str.substring(0, 2).equals("hi"))
            return 1 + countHi(str.substring(1));
        else
            return countHi(str.substring(1));
    }

    /*
    Given a string, compute recursively (no loops) a new string where all the lower case 'x' 
    chars have been changed to 'y' chars. 

    changeXY("codex") → "codey"
    changeXY("xxhixx") → "yyhiyy"
    changeXY("xhixhix") → "yhiyhiy"
    */
    public static String changeXY(String str)
    {
        if (str.length() == 0)
            return "";
        else if (str.charAt(0) == 'x')
            return "y" + changeXY(str.substring(1));
        else
            return str.charAt(0) + changeXY(str.substring(1));

    }

    /*
    Given a String, compute recursively (no loops) a new String where all appearances of "pi" 
    have been replaced by "3.14". 

    changePi("xpix") → "x3.14x"
    changePi("pipi") → "3.143.14"
    changePi("pip") → "3.14p"
    */
    public static String changePi(String str)
    {
        if (str.length() < 2)
            return str;
        else if (str.substring(0, 2).equals("pi"))
            return "3.14" + changePi(str.substring(2));
        else
            return str.substring(0,1) + changePi(str.substring(1));
    }

    /*        
    Given a String, compute recursively a new String where all the 'x' chars have been removed.

    noX("xaxb") → "ab"
    noX("abc") → "abc"
    noX("xx") → ""
    */
    public static String noX(String str)
    {
        if (str.length() < 1)
            return str;
        else if (str.charAt(0) == 'x')
            return noX(str.substring(1));
        else
            return str.charAt(0) + noX(str.substring(1));
    }

    /*
    Given an array of ints, compute recursively if the array contains a 6. We'll use the 
    convention of considering only the part of the array that begins at the given index. 
    In this way, a recursive call can pass index+1 to move down the array. The initial 
    call will pass in index as 0. 

    array6({1, 6, 4}, 0) → true
    array6({1, 4}, 0) → false
    array6({6}, 0) → true
    */
    public static boolean array6(int[] nums, int index)
    {
        if (nums.length == 0)
            return false;
        else if (nums.length <= index)
            return false;
        else if (nums[index] == 6)
            return true;
        else
            return array6(nums, index + 1);
    }

    /*
    Given an array of ints, compute recursively the number of times that the value 11 appears 
    in the array. We'll use the convention of considering only the part of the array that begins 
    at the given index. In this way, a recursive call can pass index+1 to move down the array. 
    The initial call will pass in index as 0. 

    array11({1, 2, 11}, 0) → 1
    array11({11, 11}, 0) → 2
    array11({1, 2, 3, 4}, 0) → 0
    */
    public static int array11(int[] nums, int index)
    {
        if (nums.length == 0 || nums.length <= index)
            return 0;
        else if (nums[index] == 11)
            return 1 + array11(nums, index + 1);
        else
            return array11(nums, index + 1);
    }

    /*
    Given an array of ints, compute recursively if the array contains somewhere a value followed 
    immediately by that value times 10. We'll use the convention of considering only the part of 
    the array that begins at the given index. In this way, a recursive call can pass index+1 to 
    move down the array. The initial call will pass in index as 0. 

    array220({1, 2, 20}, 0) → true
    array220({3, 30}, 0) → true
    array220({3}, 0) → false
    */
    public static boolean array220(int[] nums, int index)
    {
        if (nums.length < 2)
            return false;
        else if (nums[index] * 10 == nums[index + 1])
            return true;
        else
            return array220(nums, index + 1);
    }

    /*
    Given a String, compute recursively a new String where all the adjacent chars are now separated 
    by a "*". 

    allStar("hello") → "h*e*l*l*o"
    allStar("abc") → "a*b*c"
    allStar("ab") → "a*b"
    */

    public static String allStar(String str)
    {
        if (str == null || str.length() == 1)
            return str;
        else
            return str.charAt(0) + "*" + allStar(str.substring(1));
    }

    /*
    Given a String, compute recursively a new String where identical chars that are adjacent in 
    the original String are separated from each other by a "*". 

    pairStar("hello") → "hel*lo"
    pairStar("xxyy") → "x*xy*y"
    pairStar("aaaa") → "a*a*a*a"
    */
    public static String pairStar(String str)
    {
        if (str == null || str.length() == 1)
            return str;
        else if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        else
            return str.charAt(0) + pairStar(str.substring(1));

    }

    /*
    Given a String, compute recursively a new String where all the lowercase 'x' chars have been 
    moved to the end of the String. 

    endX("xxre") → "rexx"
    endX("xxhixx") → "hixxxx"
    endX("xhixhix") → "hihixxx"
    */
    public static String endX(String str)
    {
        if (str == null || str.length() == 0)
            return str;
        else if (str.charAt(0) == 'x')
            return endX(str.substring(1)) + 'x';
        else
            return str.charAt(0) + endX(str.substring(1));
    }

    /*
    We'll say that a "pair" in a String is two instances of a char separated by a char. So "AxA" 
    the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. 
    Recursively compute the number of pairs in the given String. 

    countPairs("axa") → 1
    countPairs("axax") → 2
    countPairs("axbx") → 1
    */
    public static int countPairs(String str)
    {
        if (str == null || str.length() < 3)
            return 0;
        else if (str.charAt(0) == str.charAt(2))
            return 1 + countPairs(str.substring(1));
        else
            return countPairs(str.substring(1));
    }


    /*        
    Count recursively the total number of "abc" and "aba" subStrings that appear in the given String. 

    countAbc("abc") → 1
    countAbc("abcxxabc") → 2
    countAbc("abaxxaba") → 2
    */
    public static int countAbc(String str)
    {
        if (str == null || str.length() < 3)
            return 0;
        else if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba"))
            return 1 + countAbc(str.substring(1));
        else
            return countAbc(str.substring(1));
    }

    /*
    Given a String, compute recursively (no loops) the number of "11" subStrings in the String. 
    The "11" subStrings should not overlap. 

    count11("11abc11") → 2
    count11("abc11x11x11") → 3
    count11("111") → 1
    */
    public static int count11(String str)
    {
        if (str == null || str.length() < 2)
            return 0;
        else if (str.substring(0, 2).equals("11"))
            return 1 + count11(str.substring(2));
        else
            return count11(str.substring(1));
    }

    /*
    Given a String, return recursively a "cleaned" String where adjacent chars that are the same 
    have been reduced to a single char. So "yyzzza" yields "yza". 

    StringClean("yyzzza") → "yza"
    StringClean("abbbcdd") → "abcd"
    StringClean("Hello") → "Helo"
    */
    public static String StringClean(String str)
    {
        if (str == null || str.length() < 2)
            return str;
        else if (str.charAt(0) == str.charAt(1))
            return StringClean(str.substring(1));
        else
            return str.charAt(0) + StringClean(str.substring(1));
    }

    /*
    Given a String, compute recursively the number of times lowercase "hi" appears in the String, 
    however do not count "hi" that have an 'x' immedately before them. 

    countHi2("ahixhi") → 1
    countHi2("ahibhi") → 2
    countHi2("xhixhi") → 0
    */
    public static int countHi2(String str)
    {
        if (str == null || str.length() < 2)
            return 0;
        else if (str.length() == 2)
            if (str.equals("hi"))
                return 1;
            else
                return 0;
        else if (str.charAt(0) == 'x')
            return countHi2(str.substring(2));
        else if (str.substring(0,2).equals("hi"))
            return 1 + countHi2(str.substring(2));
        else
            return countHi2(str.substring(1));
    }

    /*
    Given a String that contains a single pair of parenthesis, compute recursively a new String 
    made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)". 

    parenBit("xyz(abc)123") → "(abc)"
    parenBit("x(hello)") → "(hello)"
    parenBit("(xy)1") → "(xy)"
    */
    public static String parenBit(String str)
    {
        if (str == null || str.length() < 2)
            return "";
        else if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
            return str;
        else if (str.charAt(0) == '(')
            return parenBit(str.substring(0, str.length() - 1));
        else if (str.charAt(str.length() - 1) == ')')
            return parenBit(str.substring(1));
        else
            return parenBit(str.substring(1, str.length() - 1));
    }

    /*
    Given a String, return true if it is a nesting of zero or more pairs of parenthesis, 
    like "(())" or "((()))". Suggestion: check the first and last chars, and then recur 
    on what's inside them.

    nestParen("(())") → true
    nestParen("((()))") → true
    nestParen("(((x))") → false
    nestParen("((())") → false
    nestParen("((()()") → false
    nestParen("()") → true
    nestParen("") → true
    nestParen("(yy)") → false
    nestParen("(())") → true
    nestParen("(((y))") → false
    nestParen("((y)))") → false
    nestParen("((()))") → true
    nestParen("(())))") → false
    nestParen("((yy())))") → false
    nestParen("(((())))") → true
    */
    public static boolean nestParen(String str)
    {
        if (str == null || str.length() == 0)
            return true;
        else if (str.length() == 1)
            return false;
        else
        {
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);

            if (start != '(' || end != ')')
                return false;
            else
                return nestParen(str.substring(1, str.length() - 2));
        }
    }

    /*        
    Given a String and a non-empty subString sub, compute recursively the number of times that 
    sub appears in the String, without the sub Strings overlapping. 

    strCount("catcowcat", "cat") → 2
    strCount("catcowcat", "cow") → 1
    strCount("catcowcat", "dog") → 0
    */
    public static int strCount(String str, String sub)
    {
        if (str == null || sub == null)
            return 0;
        else if (str.length() < sub.length())
            return 0;
        else if (str.substring(0, sub.length()).equals(sub))
            return 1 + strCount(str.substring(sub.length()), sub);
        else
            return strCount(str.substring(1), sub);
    }


    /*
    Given a String and a non-empty subString sub, compute recursively if at least n copies of 
    sub appear in the String somewhere, possibly with overlapping. N will be non-negative. 

    strCopies("catcowcat", "cat", 2) → true
    strCopies("catcowcat", "cow", 2) → false
    strCopies("catcowcat", "cow", 1) → true
    */
    public static boolean strCopies(String str, String sub, int n)
    {
        if (n == 0)
            return true;
        else if (str == null || sub == null)
            return false;
        else if (str.length() < sub.length())
            return false;
        else if (str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(sub.length()), sub, n - 1);
        else
            return strCopies(str.substring(1), sub, n);
    }

    /*      
    Given a String and a non-empty subString sub, compute recursively the largest subString 
    which starts and ends with sub and return its length. 

    strDist("catcowcat", "cat") → 9
    strDist("catcowcat", "cow") → 3
    strDist("cccatcowcatxx", "cat") → 9
    */
    public static int strDist(String str, String sub)
    {
        if (str == null || sub == null)
            return 0;
        else if (str.length() < sub.length())
            return 0;
        else if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub))
            return str.length();
        else if (str.substring(0, sub.length()).equals(sub))
            return strDist(str.substring(0, str.length() - 1), sub);
        else if (str.substring(str.length() - sub.length()).equals(sub))
            return strDist(str.substring(1), sub);
        else 
            return strDist(str.substring(1, str.length() - 1), sub);
    }
	
}
