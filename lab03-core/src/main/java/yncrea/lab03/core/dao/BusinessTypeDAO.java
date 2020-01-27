package yncrea.lab03.core.dao;

import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.BusinessType;

public interface BusinessTypeDAO extends CrudRepository<BusinessType, Long> {
    //List<BusinessType> findAll();
    //void deleteAll();
    //long count();
    //BusinessType save(BusinessType businessType);

}
