package fr.rbo.elitapi.repository;

import fr.rbo.elitapi.entity.Ouvrage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OuvrageRepository extends PagingAndSortingRepository<Ouvrage, Long> {
}
