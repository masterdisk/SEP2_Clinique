package serverSmartDoc.domain.mediator;

import serverSmartDoc.domain.model.Account;

public class ServerModelManager implements ServerModel {

	private DbsPersistance dbs;

	private Account account;

	private ServerProxy serverProxy;

	
	public ServerModelManager(DbsPersistance dbs) {
		this.dbs = dbs;
	}
	
	public boolean verifyLogin(String login, String password) {
		return dbs.verifyLogin(login, password);
	}
}
