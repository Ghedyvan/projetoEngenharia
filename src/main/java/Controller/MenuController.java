/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;
import View.Agenda;

/**
 *
 * @author ghedyvan
 */
public class MenuController {
    private final Menu view;

    public MenuController(Menu view) {
        this.view = view;
    }
    
    public void navegarAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        
    }
    
}
