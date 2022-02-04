package com.ul.opus.model.instructorTraining;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name = "ilt_detailsSection_middleListContent_mapping", joinColumns = @JoinColumn(name="iltDetailsSectionId"),
            inverseJoinColumns = @JoinColumn(name="iltListId"))
    private List<InstructorTrainingListContent> middleListContent = new ArrayList<>();

    @Column(name="footer")
    private String footer;


}
