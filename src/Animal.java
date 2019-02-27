public class Animal {

    public void run(int a){

        double b = (int) (Math.random() * 1000);

        if (a <= b){
            System.out.println("Может пробежать " + a + " из " + b);
        } else {
            System.out.println("Слишком далеко");
        }

        System.out.println();

    }

    public void swim(int a){

        double b = (int) (Math.random() * 1000);

        if (a <= b){
            System.out.println("Может проплыть " + a + " из " + b);
        } else {
            System.out.println("Слишком далеко");
        }

        System.out.println();

    }

    public void jump(int a){

        double b = (int) (Math.random() * 10);

        if (a <= b){
            System.out.println("Может подпрыгнуть на " + a + " из " + b);
        } else {
            System.out.println("Слишком высоко");
        }

        System.out.println();

    }

}