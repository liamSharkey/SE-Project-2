//Generic queue (FIFO) class
public class ArrayQueue<E> {

    E[] data;
    int front = 0;
    int length = 0;
    int CAP = 30;

    //Constructor 
    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
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
        if(data.length == 0){
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
        int space = (front + length) % data.length;
        data[space] = elem;
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
        E temp = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        length --;
        return temp;
    }

    //Method to detect any errors in enqueue or dequeue, throwing an error if any are detected
    public void checkValid(int index){
        if(index >= data.length){
            throw new IndexOutOfBoundsException("Queue is full!");
        }
        else if(index < 0){
            throw new IndexOutOfBoundsException("Not a valid input!");
        }
    }
}

//:)
