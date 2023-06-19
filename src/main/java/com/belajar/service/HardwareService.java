package com.belajar.service;

import java.util.List;

import com.belajar.model.Hardware;
public interface HardwareService {

    List<Hardware> findAll();

    Hardware findById(Long id);

    Hardware update(Long id, Hardware hardware);

    Hardware create(Hardware hardware);
    
    void delete(Long id);
}