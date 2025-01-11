package devsCorp.cloudFileManager.dto;

import devsCorp.cloudFileManager.model.User;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class FileUploadDTO {

    private String name;
    private String type;
    private long size;
    private UUID ownerId;
}
