package com.luc.crypto.repositories;

import com.luc.crypto.entities.CryptoCurrency;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "currencies", path = "currencies")
public interface CryptoRepository extends PagingAndSortingRepository<CryptoCurrency, String>{
}
