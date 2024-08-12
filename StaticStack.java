
public class StaticStack <T> {
    private int top ;
    private T[] data;

    public StaticStack(int size) {
        data = (T[]) new Object[size];
        top = -1;
    }

    public void push(T item) {
        if(isFull()){
            throw new IllegalStateException("Stack is full");
        }
        data[++top] = item;
    }
    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return data[top--];
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.print("Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(data[i]);
            if (i < top) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public void clear(){
        top = -1;
    }
    public boolean isEmpty() {return top == -1;}
    public boolean isFull() {return top == data.length-1;}

    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.printStack();
        stack.clear();
        stack.printStack();

    }
}