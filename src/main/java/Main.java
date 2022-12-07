package View;


import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ghedyvan
 */
public class Main {
    
    public static void main(String[] args){
        
        //Teste 1: Testar se o sistema consegue GRAVAR as informações dos serviços no banco
        Servico servico = new Servico(1, "barba", 30);
        
        //Teste 2: Testar se o sistema consegue RECUPERAR e EXIBIR as informações dos serviços
        System.out.println(servico.getDescricao());  
        System.out.println(servico.getValor());
        
        //Teste 3: Testar se o sistema consegue GRAVAR as informações do cliente no banco 
        Cliente cliente = new Cliente(1, "Riquelme", "Rua da paz", "57240-000");
        
        //Teste 4: Testar se o sistema consegue RECUPERAR e EXIBIR as informações do cliente no banco 
        System.out.println(cliente.getNome());
        
        //Teste 5: Testar se o sistema consegue RECUPERAR e EXIBIR as informações do administrador no banco
        Usuario usuario = new Usuario(1, "Barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        //Teste 6: Testar se o sistema consegue GRAVAR os agendamentos do cliente passado no teste 3
        Agendamento agendamento = new Agendamento(1, cliente, servico, 70, "20/02/2001 20:19");
        
        //Teste 7: Testar se o sistema consegue RECUPERAR e EXIBIR os dados do agendamentos do cliente passado no teste 3
        System.out.println(agendamento.getCliente().getEndereco());
    }
    
}
