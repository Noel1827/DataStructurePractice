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

    private int height(Node root) {
        if(root == null)
        return -1;
        if (root.leftchild == null && root.rightchild == null)
            return 0;

        return 1 + Math.max(height(root.leftchild), height(root.rightchild));
    }
}