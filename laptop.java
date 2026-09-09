public class laptop {
    String name="";
    String proc ="";
    int ram=0;
    int price=0;

    public static void main(String []args){
        laptop lap1=new laptop();//syntax for call the class
        lap1.name="macbook";
        lap1.proc="i5";
        lap1.ram=4;
        lap1.price=78000;

        laptop lap2=new laptop();
        lap2.name="lenovo";
        lap2.proc="i7";
        lap2.ram=8;
        lap2.price=90000;
        System.out.println(lap2.name+" laptop price is"+lap2.price);
    }

    
}
