public class DoubleLinkedList<T extends Comparable> {

    //Worked closely with Josh

    private DoubleLinkedNode head;
        private DoubleLinkedNode tail;

        public  DoubleLinkedList() {
            head = null;
            tail = null;

        }

        //Returns the size of the list
        public synchronized int size() {
            if (head == null) {
                return 0;
            }

            int count = 1;
            DoubleLinkedNode current = head;
            while (current.getNext() != null) {
                count++;
                current = current.getNext();
            }

            return count;

        }

        public synchronized T get(int Index) {
            if (head == null) {
                return null;
            }

            int count = 0;
            DoubleLinkedNode current = head;
            T returnVal = (T) current.getValue();

            while (current.getNext() != null) {
                count ++;
                current = current.getNext();

                if (count == Index) {
                    returnVal = (T) current.getValue();
                }
            }
            return returnVal;

        }


        public synchronized void add (T value, int Index) {

            DoubleLinkedNode anotherNode = new DoubleLinkedNode(value,tail,head);

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
                DoubleLinkedNode current = head;
                while (current.getNext() != null && count < Index) {
                    count++;
                    current = current.getNext();

                }

                current.setNext(new DoubleLinkedNode(value,current.getNext(),current.getPrevious()));


            }
        }

            //Prints the whole list after getting the value of the node and turning it into a string
        public synchronized String printAll () {

            if (head == null) {
                return null;
            }

            int count = 1;
            DoubleLinkedNode current = head;
            count++;
            String returnString = current.getValue() + ", ";
            while (current.getNext() != null) {
                count++;
                current = current.getNext();
                returnString += current.getValue() + ", ";

            }
            return returnString;
        }


        public String printAllValues (){

            DoubleLinkedNode current = head;
            while (current.getNext() != null) {
                System.out.println(current.getValue());
                current = current.getNext();
            }





            return "" + current.getValue() + "";
        }

}

class DoubleLinkedNode <T> {



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
