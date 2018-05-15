package com.luc.crypto.repositories;

import com.luc.crypto.entities.CryptoCurrency;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Spring repository to retrieve data from the H2 database
 *
 * Added the @RepositoryRestResource annotation so we can customize the endpoint path
 * to match the requirements.
 */
@RepositoryRestResource(collectionResourceRel = "currencies", path = "currencies")
public interface CryptoRepository extends PagingAndSortingRepository<CryptoCurrency, String>{
}
