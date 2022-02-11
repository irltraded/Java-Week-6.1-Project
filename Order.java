public class Order {



  double billAmount;
  boolean isFilled;
  String shipping;
  String couponCode;

  public Order(double cost, boolean filled, String shippingMethod, String coupon) {
    billAmount = cost;
    isFilled = filled;
    shipping = shippingMethod;
    couponCode = coupon;

    if (billAmount >= 24.00) {
      System.out.println("High value item!");
    }
  }
  
  public void ship() {
    if (isFilled) {
     System.out.println("shipping");
    } else {
     System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    switch (shipping) {
      case "Regular":
        return 0;

      case "Express":
        return 1.50;

      case "ship50":
        return 0.85;

      default:
        return 0.50;
    }
  }

  /*
  public double calculateShipping() {
    if (shipping.equals ("Regular")) {
      return 0;
    } else if (shipping.equals ("Express")) {
        if (couponCode.equals("ship50")) {
          return 0.85;
        } else {
          return 1.75;
        }
    } else {
      return 0.50;
    }


  }
  */
}