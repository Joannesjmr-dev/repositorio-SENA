package com.example.facturacion.controllers;

import com.example.facturacion.models.proveedoresModel;
import com.example.facturacion.services.proveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/proveedores")
public class proveedoresController {

    @Autowired
    private proveedoresService proveedoresService;

    @GetMapping
    public List<proveedoresModel> getProveedoresModels(){
        return proveedoresService.getProveedores();
    }

    // read by id
    @GetMapping("/{proveedorId}")
    public Optional<proveedoresModel> getProveedoresById(@PathVariable("proveedorId") Long proveedorId){
        return proveedoresService.getProveedor(proveedorId);
    }

    // create or update
    @PostMapping
    public void saveUpdate(@RequestBody proveedoresModel proveedoresModel){
        proveedoresService.saveOrUpdate(proveedoresModel);
    }

    // delete
    @DeleteMapping("/{proveedorId}")
    public void deleteProveedor(@PathVariable("proveedorId") Long proveedorId){
        proveedoresService.deleteProveedor(proveedorId);
    }


}
