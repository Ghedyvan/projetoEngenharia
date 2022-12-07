/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerHelper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ghedyvan
 */
public class AgendaHelper implements IHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
       DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
       tableModel.setNumRows(0);
       //Percorrer a lita preenchendo o table model
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBox2().getModel();
        
        for(Cliente cliente : clientes){
            comboBoxModel.addElement(cliente); 
        }
    }
    
    public void preencherServicos(ArrayList<Servico> servicos){
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBox1().getModel();
        
        for(Servico servico : servicos){
            //comboBoxModel.addElement(servico.getDescricao()); 
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getjComboBox2().getSelectedItem();
    }
    public Servico obterServico() {
        return (Servico) view.getjComboBox1().getSelectedItem();
    }
    public void setarValor(float valor){
        view.getjTextField5().setText(valor+"");
    }

    @Override
    public Agendamento obterModel() {
        String idString = view.getjTextField1().getText(); //ID
        int id = Integer.parseInt(idString); //Converte ID para int
        Cliente cliente = obterCliente(); //Obtem o cliente
        Servico servico = obterServico(); //Obtem o servico
        String valorString = view.getjTextField5().getText(); //Valor
        float valor = Float .parseFloat(valorString); //Converte VALOR para float
        String data = view.getjTextField4().getText(); //Pega a data
        String hora = view.getjTextField6().getText(); //Pega a hora
        String dataHora = data + " " + hora; //Pega ambos formatados
        String observacao = view.getjTextArea1().getText(); //Pega observacao
        
        return new Agendamento(id, cliente, servico, valor, dataHora, observacao);
    }

    @Override
    public void limparTela() {
        view.getjTextField1().setText("0"); //ID
        view.getjTextField6().setText(""); //Data
        view.getjTextField4().setText(""); //Hora
        view.getjTextArea1().setText(""); //Observacao
    }
    
    
    
    
}
