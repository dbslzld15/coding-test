package codingtest.inflearn.dfs;

public class 이진트리순회 {
    Node root;

    public void DFS(Node root) {
        if(root == null) return;
        else {
//            System.out.println(root.data + " "); 전위순회
            DFS(root.lt);
//            System.out.println(root.data + " "); 중위순회
            DFS(root.rt);
//            System.out.println(root.data + " "); 후위순회
        }
    }

    public void init() {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
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
