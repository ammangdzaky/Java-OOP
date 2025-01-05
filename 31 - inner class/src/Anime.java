public class Anime {

    private String title;
    private String genre;
    private boolean isCompleted;

    public Anime(String title, String genre, boolean isCompleted) {
        this.title = title;
        this.genre = genre;
        this.isCompleted = isCompleted;
    }

    public class Waifu {

        private String name;
        private String type;

        public String animeOrigin = Anime.this.title;  // menagkses outer class-nya

        public Waifu(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
