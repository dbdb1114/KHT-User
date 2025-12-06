package com.kht.user.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "problem_choices")
public class ProblemChoice extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "problem_id", nullable = false)
	private Problem problem;

	@NotNull
	@Column(name = "choice_number", nullable = false)
	private Integer choiceNumber;

	@NotNull
	@Lob
	@Column(name = "choice_text", nullable = false)
	private String choiceText;

	@NotNull
	@ColumnDefault("0")
	@Column(name = "is_correct", nullable = false)
	private Boolean isCorrect = false;

	@Lob
	@Column(name = "explanation")
	private String explanation;

	@Column(name = "round_number")
	private Integer roundNumber;

	@Column(name = "problem_number")
	private Integer problemNumber;

}
