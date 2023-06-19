package com.belajar.test.endpoints.unit.service;

import com.belajar.model.Hardware;
import com.belajar.repository.HardwareRepository;
import com.belajar.implement.HardwareServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CreateHardwareServiceTest {

    @Mock
    private HardwareRepository hardwareRepository;

    @InjectMocks
    private HardwareServiceImpl HardwareServiceImpl;

    @Test
    public void whenSaveHardware_shouldReturnHardware() {
        Hardware hardware = new Hardware();
        hardware.setMerk("Test Merk");

        Mockito.when(hardwareRepository.save(ArgumentMatchers.any(Hardware.class))).thenReturn(hardware);

        Hardware created = HardwareServiceImpl.create(hardware);

        assertThat(created.getMerk()).isSameAs(hardware.getMerk());
        verify(hardwareRepository).save(hardware);
    }
}