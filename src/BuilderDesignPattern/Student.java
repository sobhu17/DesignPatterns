package BuilderDesignPattern;

public class Student {
    private String name;
    private String batch;
    private int psp;
    private String email;
    private String university;
    private int age;
    private int gradYear;


    public static Builder createBuilder(){
        return new Builder();
    }

    private Student(Builder b){
        this.name = b.getName();
        this.batch = b.getBatch();
        this.psp = b.getPsp();
        this.email = b.getEmail();
        this.university = b.getUniversity();
        this.age = b.getAge();
        this.gradYear = b.getGradYear();
    }


    public static class Builder {
        private String name;
        private String batch;
        private int psp;
        private String email;
        private String university;
        private int age;
        private int gradYear;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getPsp() {
            return psp;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getUniversity() {
            return university;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }


        public Student Build(){
            // Do validation task here

            return new Student(this);
        }
    }
}
