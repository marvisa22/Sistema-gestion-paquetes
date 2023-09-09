package com.MessengerManagement.messengerManagement.domain.usecase;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.api.IMessengerServicePort;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;

public class MessengerUseCase implements IMessengerServicePort {
    @Override
    public PackageResponseDto packageResponse(PackageDom packageDom) {

        if(packageDom.isValueDeclared()){

        }
        return null;
    }
}
