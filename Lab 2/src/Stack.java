public class Stack<T> {


private node theTop;

    //Simply adds a value to the top
   public synchronized  void push (T newValue)
   {

        node addaValue = new node(newValue);
        addaValue.previous = theTop;

        this.theTop = addaValue;
   }


   // Removes the top
   public synchronized node pop (){

       node keepthetop = null;

       if (theTop.previous == null){

           keepthetop = theTop;
           theTop = null;
       }

       else if (theTop.previous != null) {

            //The object that was there is now eligible for garbage collection
           keepthetop = theTop;
           theTop= theTop.previous ;
       }



        return  keepthetop;

   }


   public synchronized node top() {

       return theTop;
   }


   }


    class node<T> {


         T value ;
        node previous = null;




        node(T value) {
            this.value = value;
            this.previous = null;
        }


    }



