package Vetores;

public class Vetores {
    public static void main(String[] args) {

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars[3]);

        cars[3] = "Citroen";
        System.out.println(cars[3]);

        System.out.println("");
        //for indexado
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + "-> " + cars[i]);
        }

        System.out.println("");
        int x = 0;
        while (x < cars.length){
            System.out.println(x + "-> " + cars[x]);
            x++;
        }
        //nao indexado - iterativo
        System.out.println("");
        for (String c : cars ) {
            System.out.println(c);
        }
    }
}
