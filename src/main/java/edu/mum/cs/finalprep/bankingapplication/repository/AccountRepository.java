package edu.mum.cs.finalprep.bankingapplication.repository;

import edu.mum.cs.finalprep.bankingapplication.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
}
