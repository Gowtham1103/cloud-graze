package com.gowatr.cloudgraze.Repository;


import com.gowatr.cloudgraze.Entity.CgEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CgRepository extends JpaRepository<CgEntity, String> {

}