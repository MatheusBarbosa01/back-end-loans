package com.example.loan.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.loan.loan.LoanRepository;
import com.example.loan.loan.LoanResponseDTO;

@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private LoanRepository repository;
    @GetMapping
    public ResponseEntity <Page<LoanResponseDTO>> listar(@PageableDefault(page = 0,size = 10)Pageable paginacao){
        Page<LoanResponseDTO> loansList = repository.findAll(paginacao).map(LoanResponseDTO::new);
        return ResponseEntity.ok(loansList);
    }
}
