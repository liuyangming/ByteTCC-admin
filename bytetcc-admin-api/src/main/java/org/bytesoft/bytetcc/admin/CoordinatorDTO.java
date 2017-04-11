package org.bytesoft.bytetcc.admin;

import java.io.Serializable;

public class CoordinatorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String identifier;
	private boolean completed;
	private boolean readonly;
	private boolean committed;
	private boolean rolledback;
	private boolean heuristic;
	private boolean recovered;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public boolean isCommitted() {
		return committed;
	}

	public void setCommitted(boolean committed) {
		this.committed = committed;
	}

	public boolean isRolledback() {
		return rolledback;
	}

	public void setRolledback(boolean rolledback) {
		this.rolledback = rolledback;
	}

	public boolean isHeuristic() {
		return heuristic;
	}

	public void setHeuristic(boolean heuristic) {
		this.heuristic = heuristic;
	}

	public boolean isRecovered() {
		return recovered;
	}

	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}

}
