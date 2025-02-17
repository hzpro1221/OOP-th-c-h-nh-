package tiDo.PurchaseHistoryWarehouse;

import java.util.ArrayList;
import java.util.List;

import tiDo.Transaction.Transaction;

public class PurchaseHistoryWarehouse {
    private List<Transaction> listOfTransaction;

    public PurchaseHistoryWarehouse() {
        this.listOfTransaction = new ArrayList<>();
    }

    public boolean addTransaction(Transaction transaction) {
        return listOfTransaction.add(transaction);
    }

    public void displayTransaction(Transaction transaction) {
        transaction.display();
    }

    public boolean changeApprovalCondition(String transactionID, boolean newCondition) {
        for (Transaction transaction : listOfTransaction) {
            if (transaction.getTransactionID().equals(transactionID)) {
                transaction.setApprovalCondition(newCondition);
                return true;
            }
        }
        return false;
    }
}
