public class ArrayDemo {
    public static void main(String[] args) {
        ArrayQueue<String> aq = new ArrayQueue<>(5);

        //Creating an array of letters A-E
        String[] elements = {"A", "B", "C", "D", "E"};

        //Fill the queue with all the letters
        int i = 0;
        while(i < elements.length){
            aq.enqueue(elements[i]);
            i++;
        }

        //Remove the first two letters
        aq.dequeue();
        aq.dequeue();

        //Add letters F and G to the queue
        aq.enqueue("F");
        aq.enqueue("G");

        //Print all the letters in the current queue
        for(int j = 0; j < elements.length; j++){
            System.out.print(aq.dequeue() + ", ");
        }
        System.out.print("\b\b");
    }
}
