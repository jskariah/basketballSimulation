public class Simulation 
{
    private int age;
    private String position;
    private double points;
    private double assists;
    private double rebounds;
    private int draftPick;
    private int careerLength;
    private int careerMax;

    public Simulation(){
        age = 0;
        position = "PG";
        points = 0.0;
        assists = 0.0;
        rebounds = 0.0;
        draftPick = 0;
        careerLength = 0;
        careerMax = 0;
    }

    //Mutators
    public void changeAge(int a){
        age = a;
    }

    public void changePosition(String p){
        position = p;
    }

    public void changePoints(double p){
        points = p;
    }

    public void changeAssists(double a){
        assists = a;
    }

    public void changeRebounds(double r){
        rebounds = r;
    }

    public void simulateDraft(){
        if (position.equals("PG") || position.equals("Pg") || position.equals("pg"))
        {
            if (points >= 20.0 && assists >= 10.0){
                draftPick = (int) (Math.random() * 5) + 1;
            }
            if (points >= 15.0 && points <= 19.9){
                if (assists >= 5.0 && assists <= 9.9){
                draftPick = (int) (Math.random() * 20) + 6;
                }
            }
            if (points >= 10.0 && points <= 14.9){
                if (assists >= 0.0 && assists <= 4.9){
                draftPick = (int) (Math.random() * 30) + 21;
                }

            }
            else
            draftPick = (int) (Math.random() * 60) + 1;
        }
        if (position.equals("SG") || position.equals("Sg") || position.equals("sg"))
        {
            if (points >= 20.0 && assists >= 7.0){
                draftPick = (int) (Math.random() * 5) + 1;
            }
            if (points >= 15.0 && points <= 19.9){
                if (assists >= 3.0 && assists <= 6.9){
                draftPick = (int) (Math.random() * 20) + 6;
                }
            }
            if (points >= 10.0 && points <= 14.9){
                if (assists >= 0.0 && assists <= 2.9){
                draftPick = (int) (Math.random() * 30) + 21;
                }

            }
            else
            draftPick = (int) (Math.random() * 60) + 1;
        }
        if (position.equals("SF") || position.equals("Sf") || position.equals("sf"))
        {
            if (points >= 20.0 && assists >= 7.0){
                draftPick = (int) (Math.random() * 5) + 1;
            }
            if (points >= 15.0 && points <= 19.9){
                if (assists >= 4.0 && assists <= 6.9){
                draftPick = (int) (Math.random() * 15) + 6;
                }
            }
            if (points >= 10.0 && points <= 14.9){
                if (assists >= 0.0 && assists <= 3.9){
                draftPick = (int) (Math.random() * 10) + 21;
                }

            }
            else
            draftPick = (int) (Math.random() * 60) + 1;
        }
        if (position.equals("PF") || position.equals("Pf") || position.equals("pf"))
        {
            if (points >= 20.0 && rebounds >= 7.0){
                draftPick = (int) (Math.random() * 5) + 1;
            }
            if (points >= 15.0 && points <= 19.9){
                if (rebounds >= 5.0 && rebounds <= 6.9){
                draftPick = (int) (Math.random() * 15) + 6;
                }
            }
            if (points >= 10.0 && points <= 14.9){
                if (rebounds >= 0.0 && rebounds <= 4.9){
                draftPick = (int) (Math.random() * 10) + 21;
                }

            }
            else
            draftPick = (int) (Math.random() * 60) + 1;
        }
        if (position.equals("C") || position.equals("c"))
        {
            if (points >= 20.0 && rebounds >= 10.0){
                draftPick = (int) (Math.random() * 5) + 1;
            }
            if (points >= 15.0 && points <= 19.9){
                if (rebounds >= 6.0 && rebounds <= 9.9){
                draftPick = (int) (Math.random() * 15) + 6;
                }
            }
            if (points >= 10.0 && points <= 14.9){
                if (rebounds >= 0.0 && rebounds <= 5.9){
                draftPick = (int) (Math.random() * 10) + 21;
                }

            }
            else
            draftPick = (int) (Math.random() * 60) + 1;
        }

    }   

    public int getDraftPick(){
        return draftPick;
    }

    public void simulateYear(){
        age++;
        careerLength = (int) (Math.random() * 14) + 1;
        careerMax = careerLength + age;
        //Points
        if (draftPick <= 5)
        {
            points += (int) (Math.random() *1001) + 500;
        }
        if (draftPick >= 6 && draftPick <= 15)
        {
            points += (int) (Math.random() *1001) + 100;
        }
        if (draftPick >= 16 && draftPick <= 30)
        {
            points += (int) (Math.random() *1001) + 0;
        }
        if (draftPick >= 31 && draftPick <= 60)
        {
            points += (int) (Math.random() *1001) + 0;
        }
        //Assists
        if (position.equals("PG") || position.equals("Pg") || position.equals("pg"))
        {
            assists += (int) (Math.random() *349) + 1;
        }
        if (position.equals("SG") || position.equals("Sg") || position.equals("sg"))
        {
            assists += (int) (Math.random() *249) + 1;
        }
        if (position.equals("SF") || position.equals("Sf") || position.equals("sf"))
        {
            assists += (int) (Math.random() *199) + 1;
        }
        if (position.equals("PF") || position.equals("Pf") || position.equals("pf"))
        {
            assists += (int) (Math.random() *149) + 1;
        }
        if (position.equals("C") || position.equals("c"))
        {
            assists += (int) (Math.random() *99) + 1;
        }
        //Rebounds
        if (position.equals("PG") || position.equals("Pg") || position.equals("pg"))
        {
            rebounds += (int) (Math.random() *199) + 1;
        }
        if (position.equals("SG") || position.equals("Sg") || position.equals("sg"))
        {
            rebounds += (int) (Math.random() *249) + 1;
        }
        if (position.equals("SF") || position.equals("Sf") || position.equals("sf"))
        {
            rebounds += (int) (Math.random() *499) + 1;
        }
        if (position.equals("PF") || position.equals("Pf") || position.equals("pf"))
        {
            rebounds += (int) (Math.random() *700) + 1;
        }
        if (position.equals("C") || position.equals("c"))
        {
            rebounds += (int) (Math.random() *700) + 1;
        }
    }
    
    public String getYearStats(){
        return "|Points: " + points + "|Assists " + assists + "|Rebounds " + rebounds + "|";
    }

    public String isRetired(){
        if (age > careerMax)
        return "You are retired";

        else
        return " ";
    }

    public int getAge(){
        return age;
    }

    public int getCareerMax(){
        careerLength = (int) (Math.random() * 14) + 1;
        careerMax = careerLength + age;
        return careerMax;
    }

    























}
