package user.mbolle.main;

import user.mbolle.core.CaesarsCipher;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    //goes entry of the application
    CaesarsCipher applicationCore = new CaesarsCipher();
    Scanner inputListener = new Scanner(System.in);

    System.out.println("This application is made by Mathias © 2020\nAll rights reserved.\nApache License, Version 2.0");

    System.out.println("Give three letters of the alfabeth:\n");
    applicationCore.setInput(inputListener.nextLine());
    System.out.println("Give a key (int form):\n");
    applicationCore.setKey(inputListener.nextInt());

    //print result
    System.out.printf("The result of your input is %s", applicationCore.result());
    System.out.println("\nPress any key to quit this program...");
    inputListener.nextLine();
  }
}
