package devsCorp.cloudFileManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class File {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String type;
    private long size;
    private String storageUrl;
    private LocalDateTime uploadedAt;

    @ManyToOne
    private User owner;

}