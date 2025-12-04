package com.senai.backend.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="paciente")
public class Paciente {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
   private Integer id;
   
   @Column(name="nome")
   private String nome;
  
   @Column(name="endereco")
   private String endereco;
   
   @Column(name="telefone")
   private String telefone;
   
   @Column(name="descricao")
   private String descricao;

   public Paciente() {
   }

   public Paciente(Integer id, String nome, String endereco, String telefone, String descricao) {
    this.id = id;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.descricao = descricao;
   }

   public Integer getId() {
    return id;
   }

   public void setId(Integer id) {
    this.id = id;
   }

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }

   public String getEndereco() {
    return endereco;
   }

   public void setEndereco(String endereco) {
    this.endereco = endereco;
   }

   public String getTelefone() {
    return telefone;
   }

   public void setTelefone(String telefone) {
    this.telefone = telefone;
   }

   public String getDescricao() {
    return descricao;
   }

   public void setDescricao(String descricao) {
    this.descricao = descricao;
   }
   
}
