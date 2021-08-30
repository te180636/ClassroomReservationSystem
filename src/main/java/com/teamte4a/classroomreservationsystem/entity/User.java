package com.teamte4a.classroomreservationsystem.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Integer id ;
    @Column(nullable = false, length=60)
    private String username;//ユーザーネーム
    @Column(nullable = false, length=60)
    private String password;//パスワード
    @Column(nullable = false, length=60)
    private String address;//住所
    @Column(nullable = false, length=60)
    private String phone;//電話番号
    @Column(nullable = false)
    private String age;//年齢
    @Column(nullable = false)
    private String grade;//学年


    /**
     * ID
     *
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 名前
     *
    @Column(name = "name")
    private String name;
    /**
     * 住所
     *
    @Column(name = "address")
    private String address;
    /**
     * 電話番号
     *
    @Column(name = "phone")
    private String phone;
    /**
     * 年齢
     *
    @Column(name = "age")
    private String age;
    /**
     * 学年
     *
    @Column(name = "grade")
    private String grade;
    /**
     * 更新日時
     *
    @Column(name = "update_date")
    private Date updateDate;
    /**
     * 登録日時
     *
    @Column(name = "create_date")
    private Date createDate;
    /**
     * 削除日時
     *
    @Column(name = "delete_date")
    private Date deleteDate;
    */
}