package com.githup.icezerocat.uidprovide.controller;


import com.githup.icezerocat.uidprovide.service.UidGenService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 0.0.0
 */
@RestController
@RequestMapping("uid")
public class UidController {
    private final UidGenService uidGenService;

    public UidController(UidGenService uidGenService) {
        this.uidGenService = uidGenService;
    }

    @GetMapping("/uidGenerator")
    public String uidGenerator() {
        return String.valueOf(uidGenService.getUid());
    }
}
