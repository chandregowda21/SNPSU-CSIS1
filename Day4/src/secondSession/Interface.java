package secondSession;

import java.security.spec.RSAOtherPrimeInfo;

interface Humen{
    void power();
    default void identity(){
        System.out.println("Gangadhar");
    }
}

interface Energy{
    default void energy(){
        System.out.println("sun");
    }
}
class ShaktiMan implements Humen,Energy{
    @Override
    public void power(){
        System.out.println("Five elements");
    }
    @Override
    public void energy(){
        System.out.println("sun+++");
    }
}
public class Interface {
    public static void main(String[] args){
        Humen h = new ShaktiMan();
        Energy e = new ShaktiMan();
        h.power();
        h.identity();
        e.energy();
    }
}
