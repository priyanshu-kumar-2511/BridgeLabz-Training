package com.jsondata.filterrecords;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJsonRecords {
	public static void main(String[] args) {
		String jsonArray = "[" + "{\"name\":\"Priyanshu\", \"age\":21}," + 
						"{\"name\":\"Sakshi\", \"age\":21},"
						+ "{\"name\":\"Ankesh\", \"age\":20}," + 
						"{\"name\":\"Aman\", \"age\":26}]";

		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode root = mapper.readTree(jsonArray);

			System.out.println("Records where age > 25:");
			for (JsonNode node : root) {
				if (node.path("age").asInt() > 25) {
					System.out.println("- " + node.path("name").asText() + " (" + node.path("age").asInt() + ")");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}