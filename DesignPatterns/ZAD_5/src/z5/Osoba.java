package z5;

public class Osoba {
  
  private final String imie;

  private final String nazwisko;
  private final Plec plec;
  private final int wiek;
  private final Kolor_wlosow kolor_wlosow;
  private final String address;
  
  private Osoba (Builder builder) {
    this.imie = builder.imie;
    this.nazwisko = builder.nazwisko;
    this.plec = builder.plec;
    this.wiek = builder.wiek;
    this.kolor_wlosow = builder.kolor_wlosow;
    this.address = builder.address;
  }
  
  public String getImie() {
    return imie;
  }
  public String getNazwisko() {
    return nazwisko;
  }
  public Plec getPlec() {
    return plec;
  }
  public int getWiek() {
    return wiek;
  }
  public Kolor_wlosow getKolor_wlosow() {
    return kolor_wlosow;
  }
  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {

    var sb = new StringBuilder();
    sb
        .append(imie +" ")
        .append(nazwisko);  
    if (plec != null) {
      sb.append(" "+plec);
    }
        
    if (wiek != 0) {
      sb.append(" "+wiek);
    }
    
    if (kolor_wlosow != null) {
      sb.append(" "+kolor_wlosow +" wlosy");
    }
    if (address != null) {
      sb.append(" "+address);
    }
    
    return sb.toString();
  }
  
  public static class Builder {
    
    private final String imie;
    private final String nazwisko;
    private Plec plec;
    private int wiek;
    private Kolor_wlosow kolor_wlosow;
    private String address;
    
  public Builder(String imie, String nazwisko) {
    
    if (imie == null || nazwisko == null) {
      throw new IllegalArgumentException("Imie i Nazwisko musza byc ustalone");
    }
    this.imie=imie;
    this.nazwisko=nazwisko;
  }

  public Builder Gender(Plec plec) {
    this.plec=plec;
    return this;
  }
  
  public Builder Age(int wiek) {
    this.wiek=wiek;
    return this;
  }
  
  public Builder Hair(Kolor_wlosow kolor_wlosow) {
    this.kolor_wlosow=kolor_wlosow;
    return this;
  }
  
  public Builder Addr(String address) {
    this.address=address;
    return this;
  }
  
  public Osoba build() {
    return new Osoba (this);
}

  }
}