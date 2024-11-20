package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Livre;

@Repository
public interface ILivre extends JpaRepository<Livre, Long> {};
