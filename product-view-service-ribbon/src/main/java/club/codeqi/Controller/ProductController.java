package club.codeqi.Controller;

import club.codeqi.bean.product;
import club.codeqi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public Object products(Model m){
        List<product> ps = productService.listProducts();
        m.addAttribute("ps", ps);
        return "products";
    }
}
