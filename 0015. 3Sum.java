class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        int n = a.length;
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(a);

        for(int i = 0; i < n; i++){
            if(i != 0 && a[i] == a[i - 1]) continue;
            int j  = i + 1;
            int k = n - 1;
            while(j < k){
                int sum = a[i] + a[j] + a[k];
                if(sum < 0) { 
                    j++;
                } else if(sum > 0) {
                    k--;
                } else {
                    List<Integer> l = Arrays.asList(a[i], a[j], a[k]);
                    ls.add(l);
                    j++;
                    k--;
                    while(j < k && a[j] == a[j - 1]) j++;
                    while(j < k && a[k] == a[k + 1]) k--;
                }
            }
        }

        return ls;
    }
}
