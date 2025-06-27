package entits;

public class Salario {

    //caso queira escolher o valor do salario basta deixar a linha de baico assim: public double salarioAnterior;
    public double salarioAnterior = 6000.00;
    public int aumento;

    public double novoSalario() {
        return salarioAnterior + ((aumento * salarioAnterior) / 100);
    }
}
