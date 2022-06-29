public class People extends Animal{
    public static class Man{
        protected String name;
        protected int age;
        protected String address;

        public Man(){
            this.name = "Name";
            this.age = 20;
            this.address = "None";
        }
        public Man(String name){
            this.name = name;
            this.age = 20;
            this.address = "None";
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "None";
        }
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getAddress() {
            return address;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static class Woman{
        protected String name;
        protected int age;
        protected String address;

        public Woman(){
            this.name = "Name";
            this.age = 20;
            this.address = "None";
        }
        public Woman(String name){
            this.name = name;
            this.age = 20;
            this.address = "None";
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "None";
        }
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }
    }
}
