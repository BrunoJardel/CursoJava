package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order pedido = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.ENVIADO;
		
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		
		System.out.println(os2);
	}

}
