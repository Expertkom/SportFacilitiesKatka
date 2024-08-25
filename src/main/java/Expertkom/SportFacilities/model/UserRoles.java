package Expertkom.SportFacilities.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;



@Entity
@Table(name= "user_roles")
@Data

public class UserRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roleId;

    @NotEmpty
    @Length
    @Size(max = 50)
    private String roleName;
}