public class MyStatic {
    private String description;

    public static class MyBean{

        private int id;
        private String name;
        public String var;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

}
