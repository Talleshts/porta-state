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
public class TrancadaState extends PortaState{

    public TrancadaState(Porta porta) {
        super(porta);
    }
    
    @Override
    public String toString(){
        return "Trancada";
    }
    
    @Override
    public void destrancar(){
        
    }
}
