public class Main {

    public static void main(String[] args) {

        // Randomizer in "run" method of "Ring" class determines the fighter who hits first by %50 chance.

        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 5);
        Fighter alex = new Fighter("Alex" , 25 , 100, 100, 20);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }

}
