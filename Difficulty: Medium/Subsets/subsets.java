import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        check(0, arr, ans, res);

        return res;
    }

    public void check(int i, int arr[], ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> res) {

        if (i == arr.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        ans.add(arr[i]);
        check(i+1,arr,ans,res);

        ans.remove(ans.size()-1);

        check(i+1,arr,ans,res);
    }
}