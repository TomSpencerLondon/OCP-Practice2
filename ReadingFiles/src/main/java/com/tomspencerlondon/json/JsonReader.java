package com.tomspencerlondon.json;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

  public static void main(String[] args) throws IOException, ParseException {
    Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
  }
}
