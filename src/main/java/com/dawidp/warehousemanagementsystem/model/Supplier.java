package com.dawidp.warehousemanagementsystem.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id", nullable = false)
	private Long supplierId;
	@Column(name = "company_name")
	@NaturalId
	private String companyName;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Address address;
	@JsonBackReference
	@OneToMany(mappedBy = "supplier")
	private List<Supply> supplyList;

}
