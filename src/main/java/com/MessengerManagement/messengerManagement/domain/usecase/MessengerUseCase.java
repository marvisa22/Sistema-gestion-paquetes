package com.MessengerManagement.messengerManagement.domain.usecase;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.Fragility;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.EnumDto.TypeMessenger;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.api.IMessengerServicePort;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;
import com.MessengerManagement.messengerManagement.domain.spi.IMessengerPersistencePort;

public class MessengerUseCase implements IMessengerServicePort {
    private final IMessengerPersistencePort messengerPersistencePort;

    public MessengerUseCase(IMessengerPersistencePort messengerPersistencePort) {
        this.messengerPersistencePort = messengerPersistencePort;
    }

    @Override
    public PackageResponseDto packageResponse(PackageDom packageDom) {

        calculateValueDeclared(packageDom);
        Double operationCost = Double.valueOf(calculateOperationCost(packageDom));

        PackageResponseDto packageResponseDto = messengerPersistencePort.createMessenger(packageDom);

        // Asignar el valor de operationCost a valueService en el objeto PackageResponseDto
        packageResponseDto.setValueService(operationCost);

        // Resto de tu lógica
        return packageResponseDto;
    }

    private void calculateValueDeclared(PackageDom packageDom) {

        if (packageDom.isValueDeclared()) {
            Double value = packageDom.getValueDeclaredNumber();

            if (packageDom.getTypePackage().equals(Fragility.NORMAL)) {
                packageDom.setValueDeclaredNumber(value * 0.01);
            } else if (packageDom.getTypePackage().equals(Fragility.FRAGILE)) {
                packageDom.setValueDeclaredNumber(value * 0.5);
            } else {
                packageDom.setValueDeclaredNumber(value * 0.1);
            }


        }

    }

    private Integer calculateOperationCost(PackageDom packageDom) {

        int distanceSimulator = (int) Math.floor(Math.random() * 100 + 1);

        if (packageDom.getTypeMessenger().equals(TypeMessenger.STANDARD)) {
            return 1500 * distanceSimulator;
        } else if (packageDom.getTypeMessenger().equals(TypeMessenger.EXPRESS)) {
            return 2000 * distanceSimulator;
        }
        return 0; // Puedes manejar un valor predeterminado o lanzar una excepción si es necesario
    }

}
