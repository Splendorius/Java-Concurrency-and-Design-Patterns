/////* Zadanie 1. Zaimplementowaæ operatory +, -, *, / dla klasy Money

package z1;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.*;

public final class Money {

  private BigDecimal amount;

  static MathContext m = new MathContext(4);
  private Currency currency;

  private Money(BigDecimal amount, Currency currency) {
    this.amount = amount;
    this.currency = currency;
  }
  
  private Money(String amount, Currency currency) {
    this(new BigDecimal(amount), currency);
  }
    
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((amount == null) ? 0 : amount.hashCode());
    result = prime * result + ((currency == null) ? 0 : currency.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Money other = (Money) obj;
    if (amount == null) {
      if (other.amount != null)
        return false;
    } else if (!amount.equals(other.amount))
      return false;
    if (currency != other.currency)
      return false;
    return true;
  }
  
  private static Money add(Money T1, Money T2) {
    Money Z3 = new Money("0", Currency.PLN);
    Money Z4 = new Money("0", Currency.PLN);
   
   Z3.currency=T1.currency;
   
     if (T1.currency == T2.currency) { 
       
       Z3.amount = T1.amount.add(T2.amount);
     }
     if((T1.currency == Currency.PLN) && (T2.currency == Currency.EU)) {
       
       Z4.amount=T2.amount.multiply((new BigDecimal ("4.6")), m);
       Z3.amount = T1.amount.add(Z4.amount);
     }
     
     if((T1.currency == Currency.PLN) && (T2.currency == Currency.USD)) {
       
       Z4.amount=T2.amount.multiply((new BigDecimal ("4.05")), m);
       Z3.amount = T1.amount.add(Z4.amount);
     }
     
     if((T1.currency == Currency.EU) && (T2.currency == Currency.USD)) {
       
       Z4.amount=T2.amount.multiply((new BigDecimal ("0.88")), m);
       Z3.amount = T1.amount.add(Z4.amount);
     }
     
     if((T1.currency == Currency.EU) && (T2.currency == Currency.PLN)) {
       
       Z4.amount=T2.amount.multiply((new BigDecimal ("0.22")), m);
       Z3.amount = T1.amount.add(Z4.amount);
     }
     
     if((T1.currency == Currency.USD) && (T2.currency == Currency.EU)) {
       Z4.amount=T2.amount.multiply((new BigDecimal ("1.13")), m);
       Z3.amount = T1.amount.add(Z4.amount);
     }
     
     if((T1.currency == Currency.USD) && (T2.currency == Currency.PLN)) {
       Z4.amount=T2.amount.multiply((new BigDecimal ("0.25")), m);
       Z3.amount = T1.amount.add(Z4.amount);
     }
     
    return Z3;
    }
 
  private static Money Minus(Money T1, Money T2) {
    Money Z3 = new Money("0", Currency.PLN);
    Money Z4 = new Money("0", Currency.PLN);
    Z3.currency=T1.currency;
    
      if (T1.currency == T2.currency) { 
        
        Z3.amount = T1.amount.subtract(T2.amount);
      }
      if((T1.currency == Currency.PLN) && (T2.currency == Currency.EU)) {
        
        Z4.amount=T2.amount.multiply((new BigDecimal ("4.6")), m);
        Z3.amount = T1.amount.subtract(Z4.amount);
      }
      
      if((T1.currency == Currency.PLN) && (T2.currency == Currency.USD)) {
        
        Z4.amount=T2.amount.multiply((new BigDecimal ("4.05")), m);
        Z3.amount = T1.amount.subtract(Z4.amount);
      }
      
      if((T1.currency == Currency.EU) && (T2.currency == Currency.USD)) {
        
        Z4.amount=T2.amount.multiply((new BigDecimal ("0.88")), m);
        Z3.amount = T1.amount.subtract(Z4.amount);
      }
      
      if((T1.currency == Currency.EU) && (T2.currency == Currency.PLN)) {
        
        Z4.amount=T2.amount.multiply((new BigDecimal ("0.22")), m);
        Z3.amount = T1.amount.subtract(Z4.amount);
      }
      
      if((T1.currency == Currency.USD) && (T2.currency == Currency.EU)) {
        Z4.amount=T2.amount.multiply((new BigDecimal ("1.13")), m);
        Z3.amount = T1.amount.subtract(Z4.amount);
        
      }
      
      if((T1.currency == Currency.USD) && (T2.currency == Currency.EU)) {
        Z4.amount=T2.amount.multiply((new BigDecimal ("0.25")), m);
        Z3.amount = T1.amount.subtract(Z4.amount);
        
      }
       
     return Z3;
     }
  
  private static Money mult(Money T1,double d) {
    Money Z3 = new Money("0", T1.currency);
    Z3.amount=T1.amount.multiply(new BigDecimal(Double.toString(d)), m);
    return Z3;
  }
  
  private static Money div(Money T1,double d) {
    Money Z3 = new Money("0", T1.currency);
    Z3.amount=T1.amount.divide(new BigDecimal(Double.toString(d)), m);
    return Z3;
  }
  
  public static void main(String[] args) {
    
    Money PLN1 = new Money("1000", Currency.PLN);
    Money EU1 = new Money("1000", Currency.EU);  
    Money USD1 = new Money("1000", Currency.USD); 
    Money M1,M3,M4,M5;
    DecimalFormat df = new DecimalFormat("#,###.00");
        
    M1=add(PLN1,EU1);
    System.out.println(M1.currency + " M1_add " +df.format(M1.amount));
    
    System.out.println("-----------");
    
    M3=Minus(PLN1,USD1);
    System.out.println(M3.currency + " M3_minus " +df.format(M3.amount));
    
    System.out.println("-----------");

    M4=mult(EU1,5);
    System.out.println(M4.currency + " M5_mult " +df.format(M4.amount)); 
    
    System.out.println("-----------");
    M5=div(USD1,5);
    System.out.println(M5.currency + " M5_div " +df.format(M5.amount)); 
    
    
    
  }
}
