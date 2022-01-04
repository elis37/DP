package ru.netology.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.netology.model.request.EditFileNameRQ;
import ru.netology.model.response.FileRS;

import java.util.List;

@Service
public class CloudStorageService {

    public void uploadFile(String authToken, String filename, MultipartFile file) {

    }

    public void deleteFile(String authToken, String filename) {

    }

    public MultipartFile downloadFile(String authToken, String filename) {
        return null;
    }


    public void editFileName(String authToken, String filename, EditFileNameRQ editFileNameRQ) {

    }

    public List<FileRS> getAllFiles(String authToken, Integer limit) {
        return null;
    }
}