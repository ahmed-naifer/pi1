package Project.pifinity.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idW;
    @Enumerated(EnumType.STRING)
    private  Status walletstatus;
    private float balance;
    private String ownerName ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "wallet")
    @JsonBackReference // Correction de mappedBy
    private List<Investment> investments = new ArrayList<>();
}
