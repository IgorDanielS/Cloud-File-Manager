package devsCorp.cloudFileManager.mapper;

import devsCorp.cloudFileManager.dto.FileResponseDTO;
import devsCorp.cloudFileManager.dto.FileUploadDTO;
import devsCorp.cloudFileManager.model.File;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FileMapper {

    FileMapper INSTANCE = Mappers.getMapper(FileMapper.class);

    @Mapping(source = "ownerId", target = "owner.id")
    File toEntity(FileUploadDTO dto);

    @Mapping(source = "owner.id", target = "ownerId")
    FileResponseDTO toResponseDTO(File file);

    @Mapping(source = "owner.id", target = "ownerId")
    FileUploadDTO toDto(File file);
}
