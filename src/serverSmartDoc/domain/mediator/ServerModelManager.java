package serverSmartDoc.domain.mediator;

import serverSmartDoc.domain.model.Account;

public class ServerModelManager implements ServerModel {

	private DbsPersistance dbsPersistance;

	private Account account;

	private ServerProxy serverProxy;

}
