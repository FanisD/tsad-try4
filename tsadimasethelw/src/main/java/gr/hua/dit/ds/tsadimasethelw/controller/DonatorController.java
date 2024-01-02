package gr.hua.dit.ds.tsadimasethelw.controller;

import gr.hua.dit.ds.tsadimasethelw.dao.DonatorDAO;
import gr.hua.dit.ds.tsadimasethelw.entity.Donator;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("donator")
public class DonatorController {

    @Autowired
    private DonatorDAO donatorDao;

    @GetMapping("")
    public String showDonators(Model model){


        model.addAttribute("donators", donatorDao.getDonators());
        return "donators";
    }

    @GetMapping("/new")
    public String addDonator(Model model){
        Donator donator = new Donator();
        model.addAttribute("donator", donator);

        return "add_donator";

    }

    @GetMapping("{donator_id}")
    public String editDonator(@PathVariable Integer donator_id, Model model){
        Donator donator = donatorDao.getDonator(donator_id);
        model.addAttribute("donator", donator);
        return "add_donator";

    }

    @PostMapping("/new")
    public String saveDonator(@ModelAttribute("donator") Donator donator, Model model) {
        donatorDao.saveDonator(donator);
        model.addAttribute("donators", donatorDao.getDonators());
        return "donators";
    }

    @DeleteMapping("{donator_id}")
    public String deleteDonator(@PathVariable Integer donator_id){
        donatorDao.deleteDonator(donator_id);
        return "donators";
    }

}
