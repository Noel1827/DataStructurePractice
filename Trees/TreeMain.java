public class TreeMain {
    public static void main(String args[]){
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(6);
        tree.insert(99);
        tree.insert(12);

        Tree tree2 = new Tree();
        tree2.insert(10);
        tree2.insert(9);
        tree2.insert(6);
        tree2.insert(99);
        tree2.insert(12);
        System.out.println(tree.equals(tree2));
    }
}
