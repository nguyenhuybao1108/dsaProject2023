/* Name: GROUP 8 
    Ma Phung Nghia - ITCSIU2106
    Huynh Thi Ngoc Tram - ITCSIU21238
    Nguyen Huy Bao - ITDSIU21076
    Purpose : create a game apply data structure and all knowledge about coding*/

package LinkednStack;

import chess.Piece;

public class PieceList {
    private Node head;
    private Node tail;

    private class Node {
        Piece piece;
        Node next;
        Node prev;

        public Node(Piece piece) {
            this.piece = piece;
            next = null;
            prev = null;
        }

        public Piece getTurn(){
            return piece;
        }
    }

    public void InsertFirst(Piece piece) {
        Node newnode = new Node(piece);
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

    public Piece getPiece() {
        return this.head.piece;
    }


    public boolean isEmpty() {
        return head == null;
    }
}
