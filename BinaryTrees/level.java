import java.util.ArrayList;
class Node {
    int data;
    Node left, right;
    Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}
public class level {
    void levelOrderRec(Node root, int level,
                       ArrayList<ArrayList<Integer>> res)
    {
        // Base case
        if (root == null)
            return;

        // Add a new level to the result if needed
        if (res.size() <= level)
            res.add(new ArrayList<>());

        res.get(level).add(root.data);
        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }
    ArrayList<ArrayList<Integer>> levelOrder(Node root)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }
    public static void main(String[] args)
    {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        level tree = new level();
        ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);

        for (ArrayList<Integer> level : res) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}