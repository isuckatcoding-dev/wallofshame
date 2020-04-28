public class LinkedList <T extends Comparable> implements Runnable {

    private LinkedListNode head;


    public LinkedList() {

    }


    @Override
    public synchronized void run() {
    }


    ///Worked closely with Josh
//Returns the size of the LinkedList
    public synchronized int size() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        LinkedList.LinkedListNode current = head;
        while (current.getNext() != null) {
            count++;
            current = current.getNext();

        }

        return count;

    }

    //Gets value from the linkedlist  by looping
    public synchronized T getValue (int Index) {
        if (head == null) {
            return null;
        }

        int findtheend = 0;
        LinkedListNode current = head;
        T returntheValue = (T) current.getValue();

        while (current.getNext() != null) {
            findtheend ++;
            current = current.getNext();

            if (findtheend == Index) {
                returntheValue = (T) current.getValue();
            }
        }
        return returntheValue;
    }

    //Adds a node

    public synchronized void  add(T value, int Index) {

        if (head == null || Index == 0) {


            head  = new LinkedListNode(value,head);
            return;
        }

        int count = 1;
        LinkedListNode current = head;
        while (current.getNext() != null && count < Index) {

            count++;
            current = current.getNext();

        }
        current.setNext(new LinkedListNode(value,current.getNext()));

    }

    //Turns the input into a string
    public synchronized String printAll () {
        if (head == null) {
            return null;
        }

        int count = 0;
        LinkedListNode current = head;
        count++;
        String returntheString = current.getValue() + ", ";
        while (current.getNext() != null) {
            count++;
            current = current.getNext();
            returntheString += current.getValue() + ", ";

        }
        return returntheString;
    }


    class LinkedListNode <T extends Comparable<T>> {

        public T value;
        private LinkedListNode next;


        public LinkedListNode(T value, LinkedListNode next) {
            this.value = value;
            this.next = next;

        }



        public T getValue() {
            return value;
        }

        public LinkedListNode getNext() {
            return next;
        }

        public void setNext(LinkedListNode next) {
            this.next = next;
        }

        public boolean istheValueBigger(T otherValue){

            int definingValue = otherValue.compareTo(value);
            if (definingValue > 0){
                return true;
            } else {
                return false;
            }
        }
    }





}




