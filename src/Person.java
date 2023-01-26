interface Person{
    void perMonth(int a);
    void perYear(int a);
}
class Salary implements Person{
    int year;
    int month;

    @Override
    public void perMonth(int month) {
        this.month=month;
    }

    @Override
    public void perYear(int year) {
        year = month*12;
    }
    public void display(){
        System.out.println("salary per month is : "+month);
        System.out.println("salary per year is : "+ year);
    }
}
class Rent implements Person{
    int house;
    int personal;

    @Override
    public void perMonth(int personal) {
        this.personal=personal;
    }

    @Override
    public void perYear(int a) {
       house = (house + personal)* 12;
    }
    void display2(){
        System.out.println("rent pesonal monthly "+personal);
        System.out.println("rent house per year "+house);
    }
}
class rents{
    public static void main(String[] args) {
        Salary s1 = new Salary();
        s1.perMonth(12);
        s1.perYear(123);
        System.out.println("satus: ");
        s1.display();

        Rent r1 = new Rent();
        r1.perMonth(124);
        r1.perYear(1235);
        System.out.println("status: ");
        r1.display2();


    }
}