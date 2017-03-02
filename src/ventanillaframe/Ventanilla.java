/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanillaframe;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Your Name <Juan A. García Muelas (juangmuelas@hotmail.com)>
 */
public class Ventanilla extends JFrame{
    
    //Declaramos las variables
    JLabel etiqueta;
    JButton botonUno, botonDos;
    JPanel panel;
    
    //Creamos el constructor con los componentes
    public Ventanilla(){
        etiqueta= new JLabel ("La etiqueta:");
        botonUno= new JButton ("Uno");
        botonDos= new JButton ("Dos");
        panel= new JPanel();
        
        //Añadimos los componentes al panel
        panel.add(etiqueta);
        panel.add(botonUno);
        panel.add(botonDos);
        
       //Añadimos el panel al Frame
       getContentPane().add(panel);
       
       //Crear objeto de la clase oyecnte para cuando se pulse el botón
       OyenteAccion oyenteBoton = new OyenteAccion();
       
       //Registrar el objeto como oyente en los dos botones.
       botonUno.addActionListener((ActionListener) oyenteBoton);
       botonDos.addActionListener((ActionListener) oyenteBoton);
           
    }
    
    
}
