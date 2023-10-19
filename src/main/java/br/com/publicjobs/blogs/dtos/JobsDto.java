package br.com.publicjobs.blogs.dtos;

import org.hibernate.validator.constraints.URL;

import br.com.publicjobs.blogs.models.*;
import br.com.publicjobs.blogs.treats.JobsCategorias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record JobsDto(

@Pattern(regexp = "^.{0,50}$")
@NotBlank
String autor,

@Pattern(regexp = "^.{0,80}$")
@NotBlank
String titulo,

@Pattern(regexp = "^.{0,500}$")
@NotBlank
String descricao,

@NotNull
JobsCategorias categorias,

@Pattern(regexp = "^.{0,800}$")
@NotBlank
@URL
String linkProjeto ) {
    
}
