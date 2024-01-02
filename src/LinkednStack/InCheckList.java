/* Name: GROUP 8 
    Ma Phung Nghia - ITCSIU2106
    Huynh Thi Ngoc Tram - ITCSIU21238
    Nguyen Huy Bao - 
    Purpose : create a game apply data structure and all knowledge about coding*/

package LinkednStack;

import chess.Piece;

public class InCheckList {
    private Node head;
    private Node tail;

    private class Node {
        Piece inCheck;
        Node next;
        Node prev;

        public Node(Piece inCheck) {
            this.inCheck = inCheck;
            next = null;
            prev = null;
        }

    }

    public void InsertFirst(Piece inCheck) {
        Node newnode = new Node(inCheck);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
            newnode.prev = head;
        }
    }

    public void RemoveFirst() {
        if(isEmpty()){
            return;
        }
        if (head != null) {
            Node current = head;
            head = current.next;
        }
    }

    public Piece getInCheck() {
        return head.inCheck;
    }


    public boolean isEmpty() {
        return head == null;
    }
}
