package hu.citec.portfolio.dao;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import hu.citec.portfolio.model.Receipt;

@RepositoryRestResource(collectionResourceRel = "receipts", path = "receipts")
public interface ReceiptRepository 
extends PagingAndSortingRepository<Receipt, Integer>{
	
	List<Receipt> findByTotal(@Param("total") int total);
}