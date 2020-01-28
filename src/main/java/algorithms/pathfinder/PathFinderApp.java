package algorithms.pathfinder;

import java.util.*;

public class PathFinderApp {

    public static void main(String[] args) {
        int startIndex = new Random().nextInt(15);
        int endIndex = 0;
        do {
            endIndex = new Random().nextInt(15);
        } while (startIndex == endIndex);
        Slot startSlot = createSlot(startIndex);
        Slot endSlot = createSlot(endIndex);
        Slot firstSlot, secondSlot;
        List<Slot> possibleSlots;

        if (startSlot.getX() == endSlot.getX() && startSlot.getY() != endSlot.getY()) {
            System.out.println("------------ 1. With same X ----------");
            possibleSlots = getPossibleSlotsX(startSlot, endSlot);
            System.out.println("------------ Possible Stops -----------");
            printSlots(possibleSlots);

            Collections.shuffle(possibleSlots);

            System.out.println("------------ First Stop -----------");
            firstSlot = possibleSlots.get(0);
            printSlot(firstSlot);

            System.out.println("------------ Second Stop -----------");
            secondSlot = new Slot(firstSlot.getX(), firstSlot.getY());
            secondSlot.setY(endSlot.getY());
            printSlot(secondSlot);
            System.out.println("++++++++++++++++++++++++++++++++++++");
        } else if (startSlot.getY() == endSlot.getY() && startSlot.getX() != endSlot.getX()) {
            System.out.println("------------ 2. With same Y ----------");
            possibleSlots = getPossibleSlotsY(startSlot, endSlot);
            System.out.println("------------ Possible Stops -----------");
            printSlots(possibleSlots);

            Collections.shuffle(possibleSlots);

            System.out.println("------------ First Stop -----------");
            firstSlot = possibleSlots.get(0);
            printSlot(firstSlot);

            System.out.println("------------ Second Stop -----------");
            secondSlot = new Slot(firstSlot.getX(), firstSlot.getY());
            secondSlot.setX(endSlot.getX());
            printSlot(secondSlot);
            System.out.println("++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("---------- 3. Diagonal Slots ----------");
            possibleSlots = getPossibleSlotsX(startSlot, endSlot);
            possibleSlots.addAll(getPossibleSlotsY(startSlot, endSlot));

            possibleSlots = new ArrayList<>(new HashSet<>(possibleSlots));

            System.out.println("------------ Possible Stops -----------");
            printSlots(possibleSlots);

            Collections.shuffle(possibleSlots);

            System.out.println("------------ First Stop -----------");
            firstSlot = possibleSlots.get(0);
            printSlot(firstSlot);

            System.out.println("------------ Second Stop -----------");
            secondSlot = new Slot(firstSlot.getX(), firstSlot.getY());
            if (startSlot.getX() == firstSlot.getX()) {
                secondSlot.setX(endSlot.getX());
            } else {
                secondSlot.setY(endSlot.getY());
            }

            printSlot(secondSlot);
            System.out.println("++++++++++++++++++++++++++++++++++++");
        }

        System.out.println("Path : " + getSlotIndex(startSlot) + " -> " + getSlotIndex(firstSlot) + " -> " + getSlotIndex(secondSlot) + " -> " + getSlotIndex(endSlot));

    }

    public static List<Slot> getPossibleSlotsX(Slot startSlot, Slot endSlot) {
        List<Slot> xSlots = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (i == startSlot.getX() || i == endSlot.getX()) {
                continue;
            }
            xSlots.add(new Slot(i, startSlot.getY()));
        }
        return xSlots;
    }

    public static List<Slot> getPossibleSlotsY(Slot startSlot, Slot endSlot) {
        List<Slot> ySlots = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (i == startSlot.getY() || i == endSlot.getY()) {
                continue;
            }
            ySlots.add(new Slot(startSlot.getX(), i));
        }
        return ySlots;
    }

    private static void printSlot(Slot slot) {
        System.out.println("(" + slot.getX() + ", " + slot.getY() + ")");
    }

    private static void printSlots(List<Slot> slots) {
        for (Slot slot : slots) {
            System.out.println("(" + slot.getX() + ", " + slot.getY() + ")");
        }
    }

    private static int getSlotIndex(Slot slot) {
        return slot.getX() % 5 + slot.getY() * 5;
    }

    private static int getDistance(int slotIndex1, int slotIndex2) {
        return Math.abs(slotIndex1 % 5 - slotIndex2 % 5) + Math.abs(slotIndex1 / 5 - slotIndex2 / 5);
    }

    private static Slot createSlot(int slotIndex) {
        return new Slot(slotIndex % 5, slotIndex / 5);
    }

    enum Dir {
        HORIZONTAL(0), VERTICAL(1);

        private final int value;

        Dir(final int newValue) {
            value = newValue;
        }

        public int getValue() {
            return value;
        }
    }

}
