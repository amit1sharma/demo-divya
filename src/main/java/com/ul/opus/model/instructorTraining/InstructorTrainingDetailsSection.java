package com.ul.opus.model.instructorTraining;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "ilt_details_section")
public class InstructorTrainingDetailsSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="header")
    private String header;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "instructorTrainingDetailsSection")
    private Set<InstructorTrainingListContent> middleListContent = new HashSet<>();

    @Column(name="footer")
    private String footer;


}
