package problem03;

public class LinkedList {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node node;

    public void add(int value) {
        if(node == null) {
            node = new Node(value);
            return;
        }

        Node cursor = node;

        while (cursor != null) {
             if(cursor.next == null) {
                 Node newNode = new Node(value);
                 cursor.next = newNode;
                 break;
             }
             cursor = cursor.next;
        }


    }

    public void getData() {
        Node cursor = node;

        while(cursor != null) {
            System.out.println(cursor.value);
            cursor = cursor.next;
        }
    }
}
