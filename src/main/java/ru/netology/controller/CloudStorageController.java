package ru.netology.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.netology.model.request.EditFileNameRQ;
import ru.netology.model.response.FileRS;
import ru.netology.service.CloudStorageService;

import java.util.List;

@RestController
@AllArgsConstructor
public class CloudStorageController {

    private CloudStorageService cloudStorageService;

    @PostMapping("/file")
    public ResponseEntity<?> uploadFile(@RequestHeader("auth-token") String authToken, @RequestParam("filename") String filename, MultipartFile file) {
        cloudStorageService.uploadFile(authToken, filename, file);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/file")
    public ResponseEntity<?> deleteFile(@RequestHeader("auth-token") String authToken, @RequestParam("filename") String filename) {
        cloudStorageService.deleteFile(authToken, filename);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/file")
    public MultipartFile downloadFile(@RequestHeader("auth-token") String authToken, @RequestParam("filename") String filename) {
        return cloudStorageService.downloadFile(authToken, filename);
    }

    @PutMapping("/file")
    public ResponseEntity<?> editFileName(@RequestHeader("auth-token") String authToken, @RequestParam("filename") String filename, EditFileNameRQ editFileNameRQ) {
        cloudStorageService.editFileName(authToken, filename, editFileNameRQ);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public List<FileRS> getAllFiles(@RequestHeader("auth-token") String authToken, @RequestParam("limit") Integer limit) {
        return cloudStorageService.getAllFiles(authToken, limit);
    }
}