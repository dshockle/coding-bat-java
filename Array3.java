package codingbat;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Array3 {

	public static void main(String[] args) {
		/*
        System.out.println("maxSpan");
        System.out.println(maxSpan(new int[] { 1, 2, 1, 1, 3 }) == 4);
        System.out.println(maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4}) == 6);
        System.out.println(maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4}) == 6);
        
        System.out.println("maxSpanOldSchool");
        System.out.println(maxSpanOldSchool(new int[] { 1, 2, 1, 1, 3 }) == 4);
        System.out.println(maxSpanOldSchool(new int[] { 1, 4, 2, 1, 4, 1, 4}) == 6);
        System.out.println(maxSpanOldSchool(new int[] { 1, 4, 2, 1, 4, 4, 4}) == 6);
        
        System.out.println("maxSpanLambda");
        System.out.println(maxSpanLambda(new int[] { 1, 2, 1, 1, 3 }) == 4);
        System.out.println(maxSpanLambda(new int[] { 1, 4, 2, 1, 4, 1, 4 }) == 6);
        System.out.println(maxSpanLambda(new int[] { 1, 4, 2, 1, 4, 4, 4 }) == 6);
        
        System.out.println("fix34");
        System.out.println(Arrays.equals(fix34(new int[] { 1, 3, 1, 4 }), new int[] { 1, 3, 4, 1 }));
        System.out.println(Arrays.equals(fix34(new int[] { 1, 3, 1, 4, 4, 3, 1}), new int[] { 1, 3, 4, 1, 1, 3, 4}));
        System.out.println(Arrays.equals(fix34(new int[] { 3, 2, 2, 4}), new int[] { 3, 4, 2, 2}));

        System.out.println("fix45");
        System.out.println(Arrays.equals(fix45(new int[] { 5, 4, 9, 4, 9, 5}), new int[] { 9, 4, 5, 4, 5, 9}));
        System.out.println(Arrays.equals(fix45(new int[] { 1, 4, 1, 5}), new int[] { 1, 4, 5, 1}));
        System.out.println(Arrays.equals(fix45(new int[] { 1, 4, 1, 5, 5, 4, 1}), new int[] { 1, 4, 5, 1, 1, 4, 5}));
        
        System.out.println("canBalance");
        System.out.println(canBalance(new int[] { 1, 1, 1, 2, 1}) == true);
        System.out.println(canBalance(new int[] { 2, 1, 1, 2, 1}) == false);
        System.out.println(canBalance(new int[] { 10, 10}) == true);
        */
        System.out.println("linearInOldSchool");
        System.out.println(linearInOldSchool(new int[] { 1, 2, 4, 6}, new int[] { 2, 4}) == true);
        System.out.println(linearInOldSchool(new int[] { 1, 2, 4, 6}, new int[] { 2, 3, 4}) == false);
        System.out.println(linearInOldSchool(new int[] { 1, 2, 4, 4, 6}, new int[] { 2, 4}) == true);

        System.out.println("linearInLambda");
        System.out.println(linearInLambda(new int[] { 1, 2, 4, 6 }, new int[] { 2, 4 }) == true);
        System.out.println(linearInLambda(new int[] { 1, 2, 4, 6 }, new int[] { 2, 3, 4 }) == false);
        System.out.println(linearInLambda(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }) == true);
        
        System.out.println("squareUp");
        System.out.println(Arrays.equals(squareUp(3), new int[] { 0, 0, 1, 0, 2, 1, 3, 2, 1 }));
        System.out.println(Arrays.equals(squareUp(2), new int[] { 0, 1, 2, 1}));
        System.out.println(Arrays.equals(squareUp(4), new int[] { 0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}));
        
        System.out.println("seriesUp");
        System.out.println(Arrays.equals(seriesUp(3), new int[] { 1, 1, 2, 1, 2, 3}));
        System.out.println(Arrays.equals(seriesUp(4), new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(Arrays.equals(seriesUp(2), new int[] { 1, 1, 2}));

        System.out.println("maxMirror");
        System.out.println(maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 }) == 3);
        System.out.println(maxMirror(new int[] { 1, 2, 1, 4}) == 3);
        System.out.println(maxMirror(new int[] { 7, 1, 2, 9, 7, 2, 1}) == 2);
		
        System.out.println("countClumps");
        System.out.println(countClumps(new int[] { 1, 2, 2, 3, 4, 4 }) == 2);
        System.out.println(countClumps(new int[] { 1, 1, 2, 1, 1}) == 2);
        System.out.println(countClumps(new int[] { 1, 1, 1, 1, 1}) == 1);

        System.out.println("countClumpsLambda");
        System.out.println(countClumpsLambda(new int[] { 1, 2, 2, 3, 4, 4 }) == 2);
        System.out.println(countClumpsLambda(new int[] { 1, 1, 2, 1, 1 }) == 2);
        System.out.println(countClumpsLambda(new int[] { 1, 1, 1, 1, 1 }) == 1);
        
	}

    /*
    Consider the leftmost and rightmost appearances of some value in an array. 
    We'll say that the "span" is the number of elements between the two inclusive. 
    A single value has a span of 1. Returns the largest span found in the given array. 

    maxSpan({1, 2, 1, 1, 3}) → 4
    maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
    maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
    */
    public static int maxSpan(int[] nums)
    {
        int max = 0;
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<Integer>();
        
        for (Integer n : list)
        {
        	if (!set.contains(n)){
        		set.add(n);
                int left = list.indexOf(n);
                int right = list.lastIndexOf(n);
                int span = 1 + right - left;

                if (span > max)
                    max = span;
        	}
        }
        return max;
    }

    /*
    Consider the leftmost and rightmost appearances of some value in an array. 
    We'll say that the "span" is the number of elements between the two inclusive. 
    A single value has a span of 1. Returns the largest span found in the given array.
    Use 'Old School' programming techniques. Do not use features added in java 8.

    maxSpanOldSchool({1, 2, 1, 1, 3}) → 4
    maxSpanOldSchool({1, 4, 2, 1, 4, 1, 4}) → 6
    maxSpanOldSchool({1, 4, 2, 1, 4, 4, 4}) → 6
    */
    public static int maxSpanOldSchool(int[] nums)
    {
        int max = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
        	if (!set.contains(nums[i])){
        		set.add(nums[i]);
        		
            	for(int j = nums.length-1; j >= i + max; j--){
            		if (nums[i] == nums[j])
           				max = 1 + j - i;
        		}
        	}
        }
        return max;
    }
    
    /*
    Consider the leftmost and rightmost appearances of some value in an array. 
    We'll say that the "span" is the number of elements between the two inclusive. 
    A single value has a span of 1. Returns the largest span found in the given array. 
    Use Lambda. Do not use loops.
    maxSpan({1, 2, 1, 1, 3}) → 4
    maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
    maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
    */
    public static int maxSpanLambda(int[] nums)
    {
    	/*
        return nums
              .Select((val) =>
              1 + Array.LastIndexOf<int>(nums, val)
              - Array.IndexOf<int>(nums, val))
              .Max();
    	 */
    	return 0;
    }

    /*
    Return an array that contains exactly the same numbers as the given array, 
    but rearranged so that every 3 is immediately followed by a 4. 
    Do not move the 3's, but every other number may move. 
    The array contains the same number of 3's and 4's, every 3 has a number 
    after it that is not a 3 or 4, and a 3 appears in the array before any 4. 

    fix34({1, 3, 1, 4}) → {1, 3, 4, 1}
    fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}
    fix34({3, 2, 2, 4}) → {3, 4, 2, 2}
    */
    public static int[] fix34(int[] nums)
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 3 && nums[i + 1] != 4)
            {
                for(int j = 0; j < nums.length; j++)
                {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3))
                    {
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 4;
                    }
                }
            }
        }
        return nums;
    }

    /*
    (This is a slightly harder version of the fix34 problem.) 
    Return an array that contains exactly the same numbers as the given array, 
    but rearranged so that every 4 is immediately followed by a 5. 
    Do not move the 4's, but every other number may move. 
    The array contains the same number of 4's and 5's, and every 4 has a number 
    after it that is not a 4. In this version, 5's may appear anywhere in the 
    original array. 

    fix45({5, 4, 9, 4, 9, 5}) → {9, 4, 5, 4, 5, 9}
    fix45({1, 4, 1, 5}) → {1, 4, 5, 1}
    fix45({1, 4, 1, 5, 5, 4, 1}) → {1, 4, 5, 1, 1, 4, 5}
    */
    public static int[] fix45(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == 4 && nums[i + 1] != 5)
            {
                for (int j = 0; j < nums.length; j++)
                {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4))
                    {
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 5;
                    }
                }
            }
        }
        return nums;
    }

    /*
    Given a non-empty array, return true if there is a place to split the array 
    so that the sum of the numbers on one side is equal to the sum of the numbers 
    on the other side. 

    canBalance({1, 1, 1, 2, 1}) → true
    canBalance({2, 1, 1, 2, 1}) → false
    canBalance({10, 10}) → true
    */
    public static boolean canBalance(int[] nums)
    {
        if (nums == null || nums.length < 2)
            return false;

        int pos = 0;
        int left = nums[pos];
        int sum = (int)Arrays.stream(nums).sum();
        int right = sum - nums[pos];

        while (left <= right && pos < nums.length)
        {
            if (left == right)
                return true;
            else 
            {
                pos++;
                left += nums[pos];
                right -= nums[pos];
            }
        }
        return false;
    }

    /*
    Given two arrays of ints sorted in increasing order, outer and inner, 
    return true if all of the numbers in inner appear in outer. The best 
    solution makes only a single "linear" pass of both arrays, taking 
    advantage of the fact that both arrays are already in sorted order. 
	Use 'Old School' programming techniques. Do not use features added in java 8.
	
    linearInOldSchool({1, 2, 4, 6}, {2, 4}) → true
    linearInOldSchool({1, 2, 4, 6}, {2, 3, 4}) → false
    linearInOldSchool({1, 2, 4, 4, 6}, {2, 4}) → true
    */
    public static boolean linearInOldSchool(int[] outer, int[] inner)
    {
    	int i = 0;
    	int j = 0;
    	
   		while (i < inner.length && j < outer.length){
   			
   			if (inner[i] == outer[j]){
   				if (i == 0 || j == 0 || inner[i-1] == outer[j-1]){
   	   				i++;
   	   				j++;
   				}
   				else
   					return false;
   			}
   			else if (inner[i] < outer[j]){
   				if (i == 0 || j == 0 || inner[i-1] < outer[j-1])
   	   				i++;
   				else
   					return false;
   			}
   			else { 
   				if (i == 0 || j == 0 || inner[i-1] > outer[j-1])
   	   				j++;
   				else 
   					return false;
   			}
    	}

   		return i == inner.length;
    }

    /*
    Given two arrays of ints sorted in increasing order, outer and inner, 
    return true if all of the numbers in inner appear in outer. The best 
    solution makes only a single "linear" pass of both arrays, taking 
    advantage of the fact that both arrays are already in sorted order. 
    Use Lambda. Do not use loops.
    linearInLambda({1, 2, 4, 6}, {2, 4}) → true
    linearInLambda({1, 2, 4, 6}, {2, 3, 4}) → false
    linearInLambda({1, 2, 4, 4, 6}, {2, 4}) → true
    */
    public static boolean linearInLambda(int[] outer, int[] inner)
    {
        List<Integer> outerList = IntStream.of(outer).boxed().collect(Collectors.toList());
        List<Integer> innerList = IntStream.of(inner).boxed().collect(Collectors.toList());
        return innerList.stream().allMatch((e) -> outerList.contains(e));
    }

    /*
    Given n >= 0, create an array length n * n with the following pattern, 
    shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} 
    (spaces added to show the 3 groups). 

    squareUp(3) → {0, 0, 1, 0, 2, 1, 3, 2, 1}
    squareUp(2) → {0, 1, 2, 1}
    squareUp(4) → {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}
    */
    public static int[] squareUp(int n)
    {
        int[] result = new int[n * n];
        int limit = n;
        int pos = result.length - 1;
        int val = 1;

        while (pos >= 0)
        {
            //result[pos] = val <= limit ? val : 0;
        	if (val <= limit)
        		result[pos] = val;
        	
            pos--;
            val++;

            if (val > n)
            {
                val = 1;
                limit--;
            }
        }
        
        return result;
    }

    /*
    Given n >= 0, create an array with the pattern 
    {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping). 
    Note that the length of the array will be n*(n + 1)/2. 

    seriesUp(3) → {1, 1, 2, 1, 2, 3}
    seriesUp(4) → {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}
    seriesUp(2) → {1, 1, 2}
    */

    public static int[] seriesUp(int n)
    {
        int[] result = new int[n * (n + 1) / 2];
        int limit = 1;
        int val = 1;

        for(int i = 0; i < result.length; i++)
        {
            result[i] = val++;
            
            if (val > limit)
            {
                val = 1;
                limit++;
            }
        }

        return result;
    }

    /*
    We'll say that a "mirror" section in an array is a group of contiguous elements 
    such that somewhere in the array, the same group appears in reverse order. 
    For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} 
    is length 3 (the {1, 2, 3} part). Return the size of the largest mirror section 
    found in the given array. 

    maxMirror({1, 2, 3, 8, 9, 3, 2, 1}) → 3
    maxMirror({1, 2, 1, 4}) → 3
    maxMirror({7, 1, 2, 9, 7, 2, 1}) → 2
    */
    public static int maxMirror(int[] nums)
    {
        int max = 0;
        
        for(int i = 0; i < nums.length - 1; i++)
        {
            for (int j = nums.length - 1; j > i; j--)
            {
                if (nums[i] == nums[j])
                {
                    int left = i;
                    int right = j;
                    int span = 0;

                    while (nums[left] == nums[right] && left < nums.length && right > 0)
                    {
                        span++;
                        left++;
                        right--;
                    }

                    if (left >= right)
                        span++;

                    if (span > max)
                        max = span;
                }
            }
        }
        return max;
    }

    /*
    Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
    Return the number of clumps in the given array. 

    countClumps({1, 2, 2, 3, 4, 4}) → 2
    countClumps({1, 1, 2, 1, 1}) → 2
    countClumps({1, 1, 1, 1, 1}) → 1
    */
    public static int countClumps(int[] nums)
    {
        int count = 0;
        boolean inClump = false;

        for(int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
            {
                if (!inClump)
                {
                    count++;
                    inClump = true;
                }
            }
            else
                inClump = false;
        }
        return count;
    }

    /*
    Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
    Return the number of clumps in the given array. Use Lambda. Do not use loops.

    countClumpsLambda({1, 2, 2, 3, 4, 4}) → 2
    countClumpsLambda({1, 1, 2, 1, 1}) → 2
    countClumpsLambda({1, 1, 1, 1, 1}) → 1
    */
    public static int countClumpsLambda(int[] nums)
    {
    	/*
        return nums.Skip(1)
                   .Where((value, index) => value == nums[index + 1] && value != nums[index])
                   .Count();
    	 */
    	return 0;
    }
}
