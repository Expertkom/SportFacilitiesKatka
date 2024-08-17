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
@Table(name = "reservations" )
@Data

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservationId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facilityId", referencedColumnName = "facilityId")
    private int rentFacilityId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleId", referencedColumnName = "roleId")
    private int customerId;



    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createdAt;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date updateAt;



}
