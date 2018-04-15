package ch.erni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ch.erni.entity.StaticResource;
import ch.erni.repository.StaticResourceRepository;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class StaticResourceServiceImpl implements StaticResourceService {

    @Autowired
    private StaticResourceRepository staticResourceRepository;

    @Override
    public List<StaticResource> findAll() {
        return this.staticResourceRepository.findAll();
    }
}
