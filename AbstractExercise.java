//2- create abstract class Animal and try to create 3 object from that. YOU CAN USE CHATGPT
//
//Deadline : 3.58pm
public class AbstractExercise {
    public static void main(String[] args){
        Animal lion = new Lion("Ethiopia");
        Animal dog = new Dog("Tom");
        Animal cat = new Cat("Dodi");
        lion.action();
        dog.action();
        cat.action();
        dog.makeSound();
        cat.makeSound();
    }
}

abstract class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }

    public void action(){
        System.out.println(name+ " is eating");
    }
    public void makeSound(){
        System.out.println("Different Animals sound");
    }

}
//3- create lion, dog and cat classes from Animal class and create
// an objects from these 3 class then use action function.

class Lion extends Animal{
    public Lion(String name){
        super(name);
    }

    @Override
    public void action() {
        super.action();
    }


}
class Dog extends Animal{
    public Dog(String name){
        super(name);

    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public void makeSound() {
        System.out.println(name+ " says woofwofwoof");
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void action(){
        super.action();
    }

    @Override
    public void makeSound() {
        System.out.println(name +" says meaoooo");
    }
}
