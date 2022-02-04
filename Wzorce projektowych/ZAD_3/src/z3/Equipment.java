package z3;

public abstract class Equipment {

   private String name;
   private double atk;
   private double def;
   private int slot;
   
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getAtk() {
    return atk;
  }
  public void setAtk(double atk) {
    this.atk = atk;
  }
  public double getDef() {
    return def;
  }
  public void setDef(double def) {
    this.def = def;
  }

  public int getSlot() {
    return slot;
  }
  public void setSlot(int slot) {
    this.slot = slot;
  }
  
  
  public void show_name() {
    System.out.println("Got " + getName()); 
  }
  
  public void show_atk() {
    System.out.println(getAtk() + " atk"); 
  }
  
  public void show_def() {
    System.out.println(getDef() + " def"); 
  }
  
  
  public void show_slot() {  
    switch(getSlot()) {
    
    case 1:
      System.out.println("Helmets"); 
      break;
    case 2:
      System.out.println("Armor"); 
      break;
    case 3:
      System.out.println("Weapon"); 
      break;
    case 4:
      System.out.println("Shield"); 
      break;
    case 5:
      System.out.println("Boots"); 
      break;
    default:
      break;
      
    
    }
  }
  
  
}
