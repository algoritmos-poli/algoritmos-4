package ejemplo2;

/**
   This program runs a simple test
   of the CellPhone class.
*/

public class CellPhoneTest
{
   public static void main(String[] args)
   {
      String testMan;   // To hold a manufacturer
      String testMod;   // To hold a model number
      double testPrice; // To hold a price
      
      
      // Create an instance of the CellPhone class,
      CellPhone phone = new CellPhone("Acme electronics", "M1000", 199.99);

      // Get the data from the phone and display it.
      System.out.println();
      System.out.println("Here is the data that you provided:");
      System.out.println("Manufacturer: " + phone.getManufact());
      System.out.println("Model number: " + phone.getModel());
      System.out.println("Retail price: " + phone.getRetailPrice());
   }
}