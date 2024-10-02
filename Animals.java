public interface Animals{
    void eat();
    void drink();

    public static void main(String[] args) {
        Animals myDog = new Dogs();
        Animals myCat = new Cats();
        myDog.eat();
        myDog.drink();
        myCat.eat();
        myCat.drink();
    }
}
class Dogs implements Animals{
    @Override
    public void eat() {
        System.out.println("Dogs eat Meat");

    }

    @Override
    public void drink() {
        System.out.println("Dogs Drink water");
    }
}
class Cats implements Animals{

    @Override
    public void eat() {
        System.out.println("Cats eat meat and biscuits");
    }

    @Override
    public void drink() {
        System.out.println("cats drink milk");
    }
}