package com.example.facturacion.repositories;

import com.example.facturacion.models.proveedoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUproveedores extends JpaRepository<proveedoresModel, Long> {
}
