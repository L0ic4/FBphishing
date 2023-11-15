package com.phising.facebookphising.service;

import com.phising.facebookphising.model.VictimsModel;
import com.phising.facebookphising.repository.VictimsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class VictimsService {
    private final VictimsRepository victimsRepository;

    public void save(VictimsModel victimsModel){
        victimsRepository.save(victimsModel);
    }

    public List<VictimsModel> getAllVictims(){
        return victimsRepository.findAll();
    }
}
