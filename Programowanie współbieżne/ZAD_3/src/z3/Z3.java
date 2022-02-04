// Zadanie 3. Rozwi¹¿ problem 5 filozofów


package z3;

import java.util.concurrent.Semaphore;

public class Z3 {
  
 static Semaphore fork1=new Semaphore(1);
 static Semaphore fork2=new Semaphore(1);
 static Semaphore fork3=new Semaphore(1);
 static Semaphore fork4=new Semaphore(1);
 static Semaphore fork5=new Semaphore(1);

  
  static void Philosopher1 (){
    
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e2) {
      // TODO Auto-generated catch block
      e2.printStackTrace();
    }
    
    System.out.println("Philosopher 1 - Pobudka");
      try {
        fork1.acquire();
        System.out.println("Philosopher 1 - fork1");
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      
      try {
        fork5.acquire();
        System.out.println("Philosopher 1 - fork5");
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

      System.out.println("Philosopher 1 - Jem");
      
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    System.out.println("Philosopher 1 - Mysle");
    fork1.release();
    fork5.release();
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  static void Philosopher2() {
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e2) {
      // TODO Auto-generated catch block
      e2.printStackTrace();
    }
    
    System.out.println("Philosopher 2 - Pobudka");

    try {
      fork2.acquire();
      System.out.println("Philosopher 2 - fork2");
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
      try {
        fork1.acquire();
        System.out.println("Philosopher 2 - fork1");
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
          
      System.out.println("Philosopher 2 - Jem");
      
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
          
    System.out.println("Philosopher 2 - Mysle");
    fork1.release();
    fork2.release();
    
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
  
  static void Philosopher3() {
    
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e2) {
      // TODO Auto-generated catch block
      e2.printStackTrace();
    }
    System.out.println("Philosopher 3 - Pobudka");
    
    
    try {
      fork3.acquire();
      System.out.println("Philosopher 3 - fork3");
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
      try {
        fork2.acquire();
        System.out.println("Philosopher 3 - fork2");
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
      
      System.out.println("Philosopher 3 - Jem");
      
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    System.out.println("Philosopher 3 - Mysle");
    fork2.release();
    fork3.release();
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  static void Philosopher4() {
    System.out.println("Philosopher 4 - Pobudka");   
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e3) {
      // TODO Auto-generated catch block
      e3.printStackTrace();
    }

    try {
      fork4.acquire();
      System.out.println("Philosopher 4 - fork4");
    } catch (InterruptedException e2) {
      // TODO Auto-generated catch block
      e2.printStackTrace();
    }
    
      try {
        fork3.acquire();
        System.out.println("Philosopher 4 - fork3");
      } catch (InterruptedException e2) {
        // TODO Auto-generated catch block
        e2.printStackTrace();
      }
      
      System.out.println("Philosopher 4 - Jem");
      
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    System.out.println("Philosopher 4 - Mysle");
    fork3.release();
    fork4.release();
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
  
  static void Philosopher5() {
    
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    System.out.println("Philosopher 5 - Pobudka");
    
    try {
      fork4.acquire();
      System.out.println("Philosopher 5 - fork4");
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    
      try {
        fork5.acquire();
        System.out.println("Philosopher 5 - fork5");
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

      System.out.println("Philosopher 5 - Jem");
      
      try {
        Thread.sleep((int)(Math.random() * 1000));
      } catch (InterruptedException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }

    System.out.println("Philosopher 5 - Mysle");
    fork4.release();
    fork5.release();
    try {
      Thread.sleep((int)(Math.random() * 1000));
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    }
   
  public static void main(String argv[]) {

   
    var P1 = new Thread(() -> {
      for(;;) {
      Philosopher1();}
    });
    var P2 = new Thread(() -> {
      for(;;) {
      Philosopher2();}
    });
    var P3 = new Thread(() -> {
      for(;;) {
      Philosopher3();}
    });
    var P4 = new Thread(() -> {
      for(;;) {
      Philosopher4();}
    });
    var P5 = new Thread(() -> {
      for(;;) {
      Philosopher5();}
    });
    
    P1.start();
    P2.start();
    P3.start();
    P4.start();
    P5.start();
}  
     } 
	

