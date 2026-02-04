package com.jsondata.filterrecords;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFilter {
	public static void main(String[] args) throws Exception {
		String jsonInput = "[{\"name\":\"Ankesh\", \"age\":20}, {\"name\":\"Priyanshu\", \"age\":30}, {\"name\":\"Sakshi\", \"age\":28}]";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(jsonInput);

		System.out.println("Users older than 25:");
		for (JsonNode node : root) {
			if (node.get("age").asInt() > 25) {
				System.out.println(node.get("name").asText() + " (" + node.get("age") + ")");
			}
		}
	}
}