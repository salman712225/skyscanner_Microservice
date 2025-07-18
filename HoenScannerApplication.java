private List<SearchResult> searchResults = new ArrayList<>();

@Override
public void run(HoenScannerConfiguration configuration, Environment environment) throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    List<SearchResult> hotels = mapper.readValue(
        getClass().getClassLoader().getResourceAsStream("hotels.json"),
        new TypeReference<List<SearchResult>>() {}
    );
    List<SearchResult> cars = mapper.readValue(
        getClass().getClassLoader().getResourceAsStream("rental_cars.json"),
        new TypeReference<List<SearchResult>>() {}
    );

    searchResults.addAll(hotels);
    searchResults.addAll(cars);

    environment.jersey().register(new SearchResource(searchResults));
}
