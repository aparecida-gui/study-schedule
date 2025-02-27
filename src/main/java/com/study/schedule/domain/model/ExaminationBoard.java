package com.study.schedule.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "examination_board")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExaminationBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_examination_board")
    private Long idExaminationBoard;

    private String name;

    @Column(name = "questions_with_alternatives")
    private Boolean questionsWithAlternatives;

    @Column(name = "questions_without_alternatives")
    private Boolean questionsWithoutAlternatives;

    @Column(name = "total_questions")
    private Integer totalQuestions;

    @Column(name = "specific_knowledge")
    private Integer specificKnowledge;

    @Column(name = "general_knowledge")
    private Integer generalKnowledge;

    @OneToMany
    private PublicTender publicTender;
}
