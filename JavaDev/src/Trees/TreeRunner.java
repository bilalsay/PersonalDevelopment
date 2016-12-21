package Trees;

/**
 * Created by bilalsay on 18.11.2016.
 */

public class TreeRunner {

    public static void main(String args[]) {


        Node root = new Node();
        Node tree = null;

        tree = root.add(tree, 56);
        tree = root.add(tree, 190);
        tree = root.add(tree, 200);
        tree = root.add(tree, 283);
        tree = root.add(tree, 24);

        tree = root.add(tree, 12);
        tree = root.add(tree, 27);
        tree = root.add(tree, 28);


        System.out.print("Order: ");
        root.iter(tree);
        System.out.println("\nSerach result: " + root.search(tree, 122));
        System.out.print("Max value: " + root.max(tree) + "\n");
        System.out.print("Min value: " + root.min(tree) + "\n");
        System.out.print("Min value: " + root.secondMin(tree) + "\n");
        root.remove(tree, 190);
        System.out.print("After removing: ");
        root.iter(tree);
        System.out.print("\n");

    }
}
