package com.MessengerManagement.messengerManagement.adapters.driving.handler;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.PackageRequestDto;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.adapters.driving.mapper.IPackageRequestMapper;
import com.MessengerManagement.messengerManagement.domain.api.IMessengerServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessengerHandlerImp implements IMessengerHandler {
    private IMessengerServicePort messengerServicePort;
    private IPackageRequestMapper packageRequestMapper;
    @Override
    public PackageResponseDto createPackage(PackageRequestDto packageRequestDto) {
        return messengerServicePort.packageResponse(packageRequestMapper.toPackageDom(packageRequestDto));
    }
}
