/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.peminjaman.service.service;

import com.famela.peminjaman.service.VO.Anggota;
import com.famela.peminjaman.service.VO.Buku;
import com.famela.peminjaman.service.VO.ResponseTemplateVO;
import com.famela.peminjaman.service.entity.Peminjaman;
import com.famela.peminjaman.service.repository.PeminjamanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



/**
 *
 * @author HP
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Peminjaman peminjaman = 
                peminjamanRepository.findByPeminjamanId(peminjamanId);
        Anggota anggota = 
        restTemplate.getForObject("http://localhost:9012/anggota/"
                + peminjaman.getAnggotaId(), Anggota.class);
        Buku buku = 
        restTemplate.getForObject("http://localhost:9011/buku/" 
                + peminjaman.getBukuId(), Buku.class);
        vo.setPeminjaman(peminjaman);
        vo.setAnggota(anggota); 
        vo.setBuku(buku); 
        return vo;
    }
    public List<Peminjaman> getAllPeminjaman(){
        return peminjamanRepository.findAll();
    }
    
    public void deletePeminjamanById(Long peminjamanId){
        peminjamanRepository.deleteById(peminjamanId);
    }
    
    public Peminjaman updatePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
}