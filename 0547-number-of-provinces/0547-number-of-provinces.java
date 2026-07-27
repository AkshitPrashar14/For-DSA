class Solution {
    void dfs(int nbr,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[nbr]=1;
        for(int i:adj.get(nbr)){
            if(vis[i]==0)dfs(i,vis,adj);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        int[] vis=new int[n];
        Arrays.fill(vis,0);
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,vis,adj);
                count++;
            }
        }
        return count;
    }
}