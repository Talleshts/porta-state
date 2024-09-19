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
public class AbertaState extends PortaState {
    
    public AbertaState(Porta porta) {
        super(porta);
    }
    
    @Override
    public String toString() {
        return "Aberta";
    }
    
    @Override
    public void fechar() {
        System.out.println("Fechando a porta...");
        porta.setState(new FechadaState(porta)); // Transição para estado Fechada
    }
}
