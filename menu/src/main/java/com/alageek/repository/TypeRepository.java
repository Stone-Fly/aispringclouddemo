package com.alageek.repository;

import com.alageek.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository {
    public List<Type> findAll();
    public Type findById(long id);
}
