package ch.erni.repository;

import ch.erni.entity.StaticResource;

import java.util.List;

public interface StaticResourceRepository {
    List<StaticResource> findAll();
}
