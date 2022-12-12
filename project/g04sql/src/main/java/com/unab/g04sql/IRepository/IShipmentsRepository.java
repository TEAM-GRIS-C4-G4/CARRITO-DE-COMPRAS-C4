package com.unab.g04sql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unab.g04sql.Entity.Shipments;

public interface IShipmentsRepository extends JpaRepository<Shipments, Integer> {

}
