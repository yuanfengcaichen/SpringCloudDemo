package club.codeqi.Controller;

import club.codeqi.Service.ProductService;
import club.codeqi.bean.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public Object products() {
        List<product> ps = productService.listProducts();
        return ps;
    }
}
