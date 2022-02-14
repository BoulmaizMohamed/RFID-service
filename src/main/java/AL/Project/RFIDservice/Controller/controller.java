package AL.Project.RFIDservice.Controller;


import AL.Project.RFIDservice.Model.RFID;
import AL.Project.RFIDservice.repesotory.RfidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/RFID")
public class controller {
    @Autowired
    private RfidRepository RfidRepository;
    //add card
    @PostMapping("/Add")
    public RFID creeCard( RFID e) {
        return RfidRepository.save(e);
    }
    //get all card
    @GetMapping("/GetAll")
    public List<RFID> GetAllCard(){
        return RfidRepository.findAll();
    }
    //delete card par id
    @DeleteMapping (value = "/Delete")
    public void supprimerCard( Long id) {
        RfidRepository.deleteById(id);
    }
    //find card par id
    @GetMapping(value = "/findbyId")
    public Optional<RFID> getCardById(Long id) {
        return RfidRepository.findById(id);
    }
    //get card
    @GetMapping(value = "/findByCard")
    public Optional<RFID> getCardByNum( int num) {
        return RfidRepository.findByNum(num);
    }





}
