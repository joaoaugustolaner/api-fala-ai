package com.api.fala_ai.models;


import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Slang {

    private Long id;
    private String sentence;
    private String description;
    private String audioPath;

}
