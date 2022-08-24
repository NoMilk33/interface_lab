package model.animals;

import model.interfaces.IAnimal;
import model.interfaces.ISwim;
import model.interfaces.IPrey;
public class Seal implements IAnimal, ISwim, IPrey {

    public void eat() {
        System.out.println("Seal is eating");
    }

    @Override
    public void prey(){
        System.out.println("Seal is preying");
    }


    public void sleep() {
        System.out.println("Seal is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Seal is swimming");
    }

    public void flee() {
        System.out.println("Seal is fleeing from a predator");
    }
}
