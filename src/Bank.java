abstract class Bank {
    abstract void Customer();

}
class ECW extends Bank {
    @Override
    void Customer() {
        System.out.println(" Bank1 has 12_456 customers");
    }
}
class WEA extends Bank {
    void Customer(){
        System.out.println("Bank2 has 12_677 customers");
    }
}
class Old{
    public static void main(String[] args) {
        Bank bank1 = new ECW();
        bank1.Customer();
        Bank bank2 = new WEA();
        bank2.Customer();
    }
}