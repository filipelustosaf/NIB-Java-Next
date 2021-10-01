package services;

import repositories.ClienteRepository;
import util.CpfUtil;
import entities.Cliente;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(){
        clienteRepository = ClienteRepository.getInstancia();
    }

    public boolean salvar(Cliente cliente){

        if(!CpfUtil.isCPF(cliente.getCpf())){
            return false;
        }

        clienteRepository.salvar(cliente);
        return true;
    }

    public Cliente buscar(String cpf){
        return clienteRepository.buscar(cpf);
    }

}
