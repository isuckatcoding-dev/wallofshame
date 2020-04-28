
public class main {

    public static void main (String  args []) throws InterruptedException {



                if (args.length > 0) {



            Queue multiThread = new Queue(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                   int j = Integer.parseInt(args[1]);

                    while (true) {


                        multiThread.push(6);
                        multiThread.push(4);
                        multiThread.push(8);



                    }
                }
            }
            );



            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {

                    while (true) {

//                        multiThread.pop();
//                        multiThread.pop();
//                        multiThread.pop();

                        System.out.println(multiThread.pop());
                        System.out.println(multiThread.pop());
                        System.out.println(multiThread.pop());


                    }

                }
            }
            );

            t1.start();
            t1.sleep(Integer.parseInt(args[2]));
            t2.start();
            t2.sleep(Integer.parseInt(args[2]));



        }

    }

}
