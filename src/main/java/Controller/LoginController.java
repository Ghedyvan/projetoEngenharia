/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ControllerHelper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.Menu;

/**
 *
 * @author ghedyvan
 */
public class LoginController {
    
    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Precisa validar o usuario e fazer o login
        //Caso nao seja validado, exibir erro
        //Pega o usuario do view
        Usuario usuario = helper.obterModel();
        //Pesquisa o usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            //Acessa o menu principal
            Menu menu = new Menu();
            menu.setVisible(true);
            //view.setVisible(false);
            view.dispose();
        }
        else{
            view.exibeMensagem("Usuário ou senha inválido");
        }
        
         
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei o fizTarefa");
    }
    
    
    
}
