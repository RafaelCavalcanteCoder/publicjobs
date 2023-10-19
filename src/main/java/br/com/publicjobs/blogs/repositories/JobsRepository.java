package br.com.publicjobs.blogs.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.publicjobs.blogs.models.*;

public interface JobsRepository extends JpaRepository<JobsModel, UUID>{

    
    
}
