package pattern.resposibility;

public abstract class Approver {
    Approver approver; // next handler
    String name;

    public Approver(String name) {
        this.name = name;
    }
    public void setApprover(Approver approver){
        this.approver = approver;
    }
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
