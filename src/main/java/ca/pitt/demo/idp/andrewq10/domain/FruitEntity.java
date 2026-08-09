package ca.pitt.demo.idp.andrewq10.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits")
public class FruitEntity extends PanacheEntity {
    // 'id' is automatically provided by PanacheEntity
    public String name;
    public String colour;
}