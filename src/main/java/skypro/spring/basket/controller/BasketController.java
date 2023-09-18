package skypro.spring.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.spring.basket.service.BasketService;

import java.util.List;
@RestController
@RequestMapping("/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<Long> items) {
        basketService.add(items);
        return "Товары добавлены";
    }

    @GetMapping("/get")
    public List<Long> get() {
        return basketService.get();
    }
}
