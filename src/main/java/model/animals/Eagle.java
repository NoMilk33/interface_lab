package model.animals;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IHunt;

public class Eagle implements IAnimal, IFly, IHunt {
     // m
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

   // @Override
    public void hunt() {
        System.out.println("Eagle is hunting");
    }

    public void sleep(){
        System.out.println("Eagle is sleeping");
    }
}
