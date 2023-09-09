package com.MessengerManagement.messengerManagement.domain.spi;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;

public interface IMessengerPersistencePort {
    PackageResponseDto createMessenger(PackageDom packageDom);
}
