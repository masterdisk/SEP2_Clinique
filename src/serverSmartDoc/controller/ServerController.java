package serverSmartDoc.controller;

import serverSmartDoc.view.View;
import serverSmartDoc.domain.mediator.ServerModel;

public class ServerController {

	private View view;

	private ServerModel serverModel;
	
	public ServerController(View view, ServerModel serverModel) {
		this.view = view;
		this.serverModel = serverModel;
	}

}
