package com.cf.study.jboss.jpa.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "compact_discs")
public class CompactDisc implements Serializable {

	private static final long serialVersionUID = 1950756225898188284L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String title;

	@Column
	private String artist;

	@Column
	private Double price;

	@OneToMany(mappedBy = "disc", cascade = { CascadeType.MERGE, CascadeType.PERSIST })
	private List<Track> trackTitles = new ArrayList<Track>();

	// @Column
	// private Date releaseDate;

	public CompactDisc() {
	}

	public CompactDisc(String title, String artist, Double price) {
		this.title = title;
		this.artist = artist;
		this.price = price;
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

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<Track> getTrackTitles() {
		return trackTitles;
	}

	public void setTrackTitles(List<Track> trackTitles) {
		this.trackTitles = trackTitles;
	}

	public void addTrack(Track t) {
		t.setDisc(this);
		trackTitles.add(t);
	}

	@Override
	public String toString() {
		return "CompactDisc [id=" + id + ", title=" + title + ", artist=" + artist + ", price=" + price
				+ ", trackTitles=" + trackTitles + "]";
	}

}
