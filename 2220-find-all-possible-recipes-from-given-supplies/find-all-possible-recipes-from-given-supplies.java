class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String,List<String>> adjlist= new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<supplies.length;i++) set.add(supplies[i]);
        // for(int i=0;i<recipes.length;i++) adjlist.add(new ArrayList<>());
        HashMap<String,Integer> indegree = new HashMap<>();
        for(int i=0;i<recipes.length;i++){
            indegree.put(recipes[i],0);
            for(int j=0;j<ingredients.get(i).size();j++){
                String val=ingredients.get(i).get(j);
                if(!set.contains(val)){
                    adjlist.putIfAbsent(val, new ArrayList<>());
                    adjlist.get(val).add(recipes[i]);
                    if(!indegree.containsKey(recipes[i])) indegree.put(recipes[i],1);
                    else indegree.put(recipes[i],indegree.get(recipes[i])+1);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        for(int i=0;i<recipes.length;i++) if(indegree.get(recipes[i])==0) queue.offer(recipes[i]);
        while(!queue.isEmpty()){
            String val=queue.poll();
            ans.add(val);
            if(!adjlist.containsKey(val)) continue;
            for(int i=0;i<adjlist.get(val).size();i++){
                String var = adjlist.get(val).get(i);
                indegree.put(var,indegree.get(var)-1);
                if(indegree.get(var)==0) queue.offer(var);
            }
        }
        return ans;
    }
}