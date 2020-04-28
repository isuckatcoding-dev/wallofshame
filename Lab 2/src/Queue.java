public class Queue<T> {

    private node Head;
    private node Tail;

    private int size;
    private int numofthreads;
    private int delaybetween;


    Queue (int sizeCON, int numofthreadsCON, int delaybetweenCON){

    size = sizeCON;
    numofthreads = numofthreadsCON;
    delaybetween = delaybetweenCON;

    }

        // Adds a value to the queue
    public synchronized void push (T newValue) {
        if (Head == null || Tail == null){
            Head = new node<T>(newValue, null, null);
            Tail = Head;
            return;
        }

        Tail = new node<T>(newValue,Tail, null);
        Tail.getPrevious().setNext(Tail);

    }

        // Takes the value at the front, removes it, and returns to console
        public synchronized T pop (){

        if(Head==null){
            return null;
        }

        T value = (T) Head.getValue();
        Head = Head.next;

       return  value;
        }

        public T top (){

        return (T) Head.getValue();
        }


    public int getSize() {
        return size;
    }

    public int getNumofthreads() {
        return numofthreads;
    }

    public int getDelaybetween() {
        return delaybetween;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumofthreads(int numofthreads) {
        this.numofthreads = numofthreads;
    }

    public void setDelaybetween(int delaybetween) {
        this.delaybetween = delaybetween;
    }

    class node<T> {

        T value;
        node previous = null;
        node next = null;


        node(T value, node<T> previous, node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }

        public T getValue(){
            return  value;
        }

        public void setNext( node next) {
            this.next = next;

        }

        public void setPrevious(node previous) {
            this.previous = previous;
        }

        public node getNext() {
            return next;
        }

        public node getPrevious() {
            return previous;
        }
    }

}

    