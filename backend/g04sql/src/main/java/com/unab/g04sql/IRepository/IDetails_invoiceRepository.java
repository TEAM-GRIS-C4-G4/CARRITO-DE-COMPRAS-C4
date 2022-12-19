package com.unab.g04sql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unab.g04sql.Entity.Details_invoice;

public interface IDetails_invoiceRepository extends JpaRepository<Details_invoice, Integer> {

}
