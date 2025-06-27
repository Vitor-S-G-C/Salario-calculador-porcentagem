import entits.Salario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Salario salario = new Salario();

        //caso queira escolher o valor do salario basta remover o comentarios abaixo

        //System.out.println("De quanto e o salario?");
        //salario.salarioAnterior = sc.nextDouble();


        System.out.println("O salário anterior de João é de R$ " + String.format("%.2f", salario.salarioAnterior));
        System.out.print("Qual foi o aumento em porcentagem? ");
        salario.aumento = sc.nextInt();

        System.out.println("Ele teve um aumento de " + salario.aumento + "%, o novo salário é de R$ "
                + String.format("%.2f", salario.novoSalario()));

        sc.close();
    }
}
