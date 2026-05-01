package Bst;

public class search {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root == null) return null;

        if (val < root.data) {
            root.left = delete(root.left, val);
        } 
        else if (val > root.data) {
            root.right = delete(root.right, val);
        } 
        else {
            //case 1-leaf
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2--single child
            if (root.left == null) {
                return root.right;
            } 
            else if (root.right == null) {
                return root.left;
            }
            //case 3--both two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    //range sum
    public static int RangeSum(Node root,int k1,int k2){
        if(root == null){
            return 0;
        }
        if(root.data >= k1 && root.data <=k2 ){
            return root.data + RangeSum(root.left,k1,k2)+RangeSum(root.right,k1,k2);
        }
        else if(root.data < k1){
            return RangeSum(root.right,k1,k2);
        }else{
            return RangeSum(root.left,k1,k2);
        }

    }
    //range in bst
    public static void printInRange(Node root, int k1, int k2){
    if(root == null){
        return;
    }

    if(root.data >= k1 && root.data <= k2){
        printInRange(root.left, k1, k2);
        System.out.print(root.data + " ");
        printInRange(root.right, k1, k2);
    }
    else if(root.data < k1){
        printInRange(root.right, k1, k2);
    }
    else{
        printInRange(root.left, k1, k2);
    }
}

//range sum

    public static void main(String args[]) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.print("Inorder: ");
        inorder(root);

        System.out.println();

        if (search(root, 3)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        root = delete(root, 5);

        System.out.print("After Deleting 5: ");
        inorder(root);
        System.out.println();
        printInRange(root,1,4);

    
    }
}