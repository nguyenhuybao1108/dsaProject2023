//package chess;
//
//public class Linkedlist {
//    private Node head;
//    private Node tail;
//    private class Node {
//        Move data;
//        Node next;
//        Node prev;
//
//        public Node(Move data) {
//            this.data = data;
//            next = null;
//            prev = null;
//        }
//    }
//
//    public void InsertFirst(Move m){
//        Node newnode = new Node(m);
//        if(head == null){
//            head = newnode;
//            tail = newnode;
//        }
//        else{
//            newnode.next = head;
//            head = newnode;
//            newnode.prev = head;
//        }
//    }
//
//    public Node RemoveFirst(){
//        if(head != null){
//            Node current = head;
//            head = current.next;
//        }
//        return head;
//
//    }
//
//    public Node getHead(){
//        return this.head;
//    }
//
//    public Move getMove(){
//        return this.head.data;
//    }
//
//    public boolean isEmpty() {
//        return head == null;
//    }
//
//
//    public static class Undo{
//        private Board board;
//        public Undo(Board board){
//            this.board = board;
//        }
//
//        public void Execute(GamePanel gamePanel){
//            gamePanel.getBoard().Undo(gamePanel);
//            gamePanel.repaint();
//        }
//    }
//
//    public static class Redo{
//        Board board;
//        public Redo(Board board){
//            this.board = board;
//        }
//
//        public void Execute(GamePanel gamePanel){
//   //         gamePanel.getBoard().Redo(gamePanel);
//            gamePanel.repaint();
//        }
//
//    }
//}
