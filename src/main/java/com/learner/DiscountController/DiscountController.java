package com.learner.DiscountController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learner.DiscountModel.DiscountModel;
import com.learner.configuration.DiscountConfigurartion;

@RestController
@RequestMapping("/api")
public class DiscountController {
	
@Autowired
DiscountConfigurartion discountConfigurartion;
	
	@GetMapping("/discount")
	public DiscountModel get()
	{
		int min = discountConfigurartion.getMinimum();
		int max = discountConfigurartion.getMaximum();
		DiscountModel discount= new DiscountModel(min,max); 
		return discount;
	}

}
