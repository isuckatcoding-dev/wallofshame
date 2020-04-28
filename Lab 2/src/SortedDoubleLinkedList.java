public class SortedDoubleLinkedList<T extends Comparable> {




    private DoubleLinkedNode head;

    SortedDoubleLinkedList() {
        head = null;
    }


    //Adds a value to the list
    public synchronized void add(T input) {

        DoubleLinkedNode current;

        //Case for if the ehad doesn't exist or if the head is smaller than input
        if(head == null || head.greaterThan(input) == false) {

            DoubleLinkedNode newNode = new DoubleLinkedNode(input, null, head);
            head = newNode;

        } else  {

            current = head;

            while (current.getNext() != null && current.greaterThan(input) == true) {
                current = current.getNext();

            }
            current.setNext(new DoubleLinkedNode(input, current, current.getNext()));

        }

    }








    class DoubleLinkedNode <T extends Comparable<T>> {

        public boolean greaterThan(T otherValue){

            int definingValue = otherValue.compareTo(value);
            if (definingValue > 0){
                return true;
            } else {
                return false;
            }
        }

        private T value;
        private DoubleLinkedNode previous;
        private DoubleLinkedNode next;


        public DoubleLinkedNode(T value, DoubleLinkedNode previous, DoubleLinkedNode next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public T getValue() {
            return value;
        }

        public DoubleLinkedNode getNext() {
            return next;
        }

        public DoubleLinkedNode getPrevious() {
            return previous;
        }

        public void setNext(DoubleLinkedNode next) {
            this.next = next;
        }

        public void setPrevious(DoubleLinkedNode previous) {
            this.previous = previous;
        }
    }


}

