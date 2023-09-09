package com.MessengerManagement.messengerManagement.adapters.driving.mapper;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.PackageRequestDto;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPackageRequestMapper {
    PackageDom toPackageDom(PackageRequestDto packageRequestDto);
}
