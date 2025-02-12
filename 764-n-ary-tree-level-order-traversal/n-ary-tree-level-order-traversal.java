/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        if(root==null) return output;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        li.add(root.val);
        output.add(li);
        li=new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                for(Node child:curr.children){
                    li.add(child.val);
                    queue.offer(child);
                }
            }
            if(li.size()!=0) output.add(li);
            li=new ArrayList<>();
        }
        return output;
    }
}