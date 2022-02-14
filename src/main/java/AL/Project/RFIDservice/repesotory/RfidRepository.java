package AL.Project.RFIDservice.repesotory;

import AL.Project.RFIDservice.Model.RFID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RfidRepository extends JpaRepository<RFID, Long> {


    Optional<RFID> findByNum(int num);
}
