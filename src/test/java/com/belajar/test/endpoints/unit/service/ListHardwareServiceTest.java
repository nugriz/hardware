package com.belajar.test.endpoints.unit.service;

import com.belajar.model.Hardware;
import com.belajar.repository.HardwareRepository;
import com.belajar.implement.HardwareServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ListHardwareServiceTest {

    @Mock
    private HardwareRepository hardwareRepository;

    @InjectMocks
    private HardwareServiceImpl HardwareServiceImpl;

    @Test
    public void shouldReturnAllHardwares() {
        List<Hardware> hardwares = new ArrayList();
        hardwares.add(new Hardware());

        given(hardwareRepository.findAll()).willReturn(hardwares);

        List<Hardware> expected = HardwareServiceImpl.findAll();

        assertEquals(expected, hardwares);
        verify(hardwareRepository).findAll();
    }
}