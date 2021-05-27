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
}