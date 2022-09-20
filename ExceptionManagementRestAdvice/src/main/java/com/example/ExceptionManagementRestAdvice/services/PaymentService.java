package com.example.ExceptionManagementRestAdvice.services;

import com.example.ExceptionManagementRestAdvice.exceptions.NotEnoughMoneyException;
import com.example.ExceptionManagementRestAdvice.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
