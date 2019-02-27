public class Animal {

    /*Вариант для кормежки котов по одному*/

    public void eat(int a){

        int foodVolume = (int) (Math.random() * 20); //Объем еды

        System.out.println("Вы положили " + foodVolume + " гр. еды.");

        if (a <= foodVolume){

            System.out.println("Ура! Вы накормили кота.");

        } else {

            System.out.println("Маловато будет!");

        }

    }

}