public class MyLinkedList {
    private Node head;
    private int numNodes;

    class Node {
        private Node next;
        private int data;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    public MyLinkedList(int value) {
        this.head = new Node(value);
    }

    public MyLinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void add(int index, int value) {
        Node temp = head;
        Node newNode = new Node(value);
        for (int i = 0; i < index- 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node nodeTemp = temp.next;
        temp.next = newNode;
        newNode.next = nodeTemp;
    }

    public void addFirst(int value) {
        Node temp = head;
        Node newNode = new Node(value);
        head = newNode;
        newNode.next = temp;
    }
}
