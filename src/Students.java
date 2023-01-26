public class Students {
    int id;
    String name;
    double bol;

    Students(int id,String name){
        this.id=id;
        this.name=name;
    }
    Students(int id){
        this.id=id;
    }
    Students(int id,String name, double bol){
        this.id=id;
        this.name=name;
        this.bol=bol;
    }
    void display(){
        System.out.println("Name of Student "+name+" And student id is Ru"+id);
        System.out.println(bol +" km from home");
    }
}
class MyNewClass{
    public static void main(String[] args) {
        Students s1 = new Students(123,"Abebe");
        s1.display();
        Students s2 = new Students(193);
        s2.display();
        Students s3 = new Students(134,"kebede",123.8);
        s3.display();
    }
}
