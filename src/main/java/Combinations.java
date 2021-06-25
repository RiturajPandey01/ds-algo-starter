package recursion_backtracking;
import java.util.*;

class Combinations {
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        ArrayList<Integer> temp = new ArrayList();
        backTrack(n, k, 1, list, temp);
        return list;
    }
    public void backTrack(int n, int k, int dep, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> temp) {
        if (temp.size() == k) {
            list.add(new ArrayList(temp));
            return;
        }
        for (int i = dep; i <= n - k + 1 + temp.size(); i++) {
            temp.add(i);
            backTrack(n, k, i + 1, list, temp);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String ar[]) {
    	Scanner S=new Scanner(System.in);
    	System.out.println("Enter the values of n and k");
    	int n=S.nextInt();
    	int k=S.nextInt();
    	ArrayList<ArrayList<Integer>> result=combine(n,k);
    }
}
