package services;

import repositories.ClienteRepository;
import util.CpfUtil;
import entities.Cliente;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(){
        clienteRepository = ClienteRepository.getInstancia();
    }

    public boolean salvar(Cliente clientes){

        if(!CpfUtil.isCPF(clientes.getCpf())){
            return false;
        }

        clienteRepository.salvar(clientes);
        return true;
    }

    public Cliente buscar(String cpf){
        return clienteRepository.buscar(cpf);
    }

}
