public class TreeMain {
    public static void main(String args[]){
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(9);
        tree.insert(6);
        tree.insert(99);
        tree.insert(12);
        System.out.println(tree.find(7));
    }
}
