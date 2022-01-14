class Tweet {
    int age
    String name

    Tweet(int age, String name){
        this.age = age
        this.name = name
    }

    @Override
    String toString() {
        return "My name is ${this.name} and i have ${this.age} years."
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }
}
