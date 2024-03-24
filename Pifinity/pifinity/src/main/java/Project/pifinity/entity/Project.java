package Project.pifinity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Project
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idP;

    private String Title;
    private String description;
    private Float value;
    @Temporal(TemporalType.DATE)
    private LocalDate dateP;
    private Float interestRate;
    private Float devidend;
    private String category;
    @Enumerated(EnumType.STRING)
    private StatusProject status;



}
