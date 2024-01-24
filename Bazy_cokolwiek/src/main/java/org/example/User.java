package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private int userId;
    private String nickname;
    private String password;
    private String email;
    private String phoneNumber;
    private boolean newsletter;
    private int paymentInfo;
}
