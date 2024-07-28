class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> umap = new HashMap<>();
        Node curr = head;
        Node newhead = new Node(curr.val);
        Node newcurr = newhead;

        umap.put(curr, newcurr);
        curr = curr.next;

        while (curr != null) {
            Node temp = new Node(curr.val);
            newcurr.next = temp;
            newcurr = temp;
            umap.put(curr, newcurr);
            curr = curr.next;
        }

        curr = head;
        newcurr = newhead;

        while (curr != null) {
            if (curr.random != null) {
                newcurr.random = umap.get(curr.random);
            }
            newcurr = newcurr.next;
            curr = curr.next;
        }

        return newhead;
    }
}

