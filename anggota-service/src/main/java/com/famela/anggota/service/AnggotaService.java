/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.anggota.service;

import com.famela.anggota.entity.Anggota;
import com.famela.anggota.repository.AnggotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository anggotaRepository;

    public Anggota saveAnggota(Anggota anggota) {
        return anggotaRepository.save(anggota);
    }

    public Anggota findAnggotaById(Long anggotaId) {
        return anggotaRepository.findByAnggotaId(anggotaId);
    }
    
    public List<Anggota> getAllAnggota(){
        return anggotaRepository.findAll();
    }

    public void deletAnggotaById(Long anggotaId){
        anggotaRepository.deleteById(anggotaId);
    }
    
    public Anggota updateAnggota(Anggota anggota){
        return anggotaRepository.save(anggota);
    }

    public void deleteAnggotaById(Long anggotaId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
