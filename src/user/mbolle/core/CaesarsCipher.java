package user.mbolle.core;

public class CaesarsCipher {

  private String input;
  private int key;

  private char[] alfabeth = "abcdefghijklmnopqrstuvwxyz".toCharArray();

  public CaesarsCipher(String input, int key) {
    this.input = input;
    this.key = key;
  }
  public CaesarsCipher() {
    //empty constructor
  }

  public String result() {
    String result = "";
    int counter = 0;
    while (input.toCharArray()[0] != alfabeth[counter]) {
      counter++;
    }
    result +=alfabeth[counter];
    result +=alfabeth[++counter];
    result +=alfabeth[++counter];
    return result;
  }

  public void setInput(String input) {
    this.input = input;
  }
  public void setKey(int key) {
    this.key = key;
  }
}
