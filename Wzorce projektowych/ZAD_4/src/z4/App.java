package z4;

public class App {

 private Country country;
 private City city;
  
 public App(AbsFactory factory) {
   country=factory.createCountry();
   city=factory.createCity();
 }
 

public void write() {
   country.blank();
   city.blank();
 }
 
}
