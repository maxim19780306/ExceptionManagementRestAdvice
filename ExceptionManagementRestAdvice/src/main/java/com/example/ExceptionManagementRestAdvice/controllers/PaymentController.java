package com.example.ExceptionManagementRestAdvice.controllers;


import com.example.ExceptionManagementRestAdvice.exceptions.NotEnoughMoneyException;
import com.example.ExceptionManagementRestAdvice.model.ErrorDetails;
import com.example.ExceptionManagementRestAdvice.model.PaymentDetails;
import com.example.ExceptionManagementRestAdvice.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        PaymentDetails paymentDetails = paymentService.processPayment();

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);

    }
}
