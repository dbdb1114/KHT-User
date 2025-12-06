package com.kht.user.entity;

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
@Table(name = "resource_analysis_quizzes")
public class ResourceAnalysisQuizz extends BaseEntity {
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

	@Size(max = 500)
	@NotNull
	@Column(name = "resource_image_url", nullable = false, length = 500)
	private String resourceImageUrl;

	@Size(max = 100)
	@NotNull
	@Column(name = "answer", nullable = false, length = 100)
	private String answer;

}
