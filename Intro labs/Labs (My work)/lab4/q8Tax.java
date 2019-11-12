public class q8Tax {
  public static void main (String[]args){
      double hourly_pay;
      double tax ;
      double gross_pay;
      int hours;
      double nett_pay;
      
      hourly_pay = 11.75;
      tax = 0.27;
      hours = ((int)(Math.random()*20)+20);
      gross_pay = hourly_pay*hours;
      nett_pay = gross_pay -(gross_pay*tax);
      
      System.out.println("Hours worked: " + hours);
      System.out.println("Gross pay: " + gross_pay);
      System.out.println ("Tax Rate: " + (tax*100) + "%");
      System.out.println ("Nett pay: " + nett_pay);
    }
}    