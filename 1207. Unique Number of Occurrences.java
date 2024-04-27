class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> n = new ArrayList();

           int c = 0 ;
        for (int i = 0; i < arr.length; i++) {
            
                if (!n.contains(arr[i])) {
                    n.add(arr[i]);
                }
            
        }
        for (int i = 0; i < n.size(); i++) {
            c=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==n.get(i)) {
                    c++;
                }
            }
            n.set(i,  c);
        }
          for (int i = 0; i < n.size(); i++) {
              for (int j = i+1; j < n.size(); j++) {
                  if (n.get(i)==n.get(j)) {
                      return false;
                  }
              }
          }
        
         
          return true;
    }
}
