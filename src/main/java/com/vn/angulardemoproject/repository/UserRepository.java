package com.vn.angulardemoproject.repository;

import com.vn.angulardemoproject.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
