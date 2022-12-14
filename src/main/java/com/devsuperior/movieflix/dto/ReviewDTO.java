package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;

public class ReviewDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "Campo requerido")
	private String text;
	@NotNull(message = "Campo requerido")
	private Long movieId;
	@NotNull(message = "Campo requerido")
	private UserDTO user = new UserDTO();

	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text, Long movieId) {
		super();
		this.id = id;
		this.text = text;
		this.movieId = movieId;
	}
	
	public ReviewDTO(Review entity) {
		this.id = entity.getId();
		this.text = entity.getText();
		this.movieId = entity.getMovie().getId();	
	}
	
	public ReviewDTO(Review entity, User userEntity) {
		this(entity);
		user.setId(userEntity.getId());
		user.setName(userEntity.getName());
		user.setEmail(userEntity.getEmail());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUserDTO(UserDTO user) {
		this.user = user;
	}

}
