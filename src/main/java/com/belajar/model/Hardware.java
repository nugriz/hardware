package com.belajar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter //Untuk Set Paramater
@Getter //Untuk Get Paramater
@Entity //Untuk Memberikan Identitas Data yang mengakses ke Database
public class Hardware {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Untuk Menggenerate AutoIncrement
    private Long id;
	
	@Column(name = "tipe")
	private String tipe;

	@Column(name = "merk")
	private String merk;
	
	@Column(name = "harga")
	private Long harga;

	@Column(name = "jenis_garansi")
	private String jenisGaransi;

	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
}