package com.alageek.repository;

import com.alageek.entity.Type;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository {
    public Type findById(long id);
}
