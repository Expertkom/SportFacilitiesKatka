package Expertkom.SportFacilities.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "facilities")
@Data
public class Facilities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int facilityId;

    @NotBlank
    @Size(max = 100)
    private String street;

    @NotBlank
    @Size(max = 50)
    private String city;

    @NotBlank
    @Size(max = 10)
    private String zipCode;

    @NotBlank
    @Size(max = 25)
    private String facilityName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "managerId", referencedColumnName = "userId")
    private Users managerId;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createdAt;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date updatedAt;





}
