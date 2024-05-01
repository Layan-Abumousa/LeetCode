class Solution {
    public void find(List<String> ans,String s,int n,int o,int c){
        if(o > n || c > o ||  s.length() > 2*n)return;
        if(o == n && c == n && s.length() == 2*n){
            ans.add(s);
        }
        find(ans,s+"(",n,o+1,c);
        find(ans,s+")",n,o,c+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        find(ans,"",n,0,0);
        return ans;
    }
}
