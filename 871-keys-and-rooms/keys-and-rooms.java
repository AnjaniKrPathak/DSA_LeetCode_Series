class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Arrays.fill(visited,false);
        helper(0,rooms,visited);
       for (boolean v : visited) {
        if (!v) return false;
    }

    return true;
        
    }
    void helper(int node,List<List<Integer>>  adj, boolean[] visted){
        visted[node] = true;
        
        for(int curr: adj.get(node)){
            if(!visted[curr] ){
                helper(curr,adj,visted);
            }
        }
    }
}