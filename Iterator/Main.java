package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main extends Thread{
    static ArrayList<String> collection = new ArrayList<String>();
    Iterator<String> iterator2 = collection.iterator();

    public static void main(String[] args) {


        // Create a collection.
        for (int i = 0; i < 10; i++) {
            collection.add("Item " + i);
        }

        Main thread = new Main();
        Main thread2 = new Main();

        thread.start();
        thread2.start();
        
    }

    // Eri iterator molemmilla threadeilla
    // Ensimmäinen thread käy nopeammin läpi, koska aloittaa ensin.
    // Molemmat käy ArrayListin läpi itsenäisesti.
    // @Override
    // public void run() {
    //     Iterator<String> iterator = collection.iterator();
    //     while (iterator.hasNext()) {
    //         System.out.println(Thread.currentThread().threadId() + " " + iterator.next());
    //     }
    // }

    // Sama iterator, synkattu kokoelma
    @Override
    public void run(){
        synchronized(collection){
            while (iterator2.hasNext()) {
                System.out.println(Thread.currentThread().threadId() + " " + iterator2.next());
            }
        }
    }
}
