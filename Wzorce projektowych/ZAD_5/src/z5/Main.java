//* Zadanie 5. Wykorzystaj wzorzec Builder do realizacji dowolnie wybranego celu.

//to do 


//BUILDER
package z5;

public class Main {

	public static void main(String[] args) {

	  var osoba1= new Osoba.Builder("Jan", "Kowalski")
	      .Age(18)
	      .Gender(Plec.M)
	      .Hair(Kolor_wlosow.Czarne)
	      .Addr("Losowa ulica 9, Warszawa")
	      .build();

    var osoba2= new Osoba.Builder("Anna", "Nowak")
        .Age(21)
        .Gender(Plec.F)
        .build();
	  
	  System.out.println(osoba1.toString());

	  System.out.println(osoba2.toString());
	    
	  
	}

}
