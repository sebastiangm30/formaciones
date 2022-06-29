package treinta.reto.java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import treinta.reto.java.models.Person;


public class AdminObjects {

  public static void main(String[] args){

    List<Person> personList = new ArrayList<>();
    String nameThing;
    int age;
    String color;
    long size;
    String eyesColor;

    String aux;
    boolean finish = true;

    while (finish){
      try {
      do{
        nameThing = JOptionPane.showInputDialog("Ingrese un nombre");
      } while (nameThing.isEmpty());

      do{
        aux = JOptionPane.showInputDialog(("Ingrese la edad"));
        age = Integer.parseInt(aux);
      }while (aux.isEmpty());

      do {
        color = JOptionPane.showInputDialog("Ingrese un color");
      } while (color.isEmpty());

      size = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estatura"));

      do {
        eyesColor = JOptionPane.showInputDialog("Ingrese el color de ojos");
      } while (eyesColor.isEmpty());

      Person person = new Person(nameThing, age, color, size, eyesColor);
      personList.add(person);

      personList.forEach(x -> System.out.println(x.toString()));

      if(color.equalsIgnoreCase("Magenta")){
        System.out.println("Esa detective es la pregunta correcta");
        finish = false;
      }
      }catch (Exception e){
        System.out.println(e);
      }
    }

  }

}
