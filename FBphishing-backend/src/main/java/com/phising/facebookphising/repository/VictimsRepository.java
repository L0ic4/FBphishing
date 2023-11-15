package com.phising.facebookphising.repository;

import com.phising.facebookphising.model.VictimsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VictimsRepository extends JpaRepository<VictimsModel,Integer> {
}
