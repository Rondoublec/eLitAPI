package fr.rbo.elitapi.repository;

import fr.rbo.elitapi.entity.Emprunt;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmpruntRepository extends PagingAndSortingRepository<Emprunt, Long> {
}
