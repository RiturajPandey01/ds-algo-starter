package array;
import java.util.*;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */

public class FirstUniqueChar {
    static int firstUniqueChar(String s) {
    	HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        char[] arr=s.toCharArray();
        for(char c : arr)
        {
            if(freqMap.containsKey(c))
                freqMap.put(c,freqMap.get(c)+1);
            else
                freqMap.put(c,1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(freqMap.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
    public static void main(String ar[]) {
    	Scanner S=new Scanner(System.in);
    	System.out.println("Enter a string");
    	String s=S.next();
    	System.out.println("First unique occurance is at position "+ firstUniqueChar(s));
    }
}