package secondSession;
//Abstraction

abstract class Hero{
    private String name;
    public Hero(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    abstract void power();
    public static void information(){
        System.out.println("DC SuperHeros");
    }
}

class WonderWomen extends Hero{
    public WonderWomen(String name){
        super(name);
    }
    @Override
    void power(){
        System.out.println(getname());
    }
}
public class AbstractionDemo {
    public static void main(String[] args){
        Hero h = new WonderWomen("chandu");
        h.power();
        Hero.information();
    }
}
