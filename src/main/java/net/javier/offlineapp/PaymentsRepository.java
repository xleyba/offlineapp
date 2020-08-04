package net.javier.offlineapp;

import net.javier.offlineapp.data.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentsRepository extends CrudRepository<Payment, String> {

    List<Payment> findAll();

}
