package com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypeMessenger;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePackage;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePay;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PackageResponseDto {
    private String addressInput;
    private String addressOutput;
    private TypePackage typePackage;
    private Fragility fragility;
    private TypeMessenger typeMessenger;
    private boolean valueDeclared;
    private Double valueDeclaredNumber;
    private TypePay typePay;
    private Double valueService;

    public PackageResponseDto(String addressInput, String addressOutput, TypePackage typePackage, Fragility fragility, TypeMessenger typeMessenger, boolean valueDeclared, Double valueDeclaredNumber, TypePay typePay, Double valueService) {
        this.addressInput = addressInput;
        this.addressOutput = addressOutput;
        this.typePackage = typePackage;
        this.fragility = fragility;
        this.typeMessenger = typeMessenger;
        this.valueDeclared = valueDeclared;
        this.valueDeclaredNumber = valueDeclaredNumber;
        this.typePay = typePay;
        this.valueService = valueService;
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

    public Double getValueService() {
        return valueService;
    }

    public void setValueService(Double valueService) {
        this.valueService = valueService;
    }
}
