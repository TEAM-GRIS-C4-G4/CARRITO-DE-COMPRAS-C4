package com.unab.g04sql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unab.g04sql.Entity.Invoices;

public interface IInvoicesRepository extends JpaRepository<Invoices, Integer> {

}
