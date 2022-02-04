//* Zadanie 4. Stw�rz hierarchi� klas oraz odpowiadaj�c� tej hierarchii
//  struktur� klas realizuj�cych wzorzec abstract factory.

package z4;
public class Main {
  
  static App configPL() {
    App app;
    AbsFactory absfactory;
    absfactory=new PLFactoryConcrete();
    app=new App (absfactory);
    return app;
  }

  static App configUS() {
    App app;
    AbsFactory absfactory;
    absfactory=new NAFactoryConcrete();
    app=new App (absfactory);
    return app;
  } 
  
  public static void main(String[] args) {
  
    App app1 = configPL();
    app1.write();
    
     App app2 = configUS();
      app2.write();
    
  }

}
