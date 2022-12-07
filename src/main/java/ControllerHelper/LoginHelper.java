/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerHelper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author ghedyvan
 */
public class LoginHelper implements IHelper{
    //Pega o model e transforma em dados na tela
    //ou
    //Pega os dados da tela e transforma em model
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModel(){
        String nome = view.getTextUser().getText();
        String senha = view.getTextPassword().getText();
        
        Usuario model = new Usuario(0, nome, senha);
        return model;
    }
    
    public void setModel(Usuario model){
        String name = model.getNome();
        String password = model.getSenha();
        
        view.getTextUser().setText(name);
        view.getTextPassword().setText(password);
    }
    
    public void limparTela(){
        view.getTextUser().setText("");
        view.getTextPassword().setText("");
    }
    
    
    
}
