abstract class Car {
    abstract void run();
    void speed(){
        System.out.println("speed increased");
    }
}
class toyota extends Car{
    void run(){
        System.out.println("high speed");
    }
    toyota(){
        System.out.println("manfactured in here");
    }
}
class Get{
    public static void main(String[] args) {
        Car car1 = new toyota();
        car1.speed();
        car1.run();
    }
}
