public class ArrayQueue<E> {

    E[] queue;
    int front = 0;
    int length = 0;
    int CAP = 30;

    public ArrayQueue(int capacity){
        queue = (E[]) new Object[capacity];
    }

    public ArrayQueue(){
        new ArrayQueue(CAP);
    }

    public int getLength(){
        return length;
    }

    public boolean isEmpty(){
        if(queue.length < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(E elem) throws IndexOutOfBoundsException{
        checkValid(length);
        int space = (front + length) % queue.length;
        queue[space] = elem;
        length ++;
    }

    public E dequeue(){
        checkValid(0);
        E temp = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        length --;
        return temp;
    }

    public void checkValid(int index){
        if(index >= queue.length){
            throw new IndexOutOfBoundsException("Queue is full!");
        }
        else if(index < 0){
            throw new IndexOutOfBoundsException("Not a valid input!");
        }
        else if(isEmpty()){
            throw new IndexOutOfBoundsException("Queue is empty!");
        }
    }
}
