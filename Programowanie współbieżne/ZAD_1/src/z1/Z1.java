// Zadanie 1. Zrealizuj wzorzec PROMISE (zgodnie z diagramem)


// TO DO:  wartosc ma byc zwracana, i watek  czytajacy czeka na wartosc
package z1;

public class Z1 {
  private static String kx;

  public static String getKx() {
    return kx;
  }

  public static void setKx(String kx) {
    if (Z1.kx==null) {
        Z1.kx = kx;
      }
  }

  public static void main(String[] args) {
    
    Object obj = new Object();
    Object writer = new Object();
    
    var W1 = new Thread(() -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (writer) {

      if (getKx()==null) {
        setKx("WITAM1");
        synchronized (obj) {
        obj.notifyAll();
        System.out.println("Zapisano " + getKx());}
      }
      else {
        System.out.println("Nie mozna zapisac");}
      
      }
    });
    
    var W2 = new Thread(() -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      synchronized (writer) {
      if (getKx()==null) {
        setKx("WITAM2");
        synchronized (obj) {
        obj.notifyAll();
        System.out.println("Zapisano " + getKx());}
      }
      else {
      System.out.println("Nie mozna zapisac");}
      
      }
    });
    
    var R3 = new Thread(() -> {
      
      if (getKx()==null) {
        System.out.println("Czekam");
        try {
          synchronized (obj) {
            obj.wait();
          }
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
     System.out.println("Zwrocono " + getKx());}
      
      else {
        System.out.println("Zwrocono " + getKx());
      }
    });
    
    
    var R4 = new Thread(() -> {
      if (getKx()==null) {
        System.out.println("Czekam");
        try {
          synchronized (obj) {
            obj.wait();
          }
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
     System.out.println("Zwrocono " + getKx());}
    });
    
    
    var R5 = new Thread(() -> {
      if (getKx()==null) {
        System.out.println("Czekam");
        try {
          synchronized (obj) {
            obj.wait();
          }
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
     System.out.println("Zwrocono " + getKx());}
    });


    W1.start();
    R3.start();
    W2.start();
    R4.start();
    R5.start();

  }
}
