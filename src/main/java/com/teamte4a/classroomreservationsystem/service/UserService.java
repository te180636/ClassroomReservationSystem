package com.teamte4a.classroomreservationsystem.service;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.teamte4a.classroomreservationsystem.dto.UserRequest;
import com.teamte4a.classroomreservationsystem.entity.User;
import com.teamte4a.classroomreservationsystem.repository.UserRepository;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    private static UserRepository userRepository;
    /**
     * ユーザー情報 全検索
     * @return 検索結果
     */
    public static List<User> searchAll() {
        return userRepository.findAll();
    }
    /**
     * ユーザー情報 新規登録
     * @param user ユーザー情報
     */



    public static void create(UserRequest userRequest) {
        Date now = new Date();
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setAddress(userRequest.getAddress());
        user.setPhone(userRequest.getPhone());
        user.setPassword(userRequest.getPassword());
        user.setGrade(userRequest.getGrade());
        user.setAge(userRequest.getAge());
        userRepository.save(user);

    }

}