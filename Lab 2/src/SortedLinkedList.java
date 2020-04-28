import javax.print.attribute.standard.JobKOctets;
import java.util.Currency;

public class SortedLinkedList <T extends Comparable <T>> {

    private LinkedListNode head;



    public synchronized void add(T input) {

        if (head == null) {

            LinkedListNode newNode = new LinkedListNode(input, null);
            head = newNode;
            head.setIndex(0);
        }

        else if (input.compareTo(head.value)  == -1) {
           head =   new LinkedListNode(input, head);
        }
        else {
            LinkedListNode current = head;
            LinkedListNode previous = null;
              previous = head;
               current = head.getNext();

            while (current != null && input.compareTo(current.value) > 0) {

                previous = current;
                current = current.next;


            }


            previous.next = new LinkedListNode(input, current);


        }

    }


// Gets a value at an index
    public T getValue(int index) {
        LinkedListNode current = getHead();
        int currentIndex = 0;

        while (current != null) {
            if (currentIndex == index) {
                return current.value;
            }
            currentIndex++;
            current = current.getNext();

        }

        return null;
    }

    public Boolean search (T value){
        LinkedListNode current = getHead();
        boolean isitThere = false;
        while (current.getNext()!= null){
            if (current.value == value) {isitThere = true;}
        }
        return isitThere;
    }

    public LinkedListNode getHead() {
        return head;
    }

    public String printAllValues() {
        LinkedListNode current = head;
        String keeptrack = "START";

   if (head != null) {
       while (current.getNext() != null) {
           System.out.println(current.value);
           keeptrack = keeptrack + "," + current.value;
           current = current.getNext();

       }


        return keeptrack;
   }

   else {

       return "Empty";
   }

    }



    class LinkedListNode {

        public T value;
        private LinkedListNode next;
        public int index;
        public LinkedListNode previous;


        public LinkedListNode(T value, LinkedListNode next) {
            this.value = value;
            this.next = next;

        }


        public void setValue(T value) {
            this.value = value;
        }

        public LinkedListNode getNext() {
            return next;
        }

        public void setNext(LinkedListNode next) {
            this.next = next;
        }

        public LinkedListNode getPrevious() {
            return previous;
        }

        public void setPrevious(LinkedListNode previous) {
            this.previous = previous;
        }

        public boolean greaterThan(T otherValue) {

            if (otherValue.compareTo(value) > 0) {
                return true;
            } else {
                return false;
            }
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }
}
