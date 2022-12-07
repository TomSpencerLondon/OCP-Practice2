package com.tomspencerlondon.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

  public static void main(String[] args) throws FileNotFoundException {
    createJsonFile("./src/main/resources/JSONExample.json");
  }

  private static void createJsonFile(String filePath) throws FileNotFoundException {
    JSONObject jsonObject = new JSONObject();

// putting data to JSONObject
    jsonObject.put("firstName", "John");
    jsonObject.put("lastName", "Smith");
    jsonObject.put("age", 25);
// for address data, first create LinkedHashMap
    Map<String, Comparable> address = new LinkedHashMap<String, Comparable>(4);
    address.put("streetAddress", "21 2nd Street");
    address.put("city", "New York");
    address.put("state", "NY");
    address.put("postalCode", 10021);

// putting address to JSONObject
    jsonObject.put("address", address);

// for phone numbers, first create JSONArray
    JSONArray jsonArray = new JSONArray();
    Map<String, Comparable> contact1 = new LinkedHashMap<String, Comparable>(2);
    contact1.put("type", "home");
    contact1.put("number", "212 555-1234");
// adding map to list
    jsonArray.add(contact1);

    Map<String, Comparable> contact2 = new LinkedHashMap<String, Comparable>(2);
    contact2.put("type", "fax");
    contact2.put("number", "212 555-1234");
// adding map to list
    jsonArray.add(contact2);

// putting phoneNumbers and ja (JSONArray or map ) to the jo ( JSONObject)
    jsonObject.put("phoneNumbers", jsonArray);

// writing JSON to file:"JSONExample.json" in cwd
    PrintWriter pw = new PrintWriter(filePath);
    pw.write(jsonObject.toJSONString()); //write jo (JSON object) to the file with the PrintWriter
    pw.flush();
    pw.close();
  }
}
