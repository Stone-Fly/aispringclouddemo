package com.alageek.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
