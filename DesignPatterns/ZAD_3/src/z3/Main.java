//* Zadanie 3. Opracuj factory method dla klasy realizuj¹cej
//  funkcjonalnoœæ dowolnie przez Pañstwa wybran¹.
package z3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Eq(Equpiment_drop.drop("Armor"));
	  Eq(Equpiment_drop.drop("Sword"));
	  Eq(Equpiment_drop.drop("Boots"));
	  Eq(Equpiment_drop.drop("Weapon"));
	  Eq(Equpiment_drop.drop("Helm"));
	}

	public static void Eq (Equipment anEQ) {
	  anEQ.show_name();
	  anEQ.show_atk();
	  anEQ.show_def();
	  anEQ.show_slot();
	  System.out.println("-----");
	}

	
}
