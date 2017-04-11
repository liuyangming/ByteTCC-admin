package org.bytesoft.bytetcc.admin;

import java.io.Serializable;

import javax.transaction.xa.Xid;

import org.bytesoft.compensable.CompensableInvocation;

public class CompensableDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private CompensableInvocation compensable;

	/* try-phase. */
	private String transactionResourceKey;
	private Xid transactionXid;
	private boolean tried;

	private String compensableResourceKey;
	private Xid compensableXid;
	private boolean confirmed;
	private boolean cancelled;

	public Xid getTransactionXid() {
		return transactionXid;
	}

	public void setTransactionXid(Xid transactionXid) {
		this.transactionXid = transactionXid;
	}

	public Xid getCompensableXid() {
		return compensableXid;
	}

	public void setCompensableXid(Xid compensableXid) {
		this.compensableXid = compensableXid;
	}

	public CompensableInvocation getCompensable() {
		return compensable;
	}

	public void setCompensable(CompensableInvocation compensable) {
		this.compensable = compensable;
	}

	public boolean isTried() {
		return tried;
	}

	public void setTried(boolean tried) {
		this.tried = tried;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public boolean isCoordinator() {
		return coordinator;
	}

	public void setCoordinator(boolean coordinator) {
		this.coordinator = coordinator;
	}

	public String getTransactionResourceKey() {
		return transactionResourceKey;
	}

	public void setTransactionResourceKey(String transactionResourceKey) {
		this.transactionResourceKey = transactionResourceKey;
	}

	public String getCompensableResourceKey() {
		return compensableResourceKey;
	}

	public void setCompensableResourceKey(String compensableResourceKey) {
		this.compensableResourceKey = compensableResourceKey;
	}

}
