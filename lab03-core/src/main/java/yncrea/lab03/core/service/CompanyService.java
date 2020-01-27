package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CompanyDAO;
import yncrea.lab03.core.entity.Company;

import java.util.Map;

@Service
@Transactional
public class CompanyService {
    CompanyDAO dao;

    public CompanyService() {
        super();
        this.dao = dao;
    }

    public void deleteAll() {
        dao.deleteAll();
    }


    public void save(final Company company) {
        dao.save(company);
    }


    public long countAll() {
        return dao.count();
    }


    public Map<String, Integer> getAllWithProjectCount() {
        //TODO return a map with the name of the company for the key and the count in the value
       return dao.getAllByNameWithProjectCount();
    }
}
