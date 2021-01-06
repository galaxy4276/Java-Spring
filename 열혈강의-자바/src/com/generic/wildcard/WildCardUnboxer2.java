package com.generic.wildcard;
class Box<T> {
  private T ob;

  public T getOb() {
    return ob;
  }

  public void setOb(T ob) {
    this.ob = ob;
  }

  @Override
  public String toString() {
    return ob.toString();
  }
}

class Unboxer {
  public static <T> T openBox(Box<T> box) {
    return box.getOb();
  }

  public static void peekBox(Box<?> box) {
    System.out.println(box);
  }
}
public class WildCardUnboxer2 {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.setOb("So Simple String");
    Unboxer.peekBox(box);
  }
}
