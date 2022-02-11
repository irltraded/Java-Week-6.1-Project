class Main {
  public static void main(String[] args) {
    Order book = new Order(9348583458.99,true,"Express", "ship50");
    book.ship();
    System.out.println(book.calculateShipping());
  }
}