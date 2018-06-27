package com.daitangroup.mysql.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 6536743356912738845L;
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private  String name;
    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String password;

    public User() {
    }

    @JsonCreator
    public User(@JsonProperty("name") @NotNull @NotEmpty String name, @JsonProperty("password") @NotNull @NotEmpty String password) {
        this.name = name;
        this.password = password;
    }
}
