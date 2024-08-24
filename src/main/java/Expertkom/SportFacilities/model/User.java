package Expertkom.SportFacilities.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import org.hibernate.engine.internal.Cascade;
import java.util.Date;

@Entity
@Table(name = "users" )
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @NotBlank
    @Size(max = 25)
    private String username;

    @NotBlank
    @Size(max = 100)
    private String passwordHash;

    @NotBlank
    @Size(max = 100)
    private String userEmail;

    @NotBlank
    @Size(max = 20)
    private String userPhone;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private UserRole roleId;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date userCreatedAt;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date userUpdatedAt;

   @NotBlank
    @NotEmpty
    @Length
    @Size(max = 100)
    private String userStreet;

    @NotBlank
    @Size(max = 50)
    private String userCity;

    @NotBlank
    @Size(max = 10)
    private String userZipCode;

}
