package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Book;

//CrudRepository<Object,ID> (ID faisant référence à l'@ID dans le pojo)
public interface EmployeRepository extends JpaRepository<Book,String>{
	
	// @Query("SELECT e FROM Employe e") si besoin pour écrire une requête custom qui sera dans ma méthode en dessous.
	// JPA QUERY METHOD
	 public Iterable<Book> findByEmailAndNom(String email, String nom); //-> findBy = Select All & EmailAndNom = Where
	
	
}
