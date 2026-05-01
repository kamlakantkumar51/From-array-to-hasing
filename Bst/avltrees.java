
public class avltrees {

    static class Node {

        int key, height;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.height = 1;
        }
    }
    Node root;

    //height
    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    //max
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    //balance factor
    int getBalance(Node node) {
        return height(node.left) - height(node.right);
    }

    //right rotation
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    //left rotation
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    //insertion
    Node insert(Node node, int key) {
        // Normal BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }

        //height updation
        node.height = 1 + max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalance(node);

        // LL Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // RR Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // LR Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // ---------------- MIN VALUE NODE ----------------
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // ---------------- DELETE ----------------
    Node deleteNode(Node root, int key) {
        // Normal BST delete
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteNode(root.left, key); 
        }else if (key > root.key) {
            root.right = deleteNode(root.right, key); 
        }else {
            // Node with one child or no child
            if ((root.left == null) || (root.right == null)) {
                Node temp = null;

                if (root.left != null) {
                    temp = root.left; 
                }else {
                    temp = root.right;
                }

                // No child case
                if (temp == null) {
                    temp = root;
                    root = null;
                } else {
                    // One child case
                    root = temp;
                }
            } else {
                // Node with two children
                Node temp = minValueNode(root.right);

                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }

        // If tree had only one node
        if (root == null) {
            return root;
        }

        // Update height
        root.height = 1 + max(height(root.left), height(root.right));

        // Get balance factor
        int balance = getBalance(root);

        // LL Case
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // LR Case
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR Case
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // RL Case
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    // ---------------- INORDER ----------------
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    // ---------------- PREORDER ----------------
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void main(String args[]) {
        avltrees tree = new avltrees();
        //insertion
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        System.out.println("Preorder traversal after insertion:");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal after insertion:");
        tree.inorder(tree.root);
        //deletion
        tree.root = tree.deleteNode(tree.root, 40);

        System.out.println("\n\nPreorder traversal after deletion of 40:");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal after deletion of 40:");
        tree.inorder(tree.root);
    }
}
