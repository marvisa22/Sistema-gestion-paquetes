package com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypeMessenger;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePackage;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePay;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
public class PackageRequestDto {
    @NotBlank
    private String addressInput;
    @NotBlank
    private String addressOutput;
    private TypePackage typePackage;
    private Fragility fragility;
    private TypeMessenger typeMessenger;
    private boolean valueDeclared;
    private Integer valueDeclaredNumber;
    private TypePay typePay;

}
