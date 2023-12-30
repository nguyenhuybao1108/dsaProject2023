package chess;

public class Stack {
    private Move[] move;
    private int top;
    int size;

    public Stack(int size){
        this.size = size;
        move = new Move[size];
        top = -1;
    }

    public void push(Move m){
        if(isFull()){
            return;
        }
     move[++top] = m;
    }

    public boolean isFull(){
        return top == size;
    }

    public boolean isEmpty(){
        return  top == -1;
    }

    public Move pop(){
        if(isEmpty()){
            throw new Error("The stack is full");
        }
        return  move[top--];
    }

    public int peek(){
        return top;
    }

    public Move getMove(){
        return move[top];
    }
}
