package chess;

public class Stack {
    private Move arrMove[];

    private int top;
    private int size;

    Stack(int size) {
        // initialize the array
        // initialize the stack variables
        arrMove = new Move[size];
        this.size = size;
        top = -1;
    }

    // push elements to the top of stack
    public void push(Move x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");

            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        arrMove[++top] = x;
    }

    // pop elements from top of stack
    public Move pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return arrMove[top--];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == size - 1;
    }

    // display elements of stack


}