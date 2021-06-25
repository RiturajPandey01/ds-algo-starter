package recursion_backtracking;
import java.util.*;

class letterCombinationOfPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        ArrayList<String> dyn_array[] = new ArrayList[digits.length() + 1];
        ArrayList<String> list = new ArrayList<>();

        if(digits.length()==0){
            return list;
        }
        list.add("");
        dyn_array[0] = list;
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        for (int i = 1; i < dyn_array.length; i++) {
            ArrayList<String> sub_list = new ArrayList<>();
            ArrayList<String> got = dyn_array[i - 1];
            char ch = digits.charAt(i-1);
            String s = map.get(ch);
            for (int j = 0; j < s.length(); j++) {
                for (String each : got) {
                    String add = "";
                    add = each + s.charAt(j);
                    sub_list.add(add);
                }
            }
            dyn_array[i] = sub_list;
        }
        return dyn_array[dyn_array.length-1];
    }
    public static void main(String ar[]) {
    	Scanner S=new Scanner(System.in);
    	System.out.println("Enter a combination of digits from 2-9");
    	String digits=S.next();
    	List<String> result=letterCombinations(digits);
    	System.out.println(result);
    	
    }
}