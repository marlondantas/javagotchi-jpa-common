package br.com.luaazul.javagotchiJpaCommon.dao.javagotchi;

import javax.persistence.EntityManager;

import br.com.luaazul.javagotchiJpaCommon.dao.AbstractDAO;
import br.com.luaazul.javagotchiJpaCommon.model.tamagotchi.TipoBichoVirtual;

public class TipoBichoVirtualDAO extends AbstractDAO<Integer,TipoBichoVirtual>{


	public TipoBichoVirtualDAO() {
	}

	public TipoBichoVirtualDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
	
}
