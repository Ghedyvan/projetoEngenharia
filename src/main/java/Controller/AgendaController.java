/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ControllerHelper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author ghedyvan
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    public void atualizaTabela(){
        //Buscar lista com agendamentos do banco
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll(); 
        //Exibir lista na view
        helper.preencherTabela(agendamentos);        
    }
    public void atualizaCliente(){
        //Pega objetos clientes do Banco e mostrar na tela da agenda
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        helper.preencherClientes(clientes);
    }
    public void atualizaServico(){
        //Pega objetos servicos do Banco e mostra na tela da agenda
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        helper.preencherServicos(servicos);
    }
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    public void agendar(){
        //Buscar objeto agendamento da tela
        Agendamento agendamento = helper.obterModel();
        //Salvar objeto agendamento no banco de dados
        new AgendamentoDAO().insert(agendamento);
        //Inserir elemento na tablea
        atualizaTabela();
        helper.limparTela();
    }
   
}
