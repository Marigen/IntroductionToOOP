public class Cats extends Animal {

    private String name;
    private int emptyVolume;

    public Cats(String name, int emptyVolume){

        this.name = name;
        this.emptyVolume = emptyVolume;

    }

    public static void main(String[] args) {

        Cats[] cat = new Cats[5];

        cat[0].eat(5); //= new Cats("Барсик", 5);
        /*cat[1] = new Cats("Мурзик", 15);
        cat[2] = new Cats("Мурка", 10);
        cat[3] = new Cats("Черныш", 7);
        cat[4] = new Cats("Дымка", 2);*/

    }

}
