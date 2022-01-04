package ru.netology.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.exception.*;
import ru.netology.model.response.ExceptionRS;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    private static final int DUMMY = 1;

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<ExceptionRS> handleBadCredentials(BadCredentialsException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionRS(e.getMessage(), DUMMY));
    }

    @ExceptionHandler(InputDataException.class)
    public ResponseEntity<ExceptionRS> handleInputData(InputDataException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionRS(e.getMessage(), DUMMY));
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ExceptionRS> handleUnauthorized(UnauthorizedException e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ExceptionRS(e.getMessage(), DUMMY));
    }

    @ExceptionHandler(DeleteFileException.class)
    public ResponseEntity<ExceptionRS> handleDeleteFile(DeleteFileException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ExceptionRS(e.getMessage(), DUMMY));
    }

    @ExceptionHandler(UploadFileException.class)
    public ResponseEntity<ExceptionRS> handleUploadFile(UploadFileException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ExceptionRS(e.getMessage(), DUMMY));
    }

    @ExceptionHandler(GettingFileListException.class)
    public ResponseEntity<ExceptionRS> handleGettingFileList(GettingFileListException e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ExceptionRS(e.getMessage(), DUMMY));
    }
}