package com.senai.backend.hospital.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tratamento")
public class Tratamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "custo")
    private Double custo;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "status")
    private Boolean status = true;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

   @ManyToMany(mappedBy = "tratamentos")
   private Set<Agenda> agendas = new HashSet<>(); 
    public Tratamento() {
    }

    public Tratamento(String categoria, Double custo, LocalDateTime dataAtualizacao, LocalDateTime dataCriacao, String descricao, Integer id) {
        this.categoria = categoria;
        this.custo = custo;
        this.dataAtualizacao = dataAtualizacao;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Set<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(Set<Agenda> agendas) {
        this.agendas = agendas;
    }

   

}