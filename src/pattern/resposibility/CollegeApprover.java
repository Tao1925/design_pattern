package pattern.resposibility;

public class CollegeApprover extends Approver{

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000){
            System.out.println("id = "+ purchaseRequest.getId() + " is handled by" + this.name);
        } else {
            approver.processRequest((purchaseRequest));
        }
    }
}
