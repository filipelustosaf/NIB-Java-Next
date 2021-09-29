package repositories;

import entities.Clientes;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private static final ClienteRepository INSTANCIA = new ClienteRepository();

    private List<Clientes> clientes;

    private ClienteRepository(){
        clientes = new ArrayList<>();
    }

    public static ClienteRepository getInstancia(){
        return INSTANCIA;
    }

    public void salvar(Clientes clientes){
        this.clientes.add(clientes);
    }

    public Clientes buscar(String cpf){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCpf().equals(cpf)){
                return clientes.get(i);
            }
        }
        return null;
    }
}
