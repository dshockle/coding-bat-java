package codingbat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Interview1 {

	public static void main(String[] args) {
        System.out.println("isPalindrome");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama!") == true);

        System.out.println("isPalindrome2");
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama!") == true);

        System.out.println("isPalindromeLambda");
        System.out.println(isPalindromeLambda("A man, a plan, a canal: Panama!") == true);

        System.out.println("countLetters");
        System.out.println(countLetters("The quick brown fox jumped over the lazy dogs."));

        System.out.println("countWords");
        System.out.println(countWords("This is fun and this is easy"));

	}

    /*
    System.out.println("isPalindrome");
    System.out.println("Is it a palindrome ignoring punctuation and case.");
    System.out.println(isPalindrome("A man, a plan, a canal: panama!") == true);
    */
    public static boolean isPalindrome(String word)
    {
        StringBuilder sb = new StringBuilder();
        char[] letters = word.trim().toLowerCase().toCharArray();
        
        for (char c : letters)
        {
            if (Character.isLetterOrDigit(c))
                sb.append(c);
        }
        
        for (int i = 0; i < sb.length() / 2; i++)
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i))
                return false;

        return true;
    }

    /*
    System.out.println("isPalindrome");
    System.out.println("Is it a palindrome ignoring punctuation and case.");
    System.out.println(isPalindrome("A man, a plan, a canal: panama!") == true);
    */
    public static boolean isPalindrome2(String word)
    {
        char[] letters = word.trim().toLowerCase().toCharArray();
        int i = 0;
        int j = letters.length - 1;
        
        while (i < j){
        	
        	while(!Character.isLetterOrDigit(letters[i]) && i < j)
        		i++;
        	
        	while(!Character.isLetterOrDigit(letters[j]) && i < j)
        		j--;

        	if (letters[i++] != letters[j--])
        		return false;
        }

        return true;
    }    
    
    /*
    System.out.println("isPalindrome");
    System.out.println("Is it a palindrome ignoring punctuation and case.");
    System.out.println(isPalindromeLambda("A man, a plan, a canal: panama!") == true);
    Use Lambda. Do not use loops.
    */
    public static boolean isPalindromeLambda(String word)
    {
    	/*
        char[] chars = word.toLowerCaseCase().Trim()
                .Where(c => Char.IsLetterOrDigit(c))
                .ToArray();

        return chars.SequenceEqual(chars.Reverse());
        */
    	return false;
    }

    /*
    System.out.println("countLetters");
    System.out.println("Count times each letter appears in String");
    System.out.println(countLetters("The quick brown fox jumped over the lazy dogs."));
    */
    public static String countLetters(String sentence)
    {
        HashMap<Character, Integer> counts = new HashMap<>();
        char[] letters = sentence.trim().toLowerCase().toCharArray();
        
        for (char ch : letters)
        {
            if (Character.isLetterOrDigit(ch))
            {
                if (counts.containsKey(ch)){
                	int val = counts.get(ch);
                	counts.put(ch, val+1);
                }
                else
                    counts.put(ch, 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        List<Character> list = new ArrayList<>(counts.keySet());
        Collections.sort(list);

        for (char k : list)
            sb.append(k + " : " + counts.get(k) + "\n");

        return sb.toString();
    }

    /*
    System.out.println("countWords");
    System.out.println("Count times each word appears in String");
    System.out.println(countWords("This is fun and this is easy"));
    */
    public static String countWords(String sentence)
    {
    	HashMap<String, Integer> counts = new HashMap<String, Integer>();
        String[] rawlist = sentence.toLowerCase().trim().split(" ");
        /*
        var rawlist = sentence
                      .toLowerCase().Trim().Split()
                      .Select(word => word.Trim())
                      .Where(word => !String.IsNullOrEmpty(word));
        */
        for (String word : rawlist)
        {
            if (counts.containsKey(word)){
            	int val = counts.get(word);
            	counts.put(word, val+1);
            }
            else
                counts.put(word, 1);
        }

        StringBuilder sb = new StringBuilder();

        List<String> list = new ArrayList<>(counts.keySet());
        Collections.sort(list);

        for (String k : list)
            sb.append(k + " : " + counts.get(k) + "\n");

        return sb.toString();

    }	
}
