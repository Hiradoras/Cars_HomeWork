public class CreateCarImp implements CreateCar {
    @Override
    public void CreateCars(Integer minMass, Integer maxMass) {
        Lamborghini lamborghini = new Lamborghini();
        lamborghini.setMass(60);
        Audi audi = new Audi();
        audi.setMass(45);
        BMW bmw = new BMW();
        bmw.setMass(30);
        if (minMass<=bmw.getMass()&&maxMass>=bmw.getMass()){
            BMW carBmw = new BMW();
        }
        else if (minMass<=audi.getMass()&&maxMass>=bmw.getMass()){
            Audi carAudi = new Audi();
        }
        else if (minMass<=lamborghini.getMass()&&maxMass>=bmw.getMass()){
            Lamborghini carLamborghini = new Lamborghini();
        }
    }
}
