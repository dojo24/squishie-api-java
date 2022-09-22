package com.codingdojo.com.javaapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="squish")
public class Squish {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
    private String name;
    private String img;
    
    @Column(updatable = false)
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyy-MM-dd")
	private Date updatedAt;
	
	
	public Squish() {
		
	}
	
    public Squish(String name, String img) {
		super();
		this.name = name;
		this.img = img;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}
