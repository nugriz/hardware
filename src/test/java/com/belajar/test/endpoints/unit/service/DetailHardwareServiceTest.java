package com.belajar.test.endpoints.unit.service;

import com.belajar.model.Hardware;
import com.belajar.repository.HardwareRepository;
import com.belajar.implement.HardwareServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DetailHardwareServiceTest {

    @Mock
    private HardwareRepository hardwareRepository;

    @InjectMocks
    private HardwareServiceImpl HardwareServiceImpl;

    @Test
    public void whenGivenId_shouldReturnHardware_ifFound() {
        Hardware hardware = new Hardware();
        hardware.setId(89L);
        //hardwareRepository.save(hardware);

        when(hardwareRepository.getOne(hardware.getId())).thenReturn(hardware);

        Hardware expected = HardwareServiceImpl.findById(hardware.getId());

        assertThat(expected).isSameAs(hardware);
        verify(hardwareRepository).getOne(hardware.getId());
    }
}