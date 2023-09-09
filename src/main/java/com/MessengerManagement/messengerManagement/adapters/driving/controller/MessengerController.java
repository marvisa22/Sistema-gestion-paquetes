package com.MessengerManagement.messengerManagement.adapters.driving.controller;

import com.MessengerManagement.messengerManagement.adapters.driving.DTO.requestDto.PackageRequestDto;
import com.MessengerManagement.messengerManagement.adapters.driving.DTO.responseDto.PackageResponseDto;
import com.MessengerManagement.messengerManagement.adapters.driving.handler.IMessengerHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messenger/")
@RequiredArgsConstructor
public class MessengerController {
    private IMessengerHandler messengerService;

    @PostMapping("package/")
    public ResponseEntity<PackageResponseDto> createPackage(PackageRequestDto packageRequestDto){

        PackageResponseDto packageResponseDto = messengerService.createPackage(packageRequestDto);
        // Devuelve el resultado en un ResponseEntity con el código de estado HTTP 200 (OK)
        return ResponseEntity.ok(packageResponseDto);

    }
}
