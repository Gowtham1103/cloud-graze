package com.gowatr.cloudgraze.Service;

import com.gowatr.cloudgraze.Entity.CgEntity;
import com.gowatr.cloudgraze.Repository.CgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CgService {

    @Autowired
    private CgRepository cgRepository;

    public CgEntity saveCgEntity(CgEntity cgEntity) {
        return cgRepository.save(cgEntity);
    }

    public CgEntity getCgEntity(String doorNo) {
        return cgRepository.findById(doorNo).orElse(null);
    }

    public List<CgEntity> getAllCgEntities() {
        return (List<CgEntity>) cgRepository.findAll();
    }


}