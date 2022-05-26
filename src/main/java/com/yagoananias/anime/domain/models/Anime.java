package com.yagoananias.anime.domain.models;

import lombok.*;

import javax.persistence.Entity;

@Entity(name = "Animes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Anime {

	private String anime;
	private String character;
	private String quote;
	
}
