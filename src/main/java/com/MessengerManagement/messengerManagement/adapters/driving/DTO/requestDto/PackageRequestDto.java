package com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypeMessenger;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePackage;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePay;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@Getter
public class PackageRequestDto {
    @NotBlank
    private String addressInput;
    @NotBlank
    private String addressOutput;
    @Enumerated(EnumType.STRING)
    private TypePackage typePackage;
    @Enumerated(EnumType.STRING)
    private Fragility fragility;
    @Enumerated(EnumType.STRING)
    private TypeMessenger typeMessenger;
    private boolean valueDeclared;
    private Integer valueDeclaredNumber;
    @Enumerated(EnumType.STRING)
    private TypePay typePay;

}
