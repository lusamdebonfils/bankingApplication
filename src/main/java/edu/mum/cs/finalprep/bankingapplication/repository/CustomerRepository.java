package edu.mum.cs.finalprep.bankingapplication.repository;

import edu.mum.cs.finalprep.bankingapplication.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
