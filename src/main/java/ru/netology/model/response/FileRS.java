package ru.netology.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FileRS {

    private String filename;
    private Integer size;
}