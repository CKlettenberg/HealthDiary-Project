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
        private String firstName;
        private String lastName;
        private String email;
        private Long dateOfBirth;
        public String UseName;
        public String password;
        public User(String firstName, String lastName, String email, Long dateOfBirth) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.dateOfBirth = dateOfBirth;
        }





    }