package com.galaxy4276;

class Box<T> {
  private T ob;

  public T getOb() {
    return ob;
  }

  public void setOb(T ob) {
    this.ob = ob;
  }
}

class BoxFactory {
  public static <T> Box<T> makeBox(T o) {
    Box<T> box = new Box<T>();
    box.setOb(o);
    return box;
  }
}

public class GenericMethodBoxMaker {
  public static void main(String[] args) {
    Box<String> sBox = BoxFactory.makeBox("Sweet");
    System.out.println(sBox.getOb());

    Box<Double> dBox = BoxFactory.makeBox(7.59);
    System.out.println(dBox.getOb());
  }
}
