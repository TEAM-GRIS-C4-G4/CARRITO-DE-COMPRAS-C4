package com.unab.g04nosql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g04nosql.Collection.Invoices;

public interface IInvoicesRepository extends JpaRepository<Invoices, Integer> {

}
