package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    private String cpf;
    private String nome;

    @Override
    public String toString() {
        return "Nome = '" + nome + '\'' +
                ", CPF = '" + cpf + '\'';
    }
}
