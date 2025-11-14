package com.example.spring_project1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    
    public String obterMensagem(){
        return "Ola do rep";
    }
}
