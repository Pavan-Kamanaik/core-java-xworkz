class Library {
    int libraryId;
    String libraryName;
    String location;
    int capacity;
    int booksAvailable;

    public Library(int libraryId, String libraryName, String location, int capacity, int booksAvailable) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.location = location;
        this.capacity = capacity;
        this.booksAvailable = booksAvailable;

        System.out.println("Library ID: " + libraryId);
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books Available: " + booksAvailable);
        System.out.println("\n");
    }
}
