package model.animals;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IPrey;
import model.interfaces.ISwim;

public class Puffin implements IAnimal, IFly, ISwim, IPrey {

    public void eat() {
        System.out.println("Puffin is eating");
    }

    public void prey(){
        System.out.println("Puffin is preying");
    }

    @Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }

    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }


    public void flee() {
        System.out.println("Puffin is fleeing from preditor");
    }
}
