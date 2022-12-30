package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
	private final CarServiceImpl carService;

	public CarController(CarServiceImpl carService) {
		this.carService = carService;
	}

	@GetMapping("/cars")
	public String getCar(@RequestParam(value = "num", defaultValue = "3") int num, ModelMap model) {
		model.addAttribute("cars", carService.carList(num));
		return "cars";
	}
}