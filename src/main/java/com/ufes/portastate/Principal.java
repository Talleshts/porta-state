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
        } catch (Exception e) {
            System.out.println("Falha: " + e);
        }
    }
}
