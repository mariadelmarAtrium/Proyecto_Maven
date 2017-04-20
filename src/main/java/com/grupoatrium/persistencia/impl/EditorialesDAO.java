package com.grupoatrium.persistencia.impl;

import com.grupoatrium.persistencia.impl.ConnectionMgr;

public class EditorialesDAO {
	private ConnectionMgr connMgr;

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}

	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}
	
	public String toString() {
		return "EditorialesDAO =" + this.connMgr.toString() +"\n";
				
	}
	
}
