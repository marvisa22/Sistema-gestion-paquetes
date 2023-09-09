package com.MessengerManagement.messengerManagement.domain.api;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;

public interface IMessengerServicePort {
    PackageResponseDto packageResponse(PackageDom packageDom);
}
