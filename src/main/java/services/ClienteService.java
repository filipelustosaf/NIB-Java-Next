package services;

import repositories.ClienteRepository;
import util.CpfUtil;
import entities.Clientes;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(){
        clienteRepository = ClienteRepository.getInstancia();
    }

    public boolean salvar(Clientes clientes){

        if(!CpfUtil.isCPF(clientes.getCpf())){
            return false;
        }

        clienteRepository.salvar(clientes);
        return true;
    }

    public Clientes buscar(String cpf){
        return clienteRepository.buscar(cpf);
    }

}
