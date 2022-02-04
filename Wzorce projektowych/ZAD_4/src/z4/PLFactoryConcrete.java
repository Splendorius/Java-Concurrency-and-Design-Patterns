package z4;

public class PLFactoryConcrete implements AbsFactory {

  @Override
  public Country createCountry() {
    return new Poland();
  }

  @Override
  public City createCity() {
    return new Warsaw();
  }

}
