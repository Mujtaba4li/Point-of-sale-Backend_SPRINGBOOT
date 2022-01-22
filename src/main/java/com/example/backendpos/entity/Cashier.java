package com.example.backendpos.entity;


import com.sun.istack.NotNull;
import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.IMessage;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.NotBlack;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cashier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
//   @NotBlank(message="Name can't be blank")
//    @NotNull(message="Name can't cant be blank")
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
//    @Size(min=8,max=15)
    private String password;
//    @Sizeze(min=8,max=15)

}