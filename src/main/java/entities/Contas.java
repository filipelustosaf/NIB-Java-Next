package entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contas {

    private String numero;
    private double saldo;
    private String senha;

    public void creditar(double valor){
        saldo += valor;
    }

    public void debitar(double valor){
        saldo -= valor;
    }

    // Fazer o método transferir
}
