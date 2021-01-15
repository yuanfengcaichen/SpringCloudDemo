package club.codeqi.Service;

import club.codeqi.bean.product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<product> listProducts(){
        List<product> ps = new ArrayList<>();
        ps.add(new product(1,"product a from port:"+port, 50));
        ps.add(new product(2,"product b from port:"+port, 150));
        ps.add(new product(3,"product c from port:"+port, 250));
        return ps;
    }
}