package com.teamte4a.classroomreservationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.teamte4a.classroomreservationsystem.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}