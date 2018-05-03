/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.galdo.tierra.dao.impl;

import ar.com.galdo.tierra.dao.EspecialidadDao;
import ar.com.galdo.tierra.users.model.Especialidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Softlogia PC
 */
@Repository
@Transactional
public class EspecialidadDaoImpl implements EspecialidadDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private EntityManager em;

    private CriteriaBuilder cb;

    @Override
    public List<Especialidad> findAll() {
        cb = em.getCriteriaBuilder();
        CriteriaQuery<Especialidad> query = cb.createQuery(Especialidad.class);
        Root<Especialidad> root = query.from(Especialidad.class);

        //Session session = sessionFactory.getCurrentSession();
        //Criteria criteria = session.createCriteria(Especialidad.class);
        //return criteria.list();
        return em.createQuery(query.select(root)).getResultList();
    }

}
