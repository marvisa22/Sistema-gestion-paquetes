package com.MessengerManagement.messengerManagement.adapters.driving.handler;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.PackageRequestDto;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;

public interface IMessengerHandler {
    PackageResponseDto createPackage(PackageRequestDto packageRequestDto);
}
