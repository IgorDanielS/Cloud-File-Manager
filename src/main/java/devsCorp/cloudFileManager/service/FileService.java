package devsCorp.cloudFileManager.service;

import devsCorp.cloudFileManager.dto.FileResponseDTO;
import devsCorp.cloudFileManager.dto.FileUploadDTO;
import devsCorp.cloudFileManager.mapper.FileMapper;
import devsCorp.cloudFileManager.model.File;
import devsCorp.cloudFileManager.model.User;
import devsCorp.cloudFileManager.repository.FileRepository;
import devsCorp.cloudFileManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FileMapper fileMapper;

    public FileResponseDTO uploadFile(FileUploadDTO dto){
        User owner = userRepository.findById(dto.getOwnerId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,  "User Not Found"));

        File file = fileMapper.toEntity(dto);
        file.setOwner(owner);

        fileRepository.save(file);
        return fileMapper.toResponseDTO(file);
    }


}
