package sia.tacocloud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import sia.tacocloud.dto.RoleDTO;
import sia.tacocloud.model.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    RoleDTO toDto(Role role);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    Role toEntity(RoleDTO dto);
}