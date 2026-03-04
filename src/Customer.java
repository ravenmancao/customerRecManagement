/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raven Mancao
 */
/*
gumamit ako ng private keyword para restricted ang access sa mga class (field, methods, & contructors)
at ang kaya lang nila ma-access ay ang kaparehas nito na class
*/
public class Customer {
   private int customerId;
   private String fullName;
   private int phoneNumber;
   private String address;
   private String driverLicense;
   
   //panibagong customer object (constructor)
   public Customer(int customerId, String fullName, int phoneNumber, String address,
           String driverLicense){
       
       //gumamit ako ng this.(variable name)
       //para malinaw na yung inassign ko ay instance variable ng class at hindi ang parameter lang ng constructor
       this.customerId = customerId;
       this.fullName = fullName;
       this.phoneNumber = phoneNumber;
       this.address = address;
       this.driverLicense = driverLicense;
   }

   //method para makuha ang customerId
    public int getCustomerId() {
        return customerId; //ibabalik nito yung value ng customerId
    }
   
}
