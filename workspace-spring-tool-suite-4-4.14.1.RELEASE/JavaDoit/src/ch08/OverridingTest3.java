package ch08;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은" + customerLee.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은" + customerKim.calcPrice(price) + "원입니다.");
		
		//가상메서드가 호출되는 형변환된 클래스 
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은" + vc.calcPrice(10000) + "원입니다.");

	}

}
