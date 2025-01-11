package devsCorp.cloudFileManager.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class FileResponseDTO {

    private UUID id;
    private String name;
    private String type;
    private long size;
    private String storageUrl;

    private UUID ownerId;
}