package com.example.facturacion.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="proveedores")
public class proveedoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String gmail;

}
