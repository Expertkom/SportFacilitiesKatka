package Expertkom.SportFacilities.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.Date;

@Entity
@Table(name = "facilities" )
@Data

public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityId;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private UserRole managerId;



    @NotBlank
    @Size(max = 25)
    private String facilityName;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createdAt;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date updateAt;

    @NotBlank
    @NotEmpty
    @Length
    @Size(max = 100)
    private String Street;

    @NotBlank
    @Size(max = 50)
    private String City;

    @NotBlank
    @Size(max = 10)
    private String ZipCode;
}
