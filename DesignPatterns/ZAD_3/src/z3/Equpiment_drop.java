package z3;

public class Equpiment_drop {

  public static Equipment drop(String type_eq) {
          
      if(type_eq.equals("Armor")) {
        return new Iron_Armor();}
      else
      if(type_eq.equals("Sword")){
        return new Iron_Sword();
      }
      else
        if(type_eq.equals("Boots")){
          return new Iron_Boots();
        }
      else
          if(type_eq.equals("Weapon")){
            return new Iron_Sword();
          }
       else
            if(type_eq.equals("Helm")){
              return new Iron_Helmet();
            }

            else return null;
      
  }
}
