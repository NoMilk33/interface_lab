package model.animals;

import model.interfaces.IAnimal;
import model.interfaces.ISwim;
import model.interfaces.IRun;
import model.interfaces.IHunt;

// Hint: missing an interface and a method implementation
public class Tiger implements IAnimal, ISwim, IRun, IHunt{

    @Override
    public void run() {
        System.out.println("Tiger is running");
    }
    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    @Override
    public void sleep(){
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void eat(){
        System.out.println("Tiger is eating");
    }

    @Override
    public void hunt(){
        System.out.println("Tiger is hunting");
    }
}
