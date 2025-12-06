package com.kht.user.entity;

import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	@CreatedDate
	@ColumnDefault("CURRENT_TIMESTAMP")
	@Column(name = "created_at", nullable = false, updatable = false)
	private Instant createdAt;

	@Column(name = "created_by", nullable = true, length = 100, updatable = false)
	private String createdBy;

	@LastModifiedDate
	@ColumnDefault("CURRENT_TIMESTAMP")
	@Column(name = "updated_at")
	private Instant updatedAt;

	@Column(name = "updated_by", length = 100)
	private String updatedBy;

	@ColumnDefault("0")
	@Column(name = "version")
	@Version
	private Long version;
}
