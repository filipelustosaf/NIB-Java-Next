package guis;


import entities.Cliente;
import services.ClienteService;

import java.util.Scanner;

public class ClienteGui {

    private ClienteService clienteService;

    public ClienteGui(){
        clienteService = new ClienteService();
    }

    public void exibeMenu(){
        Scanner leTeclado = new Scanner(System.in);

        int opcaoMenu = 0;

        do{
            System.out.println("Selecione a opção desejada");
            System.out.println(" 1 - Cadastrar Cliente");
            System.out.println(" 2 - Consultar Cliente");
            System.out.println(" 3 - Sair");

            opcaoMenu = leTeclado.nextInt();

            switch (opcaoMenu){
                case 1:
                    salvar(leTeclado);
                    break;
                case 2:
                    buscar(leTeclado);
                    break;
                case 3:
                    break;
            }

        }while (opcaoMenu != 3);

        System.out.println("Obrigado por usar o NIB");
        leTeclado.close();
    }

    private void salvar(Scanner leTeclado){
        System.out.println("Digite o cpf do cliente");
        String cpf = leTeclado.next();

        System.out.println("Digite o nome do Cliente");
        String nome = leTeclado.next();

        Cliente clientes = new Cliente(cpf, nome, null);

        boolean clienteFoiCadastrado = clienteService.salvar(clientes);

        if(clienteFoiCadastrado){
            System.out.println("O cliente foi cadastrado com sucesso");
        }else{
            System.out.println("Erro ao cadastrar cliente. Verifique os dados e tente novamente.");
        }
    }

    private void buscar(Scanner leTeclado){
        System.out.println("Digite o cpf");
        String cpf = leTeclado.next();

        Cliente clientes = clienteService.buscar(cpf);
        if(clientes == null){
            System.out.println("Cpf não encontrado");
        }else{
            System.out.println("Cliente: " + clientes);
        }
    }
}