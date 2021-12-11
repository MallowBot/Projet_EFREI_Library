package Projet.abstracts;

import java.util.ArrayList;

public interface DAO<TEntity> {
	/*
	 * CRUD
	 * CREATE (ADD)
	 * RETRIEVE (GET)
	 * UPDATE (UPDATE)
	 * DELETE (REMOVE)
	 */
	
	boolean add(TEntity e);
	TEntity getById(int id);
	ArrayList<TEntity> list();
	boolean update(int id, TEntity e);
	boolean remove(int id);
}
