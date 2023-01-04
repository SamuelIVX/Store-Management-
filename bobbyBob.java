import java.io.*;
import java.util.*;

public class bobbyBob {

  private String address; 
  private String name;   
  

  /*
   * Constructor to set both variables to default values
   */
  public bobbyBob() {
    address = "unknown";
    name = "unknown";
  }
  

  /*
   * parameterized constructor
   */
  public bobbyBob(String newAddress, String newName) {
    address = newAddress;
    name = newName;
  }

  /*
   * Returns the current value of address
   */
  public String getAddress() {
    return address;
  }

  /*
   * Returns the current value of name
   */
  public String getName() {
    return name;
  }

  /*
   * Updates the address to the new address
   */
  public void setAddress(String newAddress) {
    address = newAddress;
  }

  /* updates the 
   */
  public void setName(String newName) {
    name = newName;
  }

  public String toStringBob() {
    return "\nName: " + name  + "\nAddress: " + address;
  }
}