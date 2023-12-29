public class Player {
    private String name;
    private String surname;
    private int number;
    private String position;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public Player(){

    }

    public Player(String name, String surname, int number, String position){
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.position = position;
    }

}
