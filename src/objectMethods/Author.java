package objectMethods;

    public class Author {
        String name;
        String lastName;

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
            return name.equals(x.lastName);}
    }


