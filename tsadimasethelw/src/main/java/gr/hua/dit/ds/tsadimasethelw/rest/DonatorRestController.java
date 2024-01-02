package gr.hua.dit.ds.tsadimasethelw.rest;

import gr.hua.dit.ds.tsadimasethelw.dao.DonatorDAO;
import gr.hua.dit.ds.tsadimasethelw.entity.Donator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class DonatorRestController {

    @Autowired
    private DonatorDAO donatorDAO;

    @GetMapping("")
    public List<Donator> getDonators(){
        return donatorDAO.getDonators();
    }

    @PostMapping("")
    public Donator saveDonator(@RequestBody Donator donator){
        return donatorDAO.saveDonator(donator);
    }

}
