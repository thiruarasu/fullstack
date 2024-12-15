package com.thiru.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thiru.user_service.model.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo,Long>{

}
