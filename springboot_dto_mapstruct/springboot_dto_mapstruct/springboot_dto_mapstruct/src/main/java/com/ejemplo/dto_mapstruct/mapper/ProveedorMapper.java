package com.ejemplo.dto_mapstruct.mapper;

import com.ejemplo.dto_mapstruct.dto.ProveedorDTO;
import com.ejemplo.dto_mapstruct.entity.Proveedor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProveedorMapper {
    // Entity → DTO
    ProveedorDTO toDTO(Proveedor proveedor);

    // DTO → Entity
    Proveedor toEntity(ProveedorDTO dto);
}
