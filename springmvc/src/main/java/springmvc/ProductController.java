package springmvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/product")
	public String showProduct(ModelMap model) {
		Product p = new Product();
		p.setName("iPhone 14 Pro");
		p.setPrice(130000);
		p.setDiscount(10000);
		model.put("product", p);
		return "showProduct";
	}

	@GetMapping("/productsList")
	public String showProductList(ModelMap model) {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("iPhone 14 Pro", 130000, 10000));
		products.add(new Product("Apple Watch", 45000, 5000));
		products.add(new Product("Air Pods", 35000, 3000));
		model.put("products", products);
		return "showProductsList";
	}
}
