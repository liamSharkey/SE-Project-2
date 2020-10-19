//Generic queue (FIFO) class
public class ArrayQueue<E> {

    E[] queue;
    int front = 0;
    int length = 0;
    int CAP = 30;

    //Constructor 
    public ArrayQueue(int capacity){
        queue = (E[]) new Object[capacity];
    }

    //Empty constructor - default capacity 30
    public ArrayQueue(){
        new ArrayQueue(CAP);
    }

    //Returns currentl length of the queue
    public int getLength(){
        return length;
    }

    //Checks if the queue is empty
    public boolean isEmpty(){
        if(queue.length == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    Adds an element to the back of the queue, throwing an exception if the queue is full
    Uses modulus operator for wraparound to see if there is room in the queue
    */
    public void enqueue(E elem) throws IndexOutOfBoundsException{
        checkValid(length);
        int space = (front + length) % queue.length;
        queue[space] = elem;
        length ++;
    }

    /*
    Removes an element from the front of the queue, throwing an excpetion if the queue is empty already
    front = (front + 1) % queue.length is used to change the index of the front value (whuich represents the index of the last element in the queue)
    */
    public E dequeue(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("List is empty!");
        }
        E temp = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        length --;
        return temp;
    }

    //Method to detect any errors in enqueue or dequeue, throwing an error if any are detected
    public void checkValid(int index){
        if(index >= queue.length){
            throw new IndexOutOfBoundsException("Queue is full!");
        }
        else if(index < 0){
            throw new IndexOutOfBoundsException("Not a valid input!");
        }
    }
}
