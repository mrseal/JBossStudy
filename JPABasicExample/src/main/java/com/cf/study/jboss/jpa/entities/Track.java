package com.cf.study.jboss.jpa.entities;

import java.io.Serializable;

import javax.persistence.*;

@NamedQuery(name = "findByTitle", query = "SELECT t.title FROM Track t WHERE t.disc.id=:discId")

@Entity
@Table(name = "tracks")
public class Track implements Serializable {

	private static final long serialVersionUID = 5418030758894294826L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String title;

	@JoinColumn(name = "cd_id", referencedColumnName = "id", nullable = false)
	@ManyToOne
	private CompactDisc disc;

	public Track() {

	}

	public Track(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CompactDisc getDisc() {
		return disc;
	}

	public void setDisc(CompactDisc disc) {
		this.disc = disc;
	}

	@Override
	public String toString() {
		return "Track [id=" + id + ", title=" + title + ", disc=" + disc + "]";
	}

}
