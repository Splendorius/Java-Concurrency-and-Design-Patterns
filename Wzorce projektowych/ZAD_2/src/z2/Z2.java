//* Zadanie 2. Zrealizowa� wzorzec singleton z odroczeniem
//  - bezpieczny z punktu widzenia wsp�bie�no�ci
//  - wykorzystuj�cy semafory do realizacji sekcji krytycznej


package z2;



public class Z2 {

  public static void main(String[] args) {
    
    MyThread myThread = new MyThread();

    var t1 = new Thread(() -> {
      myThread.run();
    });
    
    var t2 = new Thread(() -> {
      myThread.run();
    });
    
    var t3 = new Thread(() -> {
      myThread.run();
    });

    var t4 = new Thread(() -> {
      myThread.run();
    });
    var t5 = new Thread(() -> {
      myThread.run();
    });
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
	

}
