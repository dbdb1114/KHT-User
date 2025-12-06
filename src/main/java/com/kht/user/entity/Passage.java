package com.kht.user.entity;

import java.time.Instant;

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
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "passages")
public class Passage extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "problem_id", nullable = false)
	private Problem problem;

	@Size(max = 50)
	@NotNull
	@Column(name = "passage_type", nullable = false, length = 50)
	private String passageType;

	@Size(max = 500)
	@NotNull
	@Column(name = "passage_url", nullable = false, length = 500)
	private String passageUrl;

	@Lob
	@Column(name = "passage_text")
	private String passageText;

	@ColumnDefault("1")
	@Column(name = "sort_order")
	private Integer sortOrder;

	@Lob
	@Column(name = "explanation")
	private String explanation;

	@Column(name = "modified_at")
	private Instant modifiedAt;

	@Size(max = 50)
	@Column(name = "modified_by", length = 50)
	private String modifiedBy;

}
