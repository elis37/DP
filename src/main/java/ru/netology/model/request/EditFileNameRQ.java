package ru.netology.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EditFileNameRQ {

    private String name;
}