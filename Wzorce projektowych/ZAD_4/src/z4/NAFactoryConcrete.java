package z4;

public class NAFactoryConcrete implements AbsFactory {

  @Override
  public Country createCountry() {
    return new USA();
  }

  @Override
  public City createCity() {
    return new Chicago();
  }
}
