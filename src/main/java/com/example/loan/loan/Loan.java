package com.example.loan.loan;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="xemprestimo")
@Entity(name="Loan")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Loan {
    @Id
    private Long id; 
    @Column(name="dt_emissao")
    private LocalDate dt_emissao;
    @Column(name="num_parc")
    private Integer num_parc;
    @Column(name="obs")
    private String obs;
    @Column(name="valor")
    private Integer valor;
}
