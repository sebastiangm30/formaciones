package java.models;

public class Person extends Thing{

  private long size;
  private String eyesColor;

  public Person(String nameThing, int age, String color, long size, String eyesColor) {
    super(nameThing, age, color);
    this.size = size;
    this.eyesColor = eyesColor;
  }

  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public String getEyesColor() {
    return eyesColor;
  }

  public void setEyesColor(String eyesColor) {
    this.eyesColor = eyesColor;
  }

  @Override
  public String toString(){
    String out = new String();
    out = "nombre: " + getNameThing() + " Edad: " + getAge();
    return out;
  }
}
