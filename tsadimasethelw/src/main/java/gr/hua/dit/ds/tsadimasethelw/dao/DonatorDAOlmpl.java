package gr.hua.dit.ds.tsadimasethelw.dao;

import gr.hua.dit.ds.tsadimasethelw.entity.Donator;
import gr.hua.dit.ds.tsadimasethelw.entity.Request;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import java.util.List;

public class DonatorDAOlmpl implements DonatorDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Donator> getDonators() {
        TypedQuery<Donator> query = entityManager.createQuery("from Donator", Donator.class);
        return query.getResultList();
    }

    @Override
    public Donator getDonator(Integer donator_id) {
        return entityManager.find(Donator.class, donator_id);
    }

    @Override
    @Transactional
    public Donator saveDonator(Donator donator) {
        System.out.println("Donator ID: " + donator.getId());
        if (donator.getId() == null) {
            entityManager.persist(donator);
        } else {
            entityManager.merge(donator);
        }
        return donator;
    }

    @Override
    @Transactional
    public void deleteDonator(Integer donator_id) {
        System.out.println("Deleting donator with ID: " + donator_id);
        entityManager.remove(entityManager.find(Donator.class, donator_id));
    }

    @Override
    @Transactional
    public List<Request> getRequests(Integer donator_id) {
        Donator donator = entityManager.find(Donator.class, donator_id);
        return donator.getRequests();
    }

}
