package com.MessengerManagement.messengerManagement.configuration;

import com.MessengerManagement.messengerManagement.adapters.driven.adapter.MessengerMysqlAdapter;
import com.MessengerManagement.messengerManagement.adapters.driven.mapper.IMessengerEntityMapper;
import com.MessengerManagement.messengerManagement.adapters.driven.repository.IMessengerRepository;
import com.MessengerManagement.messengerManagement.domain.api.IMessengerServicePort;
import com.MessengerManagement.messengerManagement.domain.spi.IMessengerPersistencePort;
import com.MessengerManagement.messengerManagement.domain.usecase.MessengerUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    //Messenger
    private  IMessengerRepository messengerRepository;
    private  IMessengerEntityMapper messengerEntityMapper;

    @Bean
    public IMessengerPersistencePort messengerPersistencePort(){
        return new MessengerMysqlAdapter(messengerEntityMapper, messengerRepository);
    }

    @Bean
    public IMessengerServicePort messengerServicePort(){
        return new MessengerUseCase(messengerPersistencePort());
    }


}
