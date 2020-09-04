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

    public Coin(String name, String nameplural, double value, long quantity) {
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public Coin() {
    }
}
