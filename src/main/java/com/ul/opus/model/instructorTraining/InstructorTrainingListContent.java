package com.ul.opus.model.instructorTraining;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "ilt_middle_list_content")
public class InstructorTrainingListContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="listItem")
    private String listItem;

    @ManyToOne
    @JoinColumn(name="ilt_details_section_id", nullable=false)
    private InstructorTrainingDetailsSection instructorTrainingDetailsSection;

}
