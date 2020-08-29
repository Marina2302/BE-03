package module02.lesson06;

import java.util.Scanner;

public class House {
    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String buildingType;
    private int lifeTime;

    public House() {
    }

    public House(int id, int apartmentNumber, int numberOfRooms) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.numberOfRooms = numberOfRooms;
    }

    public House(int id, int apartmentNumber, int floor, int numberOfRooms) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
    }

    public House(int id, int area, int floor, int numberOfRooms, String buildingType) {
        this.id = id;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.buildingType = buildingType;
    }

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms, String street, String buildingType, int lifeTime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.buildingType = buildingType;
        this.lifeTime = lifeTime;
    }

    public static void sortByNumberOfRooms(House[] houses) {
        System.out.println("Enter the number of rooms:");
        Scanner sc = new Scanner(System.in);
        int nor = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < houses.length; i++) {
            if (nor == houses[i].numberOfRooms) {
                System.out.println(houses[i]);
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("No such apartments found!");
        }
    }

    public static void sortByNumberOfRoomsAndFloor(House[] houses) {
        System.out.println("Enter the number of rooms:");
        Scanner sc = new Scanner(System.in);
        int nor = sc.nextInt();
        System.out.println("Enter the minimum floor:");
        int minf = sc.nextInt();
        System.out.println("Enter the maximum floor:");
        int maxf = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < houses.length; i++) {
            if (nor == houses[i].numberOfRooms) {
                if (minf <= houses[i].floor && maxf >= houses[i].floor) {
                    System.out.println(houses[i]);
                    isFound = true;
                }
            }
        }
        if (isFound == false) {
            System.out.println("No such apartments found!");
        }
    }

    public static void sortByArea(House[] houses) {
        System.out.println("Enter the area of the apartment:");
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        boolean isFound = false;
        for (int i = 0; i < houses.length; i++) {
            if (area < houses[i].area) {
                System.out.println(houses[i]);
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("No such apartments found!");
        }
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", street='" + street + '\'' +
                ", buildingType='" + buildingType + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
