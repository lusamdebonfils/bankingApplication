package edu.mum.cs.finalprep.bankingapplication.repository;

import edu.mum.cs.finalprep.bankingapplication.model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {
}
