package net.javier.offlineapp.service;

import net.javier.offlineapp.PaymentsRepository;
import net.javier.offlineapp.data.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentsRepository repository;

    @Override
    public Payment insert(Payment p) {
        return repository.save(p);
    }
}
