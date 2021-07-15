public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter opponent){

        System.out.println("------------");
        System.out.println(this.name + " hit " + this.damage + " to " + opponent.name);

        if (opponent.dodge()) {
            System.out.println(opponent.name + " dodged " + this.name + "'s attack.");
            return opponent.health;
        }

        return Math.max(opponent.health - this.damage, 0);

    }

    public boolean dodge(){

        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;

    }
}
