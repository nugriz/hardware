package com.belajar.test.endpoints.unit.service;

import com.belajar.model.Hardware;
import com.belajar.repository.HardwareRepository;
import com.belajar.implement.HardwareServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DeleteHardwareServiceTest {

    @Mock
    private HardwareRepository hardwareRepository;

    @InjectMocks
    private HardwareServiceImpl hardwareServiceImpl;

    @Test
    public void whenGivenId_shouldDeleteHardware_ifFound(){
        Hardware hardware = new Hardware();
        hardware.setMerk("Test Merk");
        hardware.setId(1L);

        hardwareServiceImpl.delete(hardware.getId());
        verify(hardwareRepository).deleteById(hardware.getId());
    }
}