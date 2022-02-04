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
@Table(name = "ilt_details_info")
public class InstructorTrainingDetailsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "about", referencedColumnName = "id")
    private InstructorTrainingDetailsSection aboutDetailsSection;


    @OneToOne
    @JoinColumn(name = "courseAgenda", referencedColumnName = "id")
    private InstructorTrainingDetailsSection courseAgendaDetailsSection;


    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name = "ilt_detailsInfo_instructors_mapping", joinColumns = @JoinColumn(name="iltDetailsId"),
            inverseJoinColumns = @JoinColumn(name="iltInstructorId"))
    private List<InstructorTrainingInstructors> instructors = new ArrayList<>();

    @Column(name="relatedCourseTitle")
    private String relatedCourseTitle;


    @Column(name="relatedCourseIds")
    private String relatedCourseIds;

}
