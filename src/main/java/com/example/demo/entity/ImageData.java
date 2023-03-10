package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity(name="imageData")
@Table
public class ImageData {
    @Id
    @SequenceGenerator(
            name = "image_sequence",
            sequenceName = "image_name",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_sequence"
    )
    private Long id;
    private String name;
    private String type;
    @Lob
    @Column(
            name = "imagedata",
            length = 1000
    )
    private byte[] imageData;
}


