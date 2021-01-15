package club.codeqi.service;

import club.codeqi.bean.product;
import club.codeqi.component.ProductClientRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<product> listProducts(){
        return productClientRibbon.listProdcuts();
    }
}
