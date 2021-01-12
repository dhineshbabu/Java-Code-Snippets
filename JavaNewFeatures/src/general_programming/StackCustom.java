package general_programming;

public class StackCustom {
    private int[] arr;
    private int top;
    private int capacity;

    StackCustom(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return  top == -1;
    }

    public boolean isFull() {
        return top == capacity-1;
    }

    public int getSize() {
        return top+1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Stack Empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public void display() {
        for(int i = 0; i<=top; i++) {
            System.out.print(arr[i] + " ,");
        }
    }

    public static void main(String[] args) {
        StackCustom stack = new StackCustom(5);
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(10);
        stack.display();
        System.out.println();
        stack.pop();
        stack.display();
        System.out.println();
        stack.push(4);
        stack.display();
        System.out.println();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println();
        System.out.println(stack.getSize());
    }
}
