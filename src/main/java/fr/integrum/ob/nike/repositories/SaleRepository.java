package fr.integrum.ob.nike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.integrum.ob.nike.retailmodels.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
