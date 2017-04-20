package com.grupoatrium.persistencia.impl;

import com.grupoatrium.persistencia.impl.ConnectionMgr;


public class LibrosDAO {
	private ConnectionMgr connMgr;

	public ConnectionMgr getConnMgr() {
		return connMgr;
	}

	public void setConnMgr(ConnectionMgr connMgr) {
		this.connMgr = connMgr;
	}
	public String toString() {
		return "LibrosDAO =" + this.connMgr.toString() +"\n";
				
	}
}
