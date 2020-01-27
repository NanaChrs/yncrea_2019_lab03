package yncrea.lab03.core.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import yncrea.lab03.core.entity.Company;

import java.util.Map;

public interface CompanyDAO extends CrudRepository<Company, Long> {

    @Query("select c.name, c.projects.size from Company c")
    Map<String, Integer> getAllByNameWithProjectCount();
}
