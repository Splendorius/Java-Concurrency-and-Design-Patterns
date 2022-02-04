//Zadanie 2. Rozwi¹¿ problem czytelników i pisarzy

package z2;

import java.util.concurrent.Semaphore;

public class Z2 {

  
      private static Semaphore readSemaphore = new Semaphore(1);
      private static Semaphore writeSemaphore = new Semaphore(1);
      
      private static int count = 0;

      public static void readLock() throws InterruptedException {
        Thread.sleep((int)(Math.random() * 2000)+1000);
          readSemaphore.acquire();
          if(count == 0){
              writeSemaphore.acquire();
          }
          count++;
          readSemaphore.release();
      }

      public static void readUnLock() throws InterruptedException {
          readSemaphore.acquire();
          count--;
          if(count == 0){
              try {
                writeSemaphore.release();
              } catch (Exception e) {
                e.printStackTrace();
              }
          }
          try {
            readSemaphore.release();
          } catch (Exception e) {
            e.printStackTrace();
          }
      }

      
      
      public static void Writer() throws InterruptedException {
          writeSemaphore.acquire();
          a = (int)(Math.random() * 100);
          System.out.println(Thread.currentThread().getName()+"| write " + a); 
          writeSemaphore.release();
          Thread.sleep((int)(Math.random() * 2000)+1000);
      }

      static int a = 10;


  public static void main(String[] args) {
    
    Thread R1 = new Thread(() -> {
      for (;;) {
      try {
          readLock();
          System.out.println(Thread.currentThread().getName()+"| read " + a);
          readUnLock();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      }
  });
    
     Thread R2 = new Thread(() -> {
       for (;;) {
        try {
            readLock();
            System.out.println(Thread.currentThread().getName()+"| read " + a);
            readUnLock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}
    });
    
     Thread R3 = new Thread(() -> {
       for (;;) {
       try {
           readLock();
           System.out.println(Thread.currentThread().getName()+"| read " + a);
           readUnLock();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }}
   });
     
    
     Thread W1 = new Thread(() -> {
       for (;;) {
       try {
           Writer();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }}
   });
     
     Thread W2 = new Thread(() -> {
       for (;;) {
       try {
         Writer();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }}
   });
     
    R1.start();
    W1.start();
    W2.start();
    R2.start();
    R3.start();
    
   
    

  }
  }
