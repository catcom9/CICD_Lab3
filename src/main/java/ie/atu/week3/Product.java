package ie.atu.week3;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
}
