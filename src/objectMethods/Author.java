package objectMethods;

    public class Author {
        private final String name;
        private final String lastName;

        public Author(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName(){
            return this.name;
        }
        public String getLastName(){
            return this.lastName;
        }

        public String toString() {
            return this.name + " "+ this.lastName;

        }
        @Override
        public boolean equals(Object other){
            if(this.getClass() != other.getClass()){
                return false;
            }
            Author x = (Author) other;
            return lastName.equals(x.lastName) && name.equals(x.name);}

        @Override
        public int hashCode() {
            return java.util.Objects.hash(name,lastName);
        }
    }


