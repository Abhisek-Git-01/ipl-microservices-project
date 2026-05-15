package com.spring.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name="IPL_TEAMS")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class IplTeam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tid;
	@NonNull
	@Column(length=30)
	private String tname;
	@NonNull
	@Column(length=30)
	private String owner;
	@NonNull
	@Column(length=30)
	private String area;
	
	
	//Metadata Properties
	@CreationTimestamp
	@Column(insertable = true,updatable = false)
	private LocalDateTime creationTime;
	private String createdBy = System.getProperty("user.name");
	@UpdateTimestamp
	@Column(insertable = false,updatable = true)
	private LocalDateTime updateTime;
	@Column(insertable = false,updatable = true)
	private String updatedBy;
	private String status = "ACTIVE";
}
