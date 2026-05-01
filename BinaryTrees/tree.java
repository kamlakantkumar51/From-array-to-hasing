import java.util.*;
class tree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //build tree preorder 
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        //preorder traversal
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //inorder traversal
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        //postorder traversal
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        //level order traversal
        public List<List<Integer>>levelorder(Node root){
            List<List<Integer>> result = new ArrayList<>();
            if(root == null){
                return result;
            }
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> currlevel = new ArrayList<>();

                for(int i=0;i<size;i++){
                    Node currNode = q.poll();
                    currlevel.add(currNode.data);
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                    result.add(currlevel);
                }
            }
            return result;

        }
    }


    public static void main(String args[]){
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,-1};


        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        // //System.out.println(root.data);
        // System.out.print("preorder traversal:"+"");
        // tree.preOrder(root);

        // System.out.println();
        // System.out.print("\ninorder traversal:"+"");
        // tree.inOrder(root);

        // System.out.println();
        // System.out.print("\npostorder traversal:"+"");
        // tree.postOrder(root);


        //level-order-traversal
        System.out.println();
        List<List<Integer>> result = tree.levelorder(root);
        for(List<Integer> level:result){
            System.out.print(level);
        }

    }
}