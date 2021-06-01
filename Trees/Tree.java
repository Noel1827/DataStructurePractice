class Tree {
    private class Node {
        private int value;
        private Node leftchild;
        private Node rightchild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node= " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var current = root;
        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        while (true) {
            if (value < current.value) {
                if (current.leftchild == null) {
                    current.leftchild = node;
                    break;
                }
                current = current.leftchild;
            } else {
                if (current.rightchild == null) {
                    current.rightchild = node;
                    break;
                }
                current = current.rightchild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftchild;
            } else if (value > current.value) {
                current = current.rightchild;
            } else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.leftchild);
        traversePreOrder(root.rightchild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;
        traversePreOrder(root.leftchild);
        System.out.println(root.value);
        traversePreOrder(root.rightchild);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;
        traversePreOrder(root.leftchild);
        traversePreOrder(root.rightchild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private boolean isLeaf(Node node) {
        return node.leftchild == null && node.rightchild == null;
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftchild), height(root.rightchild));
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (isLeaf(root))
            return root.value;
        var left = min(root.leftchild);
        var right = min(root.rightchild);
        return Math.min(Math.min(left, right), root.value);
    }

    

    public boolean equals(Tree other) {
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if(first == null && second == null)
            return true;
        if(first!= null && second != null)
            return first.value == second.value 
            && equals(first.leftchild, second.leftchild)
            && equals(first.rightchild, second.rightchild);

            return false;
    }

}