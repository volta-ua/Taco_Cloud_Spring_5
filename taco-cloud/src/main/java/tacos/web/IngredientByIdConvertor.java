package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tacos.Ingredient;
import tacos.data.IngredientRepository;

@Component
public class IngredientByIdConvertor implements Converter<String, Ingredient>{
	
	
	private IngredientRepository ingredientRepo;
	
	@Autowired
	IngredientByIdConvertor(IngredientRepository ingredientRepo){
		this.ingredientRepo=ingredientRepo;
	}

	@Override
	public Ingredient convert(String id) {
		return ingredientRepo.findById(id);
	}
	
	
	

}
