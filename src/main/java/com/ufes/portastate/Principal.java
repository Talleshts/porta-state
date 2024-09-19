/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ufes.portastate;

import com.ufes.portastate.model.Porta;

/**
 *
 * @author Talles.h.santos
 */
public class Principal {

    public static void main(String[] args) {
        try {
            Porta porta = new Porta("Porta 1");
            porta.abrir();
            porta.fechar();
            porta.trancar();
            porta.destrancar();
            porta.abrir();
            
            System.out.println("\nInserindo nova porta!\n");
            
            Porta portaLab = new Porta("Porta do Laboratório");
            portaLab.abrir();
            portaLab.fechar();
            portaLab.trancar();
            portaLab.abrir();
        } catch (Exception e) {
            System.out.println("Falha: " + e.getMessage());
        }
    }
}