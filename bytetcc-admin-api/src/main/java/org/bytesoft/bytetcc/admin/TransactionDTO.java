package org.bytesoft.bytetcc.admin;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.xa.Xid;

public class TransactionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object locationKey;
	private Xid transactionXid;
	private boolean coordinator;
	private Object propagatedBy;

	private int compensableStatus; // active, committing, committed, rollingback, rolledback
	private Map<String, Serializable> variables = new HashMap<String, Serializable>();

	private List<CoordinatorDTO> coordinators = new ArrayList<CoordinatorDTO>();
	private List<CompensableDTO> compensables = new ArrayList<CompensableDTO>();
	private List<TransactionDTO> transactions = new ArrayList<TransactionDTO>();

	public Object getLocationKey() {
		return locationKey;
	}

	public void setLocationKey(Object locationKey) {
		this.locationKey = locationKey;
	}

	public Xid getTransactionXid() {
		return transactionXid;
	}

	public void setTransactionXid(Xid transactionXid) {
		this.transactionXid = transactionXid;
	}

	public boolean isCoordinator() {
		return coordinator;
	}

	public void setCoordinator(boolean coordinator) {
		this.coordinator = coordinator;
	}

	public Object getPropagatedBy() {
		return propagatedBy;
	}

	public void setPropagatedBy(Object propagatedBy) {
		this.propagatedBy = propagatedBy;
	}

	public int getCompensableStatus() {
		return compensableStatus;
	}

	public void setCompensableStatus(int compensableStatus) {
		this.compensableStatus = compensableStatus;
	}

	public Map<String, Serializable> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Serializable> variables) {
		this.variables = variables;
	}

	public List<CoordinatorDTO> getCoordinators() {
		return coordinators;
	}

	public void setCoordinators(List<CoordinatorDTO> coordinators) {
		this.coordinators = coordinators;
	}

	public List<CompensableDTO> getCompensables() {
		return compensables;
	}

	public void setCompensables(List<CompensableDTO> compensables) {
		this.compensables = compensables;
	}

	public List<TransactionDTO> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDTO> transactions) {
		this.transactions = transactions;
	}

}
