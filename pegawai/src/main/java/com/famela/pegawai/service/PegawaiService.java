/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.pegawai.service;

import com.famela.pegawai.entity.Pegawai;
import com.famela.pegawai.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class PegawaiService {
    @Autowired
    private PegawaiRepository pegawaiRepository;
    
    public Pegawai savePegawai(Pegawai pegawai){
        return pegawaiRepository.save(pegawai);
    }
    
    public Pegawai findPegawaiById(Long pegawaiNip){
        return pegawaiRepository.findByPegawaiNip(pegawaiNip);
    }
}