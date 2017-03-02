/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanillaframe;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Your Name <Juan A. García Muelas (juangmuelas@hotmail.com)>
 */
class OyenteAccion implements ActionListener{

    private Object boton;
    private Object etiqueta;
    //Cuando se pinche el botón
    public void actionPerformed(ActionEvent evento){
        JButton JButton = (JButton) evento.getSource();
        etiqueta.setText("Botón pulsado:"+ boton.getText());
    }
    
    public static void main(String args[]){
        Ventanilla ventana=new Ventanilla();
        ventana.setTitle("Título de la ventana");
        ventana.setSize(350,80);
        ventana.setVisible(true);
    }
    
}
