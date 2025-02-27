package com.study.schedule.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "public_tender")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PublicTender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_public_tender")
    private Long idPublicTender;

    @Column(name = "name_public_tender")
    private String namePublicTender;

    @Column(name = "date_of_completion")
    private Date dateOfCompletion;

    @ManyToOne
    @JoinColumn(name = "examination_board_id_examination_board")
    private ExaminationBoard examination_board;

    @OneToMany
    private Student student;
}
