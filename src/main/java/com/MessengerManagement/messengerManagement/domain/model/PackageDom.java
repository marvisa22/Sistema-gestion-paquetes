package com.MessengerManagement.messengerManagement.domain.model;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypeMessenger;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePackage;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePay;


public class PackageDom {
    private String addressInput;
    private String addressOutput;
    private TypePackage typePackage;
    private Fragility fragility;
    private TypeMessenger typeMessenger;
    private boolean valueDeclared;
    private Double valueDeclaredNumber;
    private TypePay typePay;


    public PackageDom(String addressInput, String addressOutput, TypePackage typePackage, Fragility fragility, TypeMessenger typeMessenger, boolean valueDeclared, Double valueDeclaredNumber, TypePay typePay) {
        this.addressInput = addressInput;
        this.addressOutput = addressOutput;
        this.typePackage = typePackage;
        this.fragility = fragility;
        this.typeMessenger = typeMessenger;
        this.valueDeclared = valueDeclared;
        this.valueDeclaredNumber = valueDeclaredNumber;
        this.typePay = typePay;
    }

    public PackageDom() {
    }

    public String getAddressInput() {
        return addressInput;
    }

    public void setAddressInput(String addressInput) {
        this.addressInput = addressInput;
    }

    public String getAddressOutput() {
        return addressOutput;
    }

    public void setAddressOutput(String addressOutput) {
        this.addressOutput = addressOutput;
    }

    public TypePackage getTypePackage() {
        return typePackage;
    }

    public void setTypePackage(TypePackage typePackage) {
        this.typePackage = typePackage;
    }

    public Fragility getFragility() {
        return fragility;
    }

    public void setFragility(Fragility fragility) {
        this.fragility = fragility;
    }

    public TypeMessenger getTypeMessenger() {
        return typeMessenger;
    }

    public void setTypeMessenger(TypeMessenger typeMessenger) {
        this.typeMessenger = typeMessenger;
    }

    public boolean isValueDeclared() {
        return valueDeclared;
    }

    public void setValueDeclared(boolean valueDeclared) {
        this.valueDeclared = valueDeclared;
    }

    public Double getValueDeclaredNumber() {
        return valueDeclaredNumber;
    }

    public void setValueDeclaredNumber(Double valueDeclaredNumber) {
        this.valueDeclaredNumber = valueDeclaredNumber;
    }

    public TypePay getTypePay() {
        return typePay;
    }

    public void setTypePay(TypePay typePay) {
        this.typePay = typePay;
    }
}
