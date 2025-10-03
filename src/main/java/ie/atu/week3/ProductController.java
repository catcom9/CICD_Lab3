package ie.atu.week3;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private List<Product> productList = new ArrayList<>();

    @PutMapping("/add")
    public Product addProduct(@RequestBody @Valid Product newProduct){
        productList.add(newProduct);
        return newProduct;
    }
}
