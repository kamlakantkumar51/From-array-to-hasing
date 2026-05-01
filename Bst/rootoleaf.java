import java.util.*;
public class rootoleaf {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data = d;
            left = right = null;
        }
    }

    public static void rootToLeaf(Node root,List<Integer>path){
        if(root == null)return;
        //current data ko add karo
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        else{
            rootToLeaf(root.left, path);
            rootToLeaf(root.right, path);
        }
        //backtracking..
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        rootToLeaf(root, new ArrayList<>());
    }
}
