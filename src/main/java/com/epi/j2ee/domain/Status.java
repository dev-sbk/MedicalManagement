/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epi.j2ee.domain;

/**
 *
 * @author DEV-PC
 */

public enum Status {
     ACTIVE("ACTIVE"),ATTENTE("ATTENTE"),ANNULER("ANNULER");
    private final String typeStatus;
    private Status(String typeStatus) {
        this.typeStatus = typeStatus;
    }

    public String getTypeStatus() {
        return typeStatus;
    } 
}
