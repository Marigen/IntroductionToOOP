public class Cats extends Animal {

    public void swim(){

        System.out.println("Кошки не умеют плавать.");

        System.out.println();

    }

    public static void main(String[] args) {

        Cats cat = new Cats();
        cat.run(150);
        cat.run(777);

        cat.swim();

        cat.jump(2);
        cat.jump(5);

    }

}
