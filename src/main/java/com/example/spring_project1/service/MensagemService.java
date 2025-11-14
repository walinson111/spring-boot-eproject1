package com.example.spring_project1.service;

import org.springframework.stereotype.Service;

import com.example.spring_project1.repository.MensagemRepository;

@Service
public class MensagemService {
    
    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository){
        this.mensagemRepository = mensagemRepository;
    }

    public String obterMensagem(){
        return mensagemRepository.obterMensagem();
    }
}
