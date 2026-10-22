/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curNode = head;
        HashMap<Node,Node> copyMap = new HashMap<>();
         while(curNode != null){
            Node copy = new Node(curNode.val);
            copyMap.put(curNode,copy);
            curNode = curNode.next;
        }
        Node res = copyMap.get(head);
        Node node = head;
        while(node != null) {
            Node newNode = copyMap.get(node);
            newNode.next = copyMap.get(node.next);
            newNode.random = node.random == null ? null : copyMap.get(node.random);
            node = node.next;
        }
        return res;
    }
}
