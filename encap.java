class animal{
    void eat(){
        System.out.println("Eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Braking");
    }
}
public class encap{
    public static void main(String args[]){
        dog Dog=new dog();
        Dog.eat();
        Dog.bark();

    }
}
