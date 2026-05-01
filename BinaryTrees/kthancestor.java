//kth ancestor of a node
public class kthancestor {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int ans = -1;
    public static int kthancestor(Node root,int target,int k){
        if(root == null){
            return -1;
        }
        if(root.data == target){
            return 1;
        }
        int left = kthancestor(root.left,target,k);
        int right = kthancestor(root.right,target,k);

        if(left == -1 && right == -1){
            return -1;
        }
        int dist = Math.max(left,right);
        if(dist == k){
            ans = root.data;
            return -1;
        }
        return dist+1;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        int k = 2;
        int target = 5;

        kthancestor(root, target, k);
        System.out.println(ans);
    }
}
