package com.MessengerManagement.messengerManagement.adapters.driven.mapper;

import com.MessengerManagement.messengerManagement.adapters.driven.entity.PackageEntity;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IMessengerEntityMapper {

    PackageEntity toPackageEntity(PackageDom packageDom);

    PackageResponseDto toPackageResponseDto(PackageEntity packageEntity);
}
