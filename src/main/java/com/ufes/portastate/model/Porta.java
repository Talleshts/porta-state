/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.portastate.model;

import com.ufes.portastate.state.PortaState;
import java.util.Optional;

/**
 *
 * @author Talles.h.santos
 */
public class Porta {
    private String nome;
    private Boolean aberta;
    private Boolean trancada;
    private PortaState estado;
    

    public Porta(String nome) {
        
    }
    
    
    public void trancar(){
        throw new RuntimeException("Não é possível trancar uma porta " + toString());
    }
    
    public void abrir(){
        throw new RuntimeException("Não é possível abrir uma porta " + toString());
    }
        
    public void destrancar(){
        throw new RuntimeException("Não é possível destrancar uma porta " + toString());        
    }
            
    public void fechar(){
        throw new RuntimeException("Não é possível fechar uma porta " + toString());        
    }
    
    public void setState(PortaState estado){
        
    }
    
}
