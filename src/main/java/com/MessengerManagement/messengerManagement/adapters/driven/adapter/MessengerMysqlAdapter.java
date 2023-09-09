package com.MessengerManagement.messengerManagement.adapters.driven.adapter;

import com.MessengerManagement.messengerManagement.adapters.driven.entity.PackageEntity;
import com.MessengerManagement.messengerManagement.adapters.driven.mapper.IMessengerEntityMapper;
import com.MessengerManagement.messengerManagement.adapters.driven.repository.IMessengerRepository;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.domain.model.PackageDom;
import com.MessengerManagement.messengerManagement.domain.spi.IMessengerPersistencePort;

public class MessengerMysqlAdapter implements IMessengerPersistencePort {
    private IMessengerEntityMapper messengerEntityMapper;
    private IMessengerRepository messengerRepository;

    public MessengerMysqlAdapter(IMessengerEntityMapper messengerEntityMapper, IMessengerRepository messengerRepository) {
        this.messengerEntityMapper = messengerEntityMapper;
        this.messengerRepository = messengerRepository;
    }

    @Override
    public PackageResponseDto createMessenger(PackageDom packageDom) {
        PackageEntity entity = messengerRepository.save(messengerEntityMapper.toPackageEntity(packageDom));
        return messengerEntityMapper.toPackageResponseDto(entity);
    }
}
