package com.ejemplo.dto_mapstruct.mapper;

import com.ejemplo.dto_mapstruct.dto.ProveedorDTO;
import com.ejemplo.dto_mapstruct.entity.Proveedor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-10T14:41:22-0600",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.12.1 (Microsoft)"
)
@Component
public class ProveedorMapperImpl implements ProveedorMapper {

    @Override
    public ProveedorDTO toDTO(Proveedor proveedor) {
        if ( proveedor == null ) {
            return null;
        }

        ProveedorDTO proveedorDTO = new ProveedorDTO();

        proveedorDTO.setNombre( proveedor.getNombre() );
        proveedorDTO.setTelefono( proveedor.getTelefono() );
        proveedorDTO.setCorreo( proveedor.getCorreo() );

        return proveedorDTO;
    }

    @Override
    public Proveedor toEntity(ProveedorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Proveedor proveedor = new Proveedor();

        proveedor.setNombre( dto.getNombre() );
        proveedor.setTelefono( dto.getTelefono() );
        proveedor.setCorreo( dto.getCorreo() );

        return proveedor;
    }
}
