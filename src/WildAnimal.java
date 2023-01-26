interface WildAnimal {
    public void eat();
}
class Lion implements WildAnimal{
    public void eat(){
        System.out.println("Lion is Eating.");
    }
}
class Leo implements WildAnimal{
    @Override
    public void eat() {
        System.out.println("Leo is working..");
    }
}
class Newest {
    public static void main(String[] args) {
        WildAnimal lion = new Lion();
        lion.eat();
        Leo leo = new Leo();
        leo.eat();
    }
}
