//lowest common ancestors
public class Lca {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root,int n1,int n2){
        if(root == null){
            //System.out.println("lca does not exist");
            return null;
        }
        if(root.data == n1 || root.data == n2){
            //System.out.println("lca "+root.data);
            return root;
        }
        Node leftLca = lca(root.left,n1,n2);
        Node rightLca = lca(root.right,n1,n2);

        if(leftLca != null && rightLca != null){
            return root;
        }

        if(leftLca != null){
            return leftLca;
        }else{
            return rightLca;
        }

    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4,n2 = 5;

        Node lca = lca(root,n1,n2);
        if(lca != null){
            System.out.println("LCA of "+n1+" and "+n2+" is "+lca.data);
        }
        else{
            System.out.println("LCA does not exist");
        }
    }
}
