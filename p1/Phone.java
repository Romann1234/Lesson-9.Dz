package p1;

public abstract class Phone implements Callable , informable {
    private String number;

    private String name;

    private String model;
    
    int weigth;




    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }



    public String getNumber() {
        return  number;

    }

    public void setNumber(String number) {
        this.number=number;
    }


    public Phone(String number, String model, int weigth) {
        this.number = number;
        this.model = model;
        this.weigth = weigth;

    }

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        System.out.println("Vhodiashiy zvonok");
    }

   /* public abstract void Info();*/











    }





