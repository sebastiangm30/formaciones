package java.models;

public class Thing {

  private String nameThing;
  private int age;
  private String color;

  public Thing(String nameThing, int age, String color) {
    this.nameThing = nameThing;
    this.age = age;
    this.color = color;
  }

  public String getNameThing() {
    return nameThing;
  }

  public void setNameThing(String nameThing) {
    this.nameThing = nameThing;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
