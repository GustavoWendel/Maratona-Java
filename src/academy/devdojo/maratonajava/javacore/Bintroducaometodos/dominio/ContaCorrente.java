package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ContaCorrente {

    private String numero;
    private String agencia;
    private boolean especial;
    private double limiteEspecial;
    private double saldo;

    public boolean saca(double valorSaque) {
        if(saldo >= valorSaque) {
            this.saldo -= valorSaque;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
    }

    public void consultar() {
        System.out.println("Saldo atual da conta = " + saldo);
    }
}
