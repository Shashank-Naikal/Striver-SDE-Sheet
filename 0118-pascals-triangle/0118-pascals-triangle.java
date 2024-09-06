class Solution {
    public int ncr(int n, int r){
        long num = 1, den=1;

        if (r > n - r) {
            r = n - r; // Since C(n, r) == C(n, n-r)
        }

		for(int i=0;i<r;i++){
		    num *= (n-i);
		    den *= (i+1);
		}
        return (int)(num/den);
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(ncr(i,j));
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}