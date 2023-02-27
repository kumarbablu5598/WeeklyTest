package com.Ecommerce.Ecommerce.repo;
import com.Ecommerce.Ecommerce.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer>{

}
