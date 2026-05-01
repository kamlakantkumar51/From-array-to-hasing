class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class pathsum{
    static void rootToLeafSum(Node root,int sum){
        if(root == null){
            return;
        }
        sum += root.data;
        if(root.left == null && root.right == null){
            System.out.println(sum);
            return;
        }
        rootToLeafSum(root.left, sum);
        rootToLeafSum(root.right, sum);
    }
    public static void main(String args[]){
         Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(10);

        rootToLeafSum(root, 0);
    }
}