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
   @Column(name="id")
   private Integer id;
  
   @Column(name="data_inicio")
   private String data_inicio;
  
   @Column(name="data_final")
   private String data_final;
  
   @Column(name="dia")
   private String dia;
  
   
}
