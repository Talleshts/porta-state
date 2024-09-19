/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.portastate.state;

import com.ufes.portastate.model.Porta;

/**
 *
 * @author Talles.h.santos
 */
public abstract class PortaState {
    protected Porta porta;

    public PortaState(Porta porta) {
        this.porta = porta;
    }

    public void trancar() {
        throw new RuntimeException("Não é possível trancar uma porta " + toString());
    }
    
    public void abrir() {
        throw new RuntimeException("Não é possível abrir uma porta " + toString());
    }
        
    public void destrancar() {
        throw new RuntimeException("Não é possível destrancar uma porta " + toString());        
    }
            
    public void fechar() {
        throw new RuntimeException("Não é possível fechar uma porta " + toString());        
    }
}