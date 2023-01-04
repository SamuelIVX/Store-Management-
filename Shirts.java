import java.io.*;
import java.util.*;

public class Shirts extends bobbyBob {
  private String size;
  private String Sleeves;

  public Shirts() {
    size = "small";
    Sleeves = "short";
  }

  public Shirts(String newSize, String newSleeves) {
    size = newSize;
    Sleeves = newSleeves;
  }

  public String getSize() {
    return size;
  }

  public String getSleeves() {
    return Sleeves;
  }

  public void setSize(String newSize) {
    size = newSize;
  }

  public void setSleeves(String newSleeves) {
    Sleeves = newSleeves;
  }

  public String toStringShirts() {
    return "\nSize of Shirt: " + size  + "\nShort or Long Sleeved: " + Sleeves;
  }
}