package z2;

import java.util.concurrent.Semaphore;

public final class Singleton
{
  private static Singleton instance = null;
  static Semaphore semaphore = new Semaphore(1);
 
  private Singleton()
  {
  }
 
  public static Singleton getInstance()

  {
    try {
      semaphore.acquire();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    if (instance == null)
    {

      {
        if(instance==null)
        {
          instance = new Singleton();
           
        }  
      }
    }
    semaphore.release();
    return instance;
  }
}
