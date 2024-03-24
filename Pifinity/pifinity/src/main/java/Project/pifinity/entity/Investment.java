package Project.pifinity.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Investment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idI;

    @Temporal(TemporalType.DATE)
    private LocalDate Idate;
    private Float mount;
    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;
}
