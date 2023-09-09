package com.MessengerManagement.messengerManagement.domain.usecase;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.api.IMessengerServicePort;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;

public class MessengerUseCase implements IMessengerServicePort {
    @Override
    public PackageResponseDto packageResponse(PackageDom packageDom) {

        Integer valueSecure;

        if(packageDom.isValueDeclared()){

            Double value = packageDom.getValueDeclaredNumber();

            if(packageDom.getTypePackage().equals(Fragility.NORMAL)) {
               valueSecure = (int) (value * 0.01);
            } else if (packageDom.getTypePackage().equals(Fragility.FRAGILE)) {
                valueSecure = (int) (value * 0.05);
            } else {
                valueSecure = (int) (value * 0.1);
            }
        }


        return null;
    }
}
