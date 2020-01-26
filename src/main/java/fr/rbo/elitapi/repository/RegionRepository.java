package fr.rbo.elitapi.repository;

import fr.rbo.elitapi.entity.Region;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {


}