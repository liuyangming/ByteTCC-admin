package org.bytesoft.bytetcc.admin.service;

import java.util.List;

import org.bytesoft.bytetcc.admin.TransactionDTO;

public interface AgentService {

	public List<TransactionDTO> getAllTransactionList();

	public List<TransactionDTO> getActiveTransactionList();

	public List<TransactionDTO> getErrorTransactionList();

}
