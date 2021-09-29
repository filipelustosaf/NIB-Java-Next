package entities;

public class Poupanca extends Contas {

    public void renderJuros(){
        double saldoAtual = getSaldo();
        setSaldo(saldoAtual * 1.005);
    }
}
