package com.cricbuzz.Properties;

import java.io.IOException;

public class FileReaderManager {
	 
	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static ConfigFileReader configFileReader;
	 
	 private FileReaderManager() {
	 }
	 
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 
	 public ConfigFileReader getConfigReader() throws IOException {
	 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
	}
