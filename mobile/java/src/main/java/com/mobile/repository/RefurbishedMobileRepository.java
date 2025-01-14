package com.mobile.repository;

import com.mobile.entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefurbishedMobileRepository extends JpaRepository<Mobile,Long> {
}
