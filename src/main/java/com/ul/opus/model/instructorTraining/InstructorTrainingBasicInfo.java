package com.ul.opus.model.instructorTraining;

import com.ul.opus.model.psm.MarketPlacePremiumPlan;
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
@Table(name = "ilt_basic_info")
public class InstructorTrainingBasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="trainingName")
    private String trainingName;

    @Column(name="courseType")
    private String courseType;

    @Column(name="validityType")
    private String validityType;

    @Column(name="iconPath")
    private String iconPath;

    @Column(name="trainingPlace")
    private String trainingPlace;

    @OneToOne
    @JoinColumn(name = "planId", referencedColumnName = "id")
    private MarketPlacePremiumPlan plan;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name = "ilt_basicInfo_tags_mapping", joinColumns = @JoinColumn(name="iltBasicInfoId"),
    inverseJoinColumns = @JoinColumn(name="iltTagId"))
    private Set<InstructorTrainingTags> tags = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "iltDetailsInfoId", referencedColumnName = "id")
    private InstructorTrainingDetailsInfo instructorTrainingDetailsInfo;

}
