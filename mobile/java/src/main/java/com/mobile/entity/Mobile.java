package com.mobile.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "mobile")
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "mobile_brand")
    @JsonProperty("mobile_brand")
    private String mobile_brand;

    @Column(name = "mobile_model")
    @JsonProperty("mobile_model")
    private String mobile_model;

    @Column(name = "mobile_manufacture_date")
    @JsonProperty("mobile_manufacture_date")
    private String mobile_manufacture_date;

    @Column(name = "mobile_original_price")
    @JsonProperty("mobile_original_price")
    private String mobile_original_price;

    @Column(name = "mobile_purchased_price")
    @JsonProperty("mobile_purchased_price")
    private String mobile_purchased_price;

    @Column(name = "mobile_purchase_date")
    @JsonProperty("mobile_purchase_date")
    private String mobile_purchase_date;

    @Column(name = "mobile_imei_one")
    @JsonProperty("mobile_imei_one")
    private String mobile_imei_one;

    @Column(name = "mobile_imei_two")
    @JsonProperty("mobile_imei_two")
    private String mobile_imei_two;

    @Column(name = "mobile_owner_name")
    @JsonProperty("mobile_owner_name")
    private String mobile_owner_name;

    @Column(name = "mobile_ram_size")
    @JsonProperty("mobile_ram_size")
    private String mobile_ram_size;

    @Column(name = "mobile_rom_size")
    @JsonProperty("mobile_rom_size")
    private String mobile_rom_size;

    @Column(name = "mobile_owner_contact_number")
    @JsonProperty("mobile_owner_contact_number")
    private String mobile_owner_contact_number;

    @Column(name = "mobile_owner_aadhaar_number")
    @JsonProperty("mobile_owner_aadhaar_number")
    private String mobile_owner_aadhaar_number;

    @Column(name = "mobile_sale_date")
    @JsonProperty("mobile_sale_date")
    private String mobile_sale_date;

    @Column(name = "mobile_sale_price")
    @JsonProperty("mobile_sale_price")
    private String mobile_sale_price;

    @Column(name = "mobile_owner_pan_no")
    @JsonProperty("mobile_owner_pan_no")
    private String mobile_owner_pan_no;

    @Column(name = "quantity")
    @JsonProperty("quantity")
    private String quantity;

}
