package pattern.resposibility;

public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000){
            System.out.println("id = "+ purchaseRequest.getId() + " is handled by" + this.name);
        } else {
            approver.processRequest((purchaseRequest));
        }
    }
}
