package com.kht.user.entity;

import java.util.Map;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

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
@Table(name = "problems")
public class Problem extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@NotNull
	@Column(name = "round_number", nullable = false)
	private Integer roundNumber;

	@NotNull
	@Column(name = "problem_number", nullable = false)
	private Integer problemNumber;

	@Size(max = 100)
	@NotNull
	@Column(name = "period_name", nullable = false, length = 100)
	private String periodName;

	@NotNull
	@Lob
	@Column(name = "question_text", nullable = false)
	private String questionText;

	@NotNull
	@ColumnDefault("1")
	@Column(name = "score", nullable = false)
	private Integer score;

	@Lob
	@Column(name = "explanation")
	private String explanation;
}
