package com.MessengerManagement.messengerManagement.adapters.driven.entity;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypeMessenger;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePackage;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypePay;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "package")
@Data
public class PackageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String addressInput;
    private String addressOutput;
    private TypePackage typePackage;
    private Fragility fragility;
    private TypeMessenger typeMessenger;
    private boolean valueDeclared;
    private Integer valueDeclaredNumber;
    private TypePay typePay;

}
