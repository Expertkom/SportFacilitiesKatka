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
@Table(name = "price_tariff" )
@Data

public class PriceTariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tariffId;

    @NotBlank
    @Size(max = 25)
    //v sql numeric (25,2)
    private double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "facilityId", referencedColumnName = "facilityId")
    private PriceTariff priceFacilityId;


    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date createdAt;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date updateAt;



}
