package com.kht.user.entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ox_quizzes")
public class OxQuizz extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Size(max = 100)
	@NotNull
	@Column(name = "period_name", nullable = false, length = 100)
	private String periodName;

	@NotNull
	@Lob
	@Column(name = "question_text", nullable = false)
	private String questionText;

	@NotNull
	@ColumnDefault("0")
	@Column(name = "answer", nullable = false)
	private Boolean answer = false;

}
