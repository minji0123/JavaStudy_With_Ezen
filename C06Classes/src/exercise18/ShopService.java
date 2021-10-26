package exercise18;

public class ShopService {
	private ShopService() {
		
	}
	private static ShopService shopService = new ShopService();
	
	public static ShopService getInstance() {
		return ShopService.shopService;
	}
}
