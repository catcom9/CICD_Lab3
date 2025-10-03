package ie.atu.week3;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/bulkAdd")
    public List<Product> addBulk(@RequestBody List<@Valid Product> bulkList){
        productList.addAll(bulkList);
        return bulkList;
    }

    @GetMapping("/viewAll")
    public List<Product> viewAll(){
        return productList;
    }

    @GetMapping("/productCount")
    public int productCount() {
        return productList.size();
    }
}
