package com.baris;

import javax.swing.*;
import java.util.ArrayList;

public class Safari {

    public static void main(String[] args)
    {
    Snake python = new Snake(3,"Python");
    python.isOmniveres();
    python.setLegs(0);

    Elephant AfricanElephant=new Elephant(8,"African Elephant");
    AfricanElephant.setLegs(4);

    ArrayList<Animal> allAnimal =new ArrayList<>();
    allAnimal.add(python);
    allAnimal.add(AfricanElephant);
    for (Animal i:allAnimal)
    {
      String  AllAnimalInto=   " Name :"  + i.name + " Age : " + i.age
              + "\n Legs :" +i.getLegs() + " Is Omniveres " + i.Omniveres;
        JOptionPane.showMessageDialog(null,AllAnimalInto);
        i.move();
    }


    }
}
