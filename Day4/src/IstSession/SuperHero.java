package IstSession;
//encapsulation
public class SuperHero {
    private String name;
    private String power;

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    void display(){
        System.out.println("Hero:"+name);
        System.out.println("power:"+power);
    }
    public static void main(String[] args){
        SuperHero hero = new SuperHero();
        hero.setName("Superman");
        hero.setPower("Heat vision");
        hero.display();
        System.out.println(hero.getName());
        System.out.println(hero.getPower());
    }
}
