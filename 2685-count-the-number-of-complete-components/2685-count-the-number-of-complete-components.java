class Solution {
    public static int nodes;
    static int edge;
    public static int dfs(int src,int[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[src]=1;
        nodes++;
        edge+=adj.get(src).size();
        for(int nbr:adj.get(src)){
            if(vis[nbr]==0){
                dfs(nbr,vis,adj);
            }
        }
        return edge;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        int[] visited=new int[n];
        Arrays.fill(visited,0);
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                nodes=0;
                edge=0;
                dfs(i,visited,adj);
                edge=edge/2;
                if(edge==(nodes*(nodes-1)/2)){
                    count++;
                }
            }
        }
        return count;
    }
}