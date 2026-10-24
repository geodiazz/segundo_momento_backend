package com.ejemplo.dto_mapstruct.dto;

import com.ejemplo.dto_mapstruct.entity.Proveedor;

public class ProveedorDTO {
    private String nombre;
    private int telefono;
    private String correo;

    // Constructor vacío
    public ProveedorDTO() {
    }

    // Constructor con datos
    public ProveedorDTO(String nombre, int telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
