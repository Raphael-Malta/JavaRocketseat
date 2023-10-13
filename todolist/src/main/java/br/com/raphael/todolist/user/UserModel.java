package br.com.raphael.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;


//O @Data é para ter os getters e seters
//@Getter apenas os get
//@Setter apenas o sett
@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    //Generated é pra gerar o uuid automatico
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
