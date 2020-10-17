public class ArrayDemo {
    public static void main(String[] args) {
        ArrayQueue<String> aq = new ArrayQueue<>(5);

        String[] elements = {"A", "B", "C", "D", "E"};

        int i = 0;
        while(i < elements.length){
            aq.enqueue(elements[i]);
            i++;
        }

        aq.dequeue();
        aq.dequeue();

        aq.enqueue("F");
        aq.enqueue("G");

        for(int j = 0; j < elements.length; j++){
            System.out.print(aq.dequeue() + ", ");
        }
        System.out.print("\b\b");
    }
}
