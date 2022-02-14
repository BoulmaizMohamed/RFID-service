package AL.Project.RFIDservice.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RFID")
public class RFID {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private long Id;
    private int num;
   private String Debut;
   private String fin;

}
