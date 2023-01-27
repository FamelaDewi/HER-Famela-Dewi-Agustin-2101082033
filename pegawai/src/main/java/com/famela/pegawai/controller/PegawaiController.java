/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famela.pegawai.controller;

import com.famela.pegawai.entity.Pegawai;
import com.famela.pegawai.service.PegawaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/pegawai")
public class PegawaiController {
    @Autowired
    private PegawaiService pegawaiService;
    
    @PostMapping("/")
    public Pegawai savePegawai(@RequestBody Pegawai pegawai){
        return pegawaiService.savePegawai(pegawai);
    }
    
    @GetMapping("/(id)")
    public Pegawai findPegawaiById(@PathVariable("id") Long pegawaiNip){
        return pegawaiService.findPegawaiById(pegawaiNip);
    }
    
}
