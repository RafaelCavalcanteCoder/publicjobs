package br.com.publicjobs.blogs.models;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.web.bind.annotation.RestController;

import br.com.publicjobs.blogs.treats.JobsCategorias;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "jobs-table") //criando a tabela com nome jobs-table
@Entity(name = "JobsModel") //tornando uma entidade a classe JobsModel
@Data //getters e setters em todos atributos
@NoArgsConstructor //criando construtor sem argumentos
@AllArgsConstructor//criando construtor com argumentos
 public class JobsModel {

    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    
    private String autor;
    private String titulo;
    private String descricao;
    private JobsCategorias categorias;
    private String linkProjeto;
    
    @CreationTimestamp //a cada post de um jobs a data e hora é computadada automaticamente
    private LocalDateTime data;
    
    


    
}
