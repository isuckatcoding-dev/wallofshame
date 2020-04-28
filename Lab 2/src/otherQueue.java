public class otherQueue<T> {


    private queueNode head;
    private queueNode tail;

    public otherQueue() {
        head = null;
        tail = null;

    }




    public void push (T value, int Index) {

        queueNode anotherNode = new queueNode(value,tail,head);

        if (head == null) {
            head = anotherNode;
            tail = anotherNode;
        }

        //Then 0 in the index is the head
        else if (Index == 0) {
            head = anotherNode.getNext();
            anotherNode = head.getPrevious();
            head = anotherNode;

        }


        else {

            int count = 1;
            queueNode current = head;
            while (current.getNext() != null && count < Index) {
                count++;
                current = current.getNext();

            }

            current.setNext(new queueNode(value,current.getNext(),current.getPrevious()));


        }
    }




}

 class queueNode <T> {



    private T value;
    private queueNode previous;
    private queueNode next;


    public queueNode(T value, queueNode previous, queueNode next) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public queueNode getNext() {
        return next;
    }

    public queueNode getPrevious() {
        return previous;
    }

    public void setNext(queueNode next) {
        this.next = next;
    }

    public void setPrevious(queueNode previous) {
        this.previous = previous;
    }
}
