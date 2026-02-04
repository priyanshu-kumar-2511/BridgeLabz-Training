package com.jsondata.jsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

import com.jsondata.jsonarray.Car;
public class ListToJson {
	public static void main(String[] args) {
		try {
			List<Car> carList = new ArrayList<>();
			carList.add(new Car("Toyota", "Fortuner", 2030));
			carList.add(new Car("Mahindra", "Scorpio", 2028));

			ObjectMapper mapper = new ObjectMapper();
			String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(carList);

			System.out.println(jsonArray);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}