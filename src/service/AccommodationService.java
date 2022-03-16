package service;

import entity.Accommodation;
import entity.Camping;
import entity.Hotel;
import entity.Hotel4Stars;
import entity.Hotel5Stars;
import entity.Residence;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utility.Comparators;

public class AccommodationService {

    protected Scanner read = new Scanner(System.in);
    protected ArrayList<Accommodation> alojamientos = new ArrayList();
    protected ArrayList<Hotel> hoteles = new ArrayList();

    public Accommodation create() {
        Accommodation alojamiento = new Accommodation();

        alojamiento.setName(read.next());
        alojamiento.setAdress(read.next());
        alojamiento.setLocality(read.next());
        alojamiento.setInChargeMan(read.next());

        return alojamiento;
    }

    public void createListAccommodations() {
        //para no andar completando por teclado uno por uno completo todos los atributos a traves del constructor de cada clase
        Hotel4Stars hotel4Estrellas1 = new Hotel4Stars(false, "Food from Hell", 30, 20, 35, 2, 80, "Hot Love Hotel", "Fake Street 123", "San Francisco", "Egg Rodriguez");
        Hotel4Stars hotel4Estrellas2 = new Hotel4Stars(true, "Food from Heaven", 50, 35, 50, 5, 120, "Cold Love Hotel", "Real Street 321", "San Mephisto", "Huevo Rodrickson");
        Hotel5Stars hotel5Estrellas1 = new Hotel5Stars(1, 3, 3, true, "Los Pollos Hermanos", 50, 50, 80, 8, 200, "Canadian Hotel ", "Libertador 555", "Palermo", "Paca Garte");
        Hotel5Stars hotel5Estrellas2 = new Hotel5Stars(2, 4, 5, true, "Heisenberg Dream", 75, 65, 95, 11, 235, "Scandinavian Hotel ", "San Martin 2505", "Villa Urquiza", "Hector Sido");
        Camping camping1 = new Camping(8, 1, false, false, 120, "Naturaleza Viva", "Juan Bautista Alberdi 842", "Pueblo Liberal", "Javier Milei");
        Camping camping2 = new Camping(12, 2, true, true, 260, "Camping Los Alamos", "Aristobulo Del Valle 15", "Quilmes", "Mati Matero");
        Residence residencia1 = new Residence(4, true, false, false, 45, "Casa de pepe", "Ruta 210 N° 781", "Doomselar", "Jose Pugliese");
        Residence residencia2 = new Residence(6, false, true, true, 80, "Hostel In Chains", "Avenida Colon 299", "Mar Del Plata", "Layne Stanley");

        hoteles.add(hotel4Estrellas1);
        hoteles.add(hotel4Estrellas2);
        hoteles.add(hotel5Estrellas1);
        hoteles.add(hotel5Estrellas2);
        
        alojamientos.add(camping1);
        alojamientos.add(camping2);
        alojamientos.add(residencia1);
        alojamientos.add(residencia2);
        alojamientos.addAll(hoteles);
    }

    public void startMenu() {
        createListAccommodations();
        System.out.println("Welcome to the accommodations. ¿Which are your query?");
        System.out.println("1) see all accommodation");
        System.out.println("2) see all hotels from cheapest to expensive");
        System.out.println("3) see all campings with restaurants");
        System.out.println("4) see all residences with discount");
        int answer = read.nextInt(), cont = 0;

        switch (answer) {
            case 1:
                for (Accommodation alojamiento : alojamientos) {
                    cont++;
                    System.out.println(cont + " " + alojamiento + "\n");
                }
                break;
            case 2:
                Collections.sort(hoteles, Comparators.orderForMajorPrice);
                for (Hotel hotel : hoteles) {
                    System.out.println(hotel + "\n");
                }
                break;
            case 3:
                for (Accommodation alojamiento : alojamientos) {
                    if (alojamiento instanceof Camping) {
                        if (((Camping) alojamiento).isRestaurant()) {
                            System.out.println(alojamiento);
                        }
                    }
                }
                break;
            case 4:
                for (Accommodation alojamiento : alojamientos) {
                    if (alojamiento instanceof Residence) {
                        if (((Residence) alojamiento).isGuildsDiscount()) {
                            System.out.println(alojamiento);
                        }
                    }
                }
                break;
        }

    }
}
