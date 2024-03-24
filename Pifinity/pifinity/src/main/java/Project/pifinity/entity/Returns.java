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
public class Returns {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;

    private Float income;
    private Float totalInvestment;
    private LocalDate dateR;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;


}
