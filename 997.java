class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 1) {
            return trust[0][1];
        }
        if (trust.length == 0 && n >=2) {
            return -1;
        } else if (trust.length == 0) return 1;
        
        int i = 0;
        int target = n-1;
        int ret = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (i = 1; i < n+1; ++i) {
            map.put(i,0);
        }
        System.out.println("teste");
        for (i = 1; i < trust.length+1; ++i){
            map.replace(trust[i-1][1],map.get(trust[i-1][1])+1);
            map.replace(trust[i-1][0],map.get(trust[i-1][0])-1);
            if (map.get(trust[i-1][1]) == target) {
                ret = trust[i-1][1];
            }
            //System.out.println(map.toString());
       }
        //System.out.println(ret);
       //System.out.println("ret = " + ret + "target = "+ target); 
       if (ret < 1 || map.get(ret) != target  ) {
           return -1;
       } 
       
       return ret;

    }
}
