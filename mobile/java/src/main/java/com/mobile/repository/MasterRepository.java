package com.mobile.repository;

import com.mobile.entity.MasterModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository   extends JpaRepository<MasterModel,Long> {
}
