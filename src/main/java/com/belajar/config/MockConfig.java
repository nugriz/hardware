//package com.belajar.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import static org.mockito.ArgumentMatchers.*;
//import static org.mockito.BDDMockito.*;
//import static org.mockito.MockitoAnnotations;
//
//@Configuration
//@ComponentScan(basePackages = "com.belajar")
//public class MockConfig {
//
//    //**************************** MOCK BEANS ******************************
//
//    @Bean
//    @Primary
//    public HardwareService weatherServiceMock() {
//        WeatherStationService mock = Mockito.mock(WeatherStationService.class);
//        return mock;
//    }