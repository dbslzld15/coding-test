package codingtest.inflearn.dfs;

public class Tree말단노드까지가장짧은경로 {
    Node root;
    public void initTree() {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        dfs(0, root);
    }


    public int dfs(int L, Node root) {
        if(root.lt == null && root.rt == null) return L;
        else return Math.min(dfs(L+1, root.lt), dfs(L+1, root.rt));
    }

    static class Node{
        int data;
        Node lt;
        Node rt;

        Node(int val){
            data = val;
            lt=rt=null;
        }
    }
}
