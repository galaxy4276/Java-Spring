package com.BoundedWildcardBase;

class Box<T> {
  private T ob;
  public T get() { return ob; }
  public void set(T ob) { this.ob = ob; }
}

class Toy {
  @Override
  public String toString() {
    return "I am a Toy";
  }
}

class BoxContentsMover {
  // from 에 저장된 내용물을 to로 이동
  public static void moveBox(Box<? super Toy> to, Box<? extends Toy> from) {
    to.set(from.get());
  }
}

public class Index {
  public static void main(String[] args) {
    Box<Toy> box1 = new Box<>();
    box1.set(new Toy());

    Box<Toy> box2 = new Box<>();
    BoxContentsMover.moveBox(box2, box1);
    System.out.println(box2.get());
  }
}
