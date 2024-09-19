/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.portastate.model;

import com.ufes.portastate.state.FechadaState;
import com.ufes.portastate.state.PortaState;
import java.util.Optional;

/**
 *
 * @author Talles.h.santos
 */
public class Porta {
    private String nome;
    private PortaState estado;

    public Porta(String nome) {
        this.nome = nome;
        this.estado = new FechadaState(this); // Porta começa fechada
        System.out.println(nome + " criada e está no estado: " + estado);
    }

    public void trancar() {
        estado.trancar();
    }

    public void abrir() {
        estado.abrir();
    }

    public void destrancar() {
        estado.destrancar();
    }

    public void fechar() {
        estado.fechar();
    }

    public void setState(PortaState estado) {
        this.estado = estado;
        System.out.println("Porta agora está no estado: " + estado);
    }

    @Override
    public String toString() {
        return this.nome;
    }
}