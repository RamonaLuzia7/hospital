package com.senai.backend.hospital.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")

public class Medico {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Integer id;

   @Column(name = "nome")
   private String nome;

   @Column(name = "competencia")
   private String competencia;

   @Column(name = "endereco")
   private String endereco;

   @Column(name = "telefone")
   private String telefone;

   @OneToMany
   @Column(name = "id_horario")
   private List<Horario> listaHorario;

   public Medico() {
   }

   public Medico(Integer id, String nome, String competencia, String endereco, String telefone,
         List<Horario> listaHorario) {
      this.id = id;
      this.nome = nome;
      this.competencia = competencia;
      this.endereco = endereco;
      this.telefone = telefone;
      this.listaHorario = listaHorario;
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

   public String getCompetencia() {
      return competencia;
   }

   public void setCompetencia(String competencia) {
      this.competencia = competencia;
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

   public List<Horario> getListaHorario() {
      return listaHorario;
   }

   public void setListaHorario(List<Horario> listaHorario) {
      this.listaHorario = listaHorario;
   }

}