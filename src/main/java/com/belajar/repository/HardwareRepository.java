package com.belajar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.model.Hardware;

/**
 * @author fascal
 */
public interface HardwareRepository extends JpaRepository<Hardware, Long> {

}