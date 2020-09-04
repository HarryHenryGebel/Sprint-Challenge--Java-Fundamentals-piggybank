package tech.gebel.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)}
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private long quantity;
}
