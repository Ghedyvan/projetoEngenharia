/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ghedyvan
 */
public class Agendamento {
    private int id;
    private Cliente cliente; //Dentro desse objeto será criado um cliente completo, com todos os dados necessários
    private Servico servico; //Dentro desse objeto será criado um servico completo, com todos os dados necessários
    private float valor;
    private Date dataAgendamento;
    private String observacao;

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String dataAgendamento) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.dataAgendamento = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataAgendamento);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String dataAgendamento, String observacao) {
        this(id,cliente,servico,valor, dataAgendamento);
        this.observacao = observacao;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataAgendamento);
    }

    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(dataAgendamento);
    }
    
    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

   
    
}
