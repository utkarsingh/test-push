package com.docster.internal.repository;

import com.docster.internal.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository< UserEntity,Integer> {
}
