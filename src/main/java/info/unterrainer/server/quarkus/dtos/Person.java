package info.unterrainer.server.quarkus.dtos;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
public class Person extends PanacheEntity {
    private String name;
    private LocalDate birth;
}
