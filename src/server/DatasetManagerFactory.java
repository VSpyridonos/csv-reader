package server;

public class DatasetManagerFactory {
	
	DatasetManager dManager = new DatasetManager();
	
	public DatasetManagerFactory() {
		;
	}

	public IDatasetManager create(String className) {
		switch(className) {
			case "DatasetManager": return dManager;
			default: return null;
		}

	}
}
