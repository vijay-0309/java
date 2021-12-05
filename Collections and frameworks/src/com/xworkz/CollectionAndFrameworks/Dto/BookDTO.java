package com.xworkz.CollectionAndFrameworks.Dto;

public class BookDTO {
	private int id;
	private String author;
	private String edition;
	
	public BookDTO(int id,String author,String edition) {
		this.id=id;
		this.author=author;
		this.edition=edition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", author=" + author + ", edition=" + edition + "]";
	}
	

}
