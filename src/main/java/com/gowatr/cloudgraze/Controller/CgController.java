package com.gowatr.cloudgraze.Controller;

import com.gowatr.cloudgraze.Entity.CgEntity;
import com.gowatr.cloudgraze.Service.CgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CgController {

    @Autowired
    private CgService cgService;

    @PostMapping("/save")
    public ResponseEntity<CgEntity> saveCgEntity(@RequestBody CgEntity cgEntity) {
        CgEntity savedEntity = cgService.saveCgEntity(cgEntity);
        return ResponseEntity.ok(savedEntity);
    }
    @GetMapping("/{doorNo}")
    public ResponseEntity<CgEntity> getCgEntity(@PathVariable String doorNo) {
        CgEntity cgEntity = cgService.getCgEntity(doorNo);
        if (cgEntity != null) {
            return ResponseEntity.ok(cgEntity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/data.spring")
    public ResponseEntity<Object> getAllCgEntities() {
        List<CgEntity> cgEntities = cgService.getAllCgEntities();
        if (!cgEntities.isEmpty()) {
            // If there's at least one entity, return the first one
            return ResponseEntity.ok(cgEntities.get(0));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}