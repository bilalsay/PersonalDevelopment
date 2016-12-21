package Trees;

/**
 * Created by bilalsay on 18.11.2016.
 */

public class Node {
    private Node left;
    private Node right;
    private int key;

    public Node add(Node tree, int x) {
        if (tree == null) {
            Node root = new Node();
            root.left = null;
            root.right = null;
            root.key = x;
            return root;
        }

        if (tree.key < x) {
            tree.right = add(tree.right, x);
            return tree;
        }

        tree.left = add(tree.left, x);
        return tree;

    }

    public void iter(Node tree) {
        if (tree == null)
            return;

        iter(tree.left);
        System.out.print(tree.key + " ");
        iter(tree.right);
    }

    public int search(Node tree, int x) {
        if (tree == null)
            return -1;
        if (tree.key == x)
            return 1;
        if (search(tree.left, x) == 1)
            return 1;
        if (search(tree.right, x) == 1)
            return 1;

        return -1;
    }

    public int max(Node tree) {
        while(tree.right != null)
            tree = tree.right;
        return tree.key;

        /* As recursive

          if (tree.right == null)
            return tree.key;
          return max(tree.right);

        */
    }

    public int min(Node tree) {
        while(tree.left != null) {
            tree = tree.left;
        }
        return tree.key;

        /* As recursive

          if (tree.left == null)
            return tree.key;
          return min(tree.left);

        */

    }

    public int secondMin(Node tree) {
        if (tree.left.left == null)
            return tree.key;
        return secondMin(tree.left);
    }

    public Node remove(Node tree, int x) {
        if (tree == null)
            return null;
        if (tree.key == x) {
            if (tree.left == null && tree.right == null)
                return null;

            if (tree.left != null) {
                tree.key = max(tree.left);
                tree.left = remove(tree.left, max(tree.left));
                return tree;
            }

            tree.key = min(tree.right);
            tree.left = remove(tree.right, min(tree.right));
            return tree;

        }

        if (tree.key < x) {
            tree.right = remove(tree.right, x);
            return tree;
        }
        tree.left = remove(tree.left, x);
        return tree;
    }


}
