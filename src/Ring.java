import java.util.Random;

public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println();
                System.out.println("======== NEW ROUND ===========");

                Random randomizer = new Random();
                int probability = randomizer.nextInt(2);

                if (probability == 0){

                    f2.health = f1.hit(f2); // f1 hits first
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);

                }else{

                    f1.health = f2.hit(f1); // f2 hits first
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);

                }

                if (isWin()){
                    break;
                }
                printScore();


            }

        } else {
            System.out.println("Boxers' weights are not matched!");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Winner : " + f2.name);
            return true;
        } else if (f2.health <= 0){
            System.out.println("Winner : " + f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Health \t:" + f1.health);
        System.out.println(f2.name + " Health \t:" + f2.health);
    }

}
