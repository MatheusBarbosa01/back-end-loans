package com.example.loan.loan;

import java.time.LocalDate;

public record LoanResponseDTO(Long id, LocalDate dt_emissao, Integer num_parc, String obs, Integer valor ) {
    public LoanResponseDTO(Loan loan){
        this(loan.getId(),loan.getDt_emissao(), loan.getNum_parc(),loan.getObs(),loan.getValor());
    }
}
