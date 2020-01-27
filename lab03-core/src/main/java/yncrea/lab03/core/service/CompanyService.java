package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CompanyDAO;
import yncrea.lab03.core.entity.Company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CompanyService {
    private CompanyDAO dao;

    public CompanyService(CompanyDAO dao) {
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
        Map<String, Integer> allWithProjectCount = new HashMap<String, Integer>();
        final Iterable<Company> companies = dao.findAll();
        for (Company company: companies){
            final int nbProjects = company.getProjects().size();
            allWithProjectCount.put(company.getName(), nbProjects);
        }
       return allWithProjectCount;
    }
}
