package com.example.temproject.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name="student2")
@Getter
@Setter
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Length(min = 5, max = 30)
    private String fullName;

    @Min(100)
    @Max(800)
    private Integer psycoScore;

    @Min(30)
    @Max(100)
    private Double graduationScore;

    @NotBlank
    @Length(min = 10, max = 10)
    private String phone;

    @Length(max = 500)
    private String profilePicture;

    public Student() {
    }

    public Student(String fullName, Integer psycoScore, Double graduationScore, String phone, String profilePicture) {
        this.fullName = fullName;
        this.psycoScore = psycoScore;
        this.graduationScore = graduationScore;
        this.phone = phone;
        this.profilePicture = profilePicture;
    }
}