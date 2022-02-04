package com.ul.opus.model.instructorTraining;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "ilt_instructors")
public class InstructorTrainingInstructors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="position")
    private String position;

    @Column(name="description")
    private String description;

    @Column(name="blobImg")
    private String blobImg;
}
