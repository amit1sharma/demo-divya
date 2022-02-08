package com.ul.opus.model.instructorTraining;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "ilt_tag")
public class InstructorTrainingTags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="colorCode")
    private String colorCode;

    @ManyToMany(mappedBy = "tags")
    private Set<InstructorTrainingBasicInfo> instructorTrainingBasicInfos = new HashSet<>();

}
