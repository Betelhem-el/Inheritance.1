//inheritance

public class Animal {
    String Fi="All animals ";
    void eat(){
        System.out.println("Eating......");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog - bow bow");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("weeping ........");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("cat - meaow");
    }
}
class NewClass{
    public static void main(String[] args) {
        Puppy an1 = new Puppy();
        System.out.println(an1.Fi);
        an1.weep();
        an1.eat();
        an1.sound();
        System.out.println(".............");
        Cat an2 = new Cat();
        an2.eat();
        an2.sound();


    }
}