package general_programming;

public class QueueCustom {
    // This queue has constant size of 5. we can change it as required
    int SIZE = 5;
    int[] items = new int[SIZE];
    int front, rear;

    QueueCustom() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        if(front == 0 && rear == SIZE-1) {
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(front == -1) return true;
        else return false;
    }

    void enqueue(int element) {
        if(isFull()) {
            System.out.println("Queue is Full");
        } else {
            if(front == -1){
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Successfully inserted element: " + element);
        }
    }

    int deque(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = items[front];
            if(front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
        }

        return element;
    }

    void display() {
        int i;
        if(isEmpty()) System.out.println("Empty Queue");
        else {
            System.out.println("\nFront index-> " +front);

            System.out.println("Items -> ");
            for(i=front; i< rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index ->  "+rear);
        }
    }

    public static void main(String[] args) {
        QueueCustom queue = new QueueCustom();
        queue.deque();
        for (int i = 1; i < queue.SIZE+1; i++) {
            queue.enqueue(i);
        }

        queue.enqueue(6);
        queue.display();
        queue.deque();
        queue.display();
        queue.deque();
        queue.display();
    }
}
