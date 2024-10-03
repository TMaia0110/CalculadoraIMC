
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("############################");
        System.out.println("       Calculadora IMC");
        System.out.println("############################");

        System.out.print("Digite aqui seu peso em kilos: ");
        double peso = sc.nextDouble();

        System.out.print("Digite aqui seu altura em metros: ");
        double altura = sc.nextDouble();
        System.out.println();



        double resultado = imc(altura, peso);
        System.out.println(String.format("O resultado do seu IMC é %.2f", resultado));


    }
    public static double imc(double altura, double peso){
        return peso/(altura*altura);
    }
}