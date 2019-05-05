package Menu;

import Dao.Dao;
import Dao.DaoArrayList;

public abstract class ItemdeMenu {
	
	protected Dao dao;
	
	public ItemdeMenu() {
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}
