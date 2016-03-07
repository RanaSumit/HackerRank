Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if (head == null) {
        return newNode;
    }
    if (position == 0) {
        newNode.next = head;
        head = newNode;
        return head;
    }
    Node prev = null;
    Node current = head;
    int i = 0;
    while (current !=null && i < position) {
        prev = current;
        current = current.next;
        i++;
    }
    newNode.next = prev.next;
    prev.next = newNode;
    return head;
}