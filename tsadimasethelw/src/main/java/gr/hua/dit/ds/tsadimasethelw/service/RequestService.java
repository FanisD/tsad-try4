package gr.hua.dit.ds.tsadimasethelw.service;

import gr.hua.dit.ds.tsadimasethelw.dao.DonatorDAO;
import gr.hua.dit.ds.tsadimasethelw.entity.Request;
import gr.hua.dit.ds.tsadimasethelw.entity.Donator;
import gr.hua.dit.ds.tsadimasethelw.repository.RequestRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;
    @Autowired
    private DonatorDAO donatorDAO;

    @Transactional
    public void saveRequest(Request request, Integer donator_id){
        Donator donator = donatorDAO.getDonator(donator_id);
        request.setDonator(donator);
        requestRepository.save(request);
    }

    @Transactional
    public Request getRequest(int requestId) {
        return requestRepository.findById(requestId).get();
    }

    public void deleteRequest(int requestId){
        requestRepository.deleteById(requestId);
    }

}
