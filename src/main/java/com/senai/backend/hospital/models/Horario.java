package com.senai.backend.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="horario")
public class Horario {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name ="id")
   private Integer id;
  
   @Column(name="data_inicio")
   private String data_inicio;
  
   @Column(name="data_final")
   private String data_final;
  
   @Column(name="dia")
   private String dia;

    public Horario() {
    }

    public Horario(String data_final, String data_inicio, String dia, Integer id) {
        this.data_final = data_final;
        this.data_inicio = data_inicio;
        this.dia = dia;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
  
   
}
