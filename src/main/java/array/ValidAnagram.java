package array;
import java.util.*;

/**
 * https://leetcode.com/problems/valid-anagram/
 */

public class ValidAnagram {
	static boolean isAnagram(String s, String t) {
    	HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        char[] sa=s.toCharArray();
        char[] ta=t.toCharArray();
        if(s.length()!=t.length())
            return false;
        for(char c : sa) {
            if(freqMap.containsKey(c))
                freqMap.put(c,freqMap.get(c)+1);
            else
                freqMap.put(c,1);
        }
        for(char c : ta) {
            if(freqMap.containsKey(c))
                freqMap.put(c,freqMap.get(c)-1);
            else
                freqMap.put(c,1);
        }
        for(int i=0;i<s.length();i++) {
            if(freqMap.get(s.charAt(i))>0)
                return false;
        }
        return true;
    }
	public static void main(String ar[]) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter two strings");
		String s=S.next();
		String t=S.next();
		if(isAnagram(s,t))
			System.out.println("Anagrams!");
		else
			System.out.println("Not Anagrams.");
	}
}