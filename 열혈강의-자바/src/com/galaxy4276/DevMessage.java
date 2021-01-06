package com.galaxy4276;

import java.util.InputMismatchException;
import java.util.Scanner;

class ReadAgeException extends Exception {
  public ReadAgeException() {
    super("유효하지 않은 나이가 입력되었습니다.");
  }
}

public class DevMessage {
  public static void main(String[] args) {
    System.out.print("나이 입력: ");

    try {
      int age = readAge();
      System.out.printf("입력된 나이: %d\n", age);
    } catch (ReadAgeException | InputMismatchException e) {
      if (e instanceof ReadAgeException) {
        System.out.println(e.getMessage());
      }

      if (e instanceof InputMismatchException) {
        System.out.println("나이는 숫자 값만 입력할 수 있습니다.");
      }
    }
  }

  public static int readAge() throws ReadAgeException {
    Scanner kb = new Scanner(System.in);
    int age = kb.nextInt();

    if (age <= 0)
        throw new ReadAgeException();

    return age;
  }
}
