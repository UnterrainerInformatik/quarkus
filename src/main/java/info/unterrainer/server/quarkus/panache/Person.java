package info.unterrainer.server.quarkus.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
public class Person extends PanacheEntity {
    public String name;
    public LocalDate birth;

    public static Person findByName(String name){
        return find("name", name).firstResult();
    }

    public static void deleteStefs(){
        delete("name", "Stef");
    }
}
