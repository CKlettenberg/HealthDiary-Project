package org.example.healtdiaryproject.model;

import jakarta.persistence.*;
import lombok.*;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @Data
    @ToString
    @Entity
    @Table(name = "users")


    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;
        public static String userName;
        public static String password;


        private String firstName;
        private String lastName;
        private String email;
        private Long dateOfBirth;
        private String UserName;
        private String Password;



    }