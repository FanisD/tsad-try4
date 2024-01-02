package gr.hua.dit.ds.tsadimasethelw.dao;

import gr.hua.dit.ds.tsadimasethelw.entity.Donator;
import gr.hua.dit.ds.tsadimasethelw.entity.Request;

import java.util.List;

public interface DonatorDAO {

    public List<Donator> getDonators();
    public Donator getDonator(Integer Donator_id);
    public Donator saveDonator(Donator donator);
    public void deleteDonator(Integer donator_id);

    public List<Request> getRequests(Integer donator_id);

}
