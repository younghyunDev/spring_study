package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discoutprice;

    public Order(Long memberId, String itemName, int itemPrice, int discoutprice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discoutprice = discoutprice;
    }

    //계산 로직
    public int calculatePrice(){
        return itemPrice-discoutprice;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscoutprice() {
        return discoutprice;
    }

    public void setDiscoutprice(int discoutprice) {
        this.discoutprice = discoutprice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discoutprice=" + discoutprice +
                '}';
    }
}
