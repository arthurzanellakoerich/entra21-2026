package ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ArrayList<> carros = new ArrayList<>();
        List<String> carros = new ArrayList<>();

        carros.add("Fusca");
        carros.add("sp2");
        carros.add("supra");
        carros.add("tracker");

        System.out.println(carros.size());
        System.out.println(carros);

        carros.add("kwid");
        carros.add("ferrari");

        System.out.println(carros.getLast());
        System.out.println(carros.get(2)); //pega o supra que esta na posicao 2
        System.out.println("Total de carros : " + carros.size()); // total de carros
        carros.removeFirst(); //retira o primeiro carro, no caso o fusca
        carros.remove("supra"); // retira o supra que estava na posicao 1 agora
        carros.add(4, "kombi"); // adiciona a kombi na posição 4 no caso a ultima

        System.out.println(carros.toString());
        System.out.println("Total de carros : " + carros.size());

    }
}
